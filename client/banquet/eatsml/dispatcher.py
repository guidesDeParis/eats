"""Module for talking to an EATS server."""

__docformat__ = 'restructuredtext'

import cookielib
from copy import deepcopy
from os.path import abspath, dirname, join
from StringIO import StringIO
import sys
import urllib
import urllib2
import urlparse

from lxml import etree

from MultipartPostHandler import MultipartPostHandler
import parser


# See http://bugs.python.org/issue9639 for the bug this is working
# around.
if sys.version_info[:2] == (2, 6) and sys.version_info[2] >= 6:
    def fixed_http_error_401(self, req, fp, code, msg, headers):
        url = req.get_full_url()
        response = self.http_error_auth_reqed('www-authenticate', url, req,
                                              headers)
        self.retried = 0
        return response

    urllib2.HTTPBasicAuthHandler.http_error_401 = fixed_http_error_401


class Dispatcher (object):

    __urls = {
        'base_document': 'export/eatsml/base/',
        'import': 'import/',
        'lookup_name': 'search/eatsml/?%s'}
    
    def __init__ (self, base_url, username, password, http_username=None,
                  http_password=None):
        self.__base_url = base_url
        self.__username = username
        self.__password = password
        self.__base_doc = None
        self.__csrf_token = None
        self.cj = cookielib.CookieJar()
        handlers = [urllib2.HTTPCookieProcessor(self.cj),
                    MultipartPostHandler]
        if http_username is not None:
            password_manager = urllib2.HTTPPasswordMgrWithDefaultRealm()
            # Since the base URL may not encompass the login URL
            # (since the base URL is for the EATS application, and not
            # the Django installation as a whole), just use the domain
            # name as the authentication super URL.
            url_pieces = urlparse.urlparse(self.base_url)
            url = urlparse.urlunparse(url_pieces[0:2] + ('', '', '', ''))
            password_manager.add_password(None, url, http_username,
                                          http_password)
            basic_auth_handler = urllib2.HTTPBasicAuthHandler(password_manager)
            handlers.append(basic_auth_handler)
        opener = urllib2.build_opener(*handlers)
        urllib2.install_opener(opener)

    @property
    def base_url (self):
        """Return the base URL for the EATS server."""
        return self.__base_url

    @property
    def username (self):
        """Return the username."""
        return self.__username

    @property
    def password (self):
        """Return the password."""
        return self.__password

    def login (self):
        """Log in to the EATS server.

        Raise an exception if authentication is not successful.

        """
        # Try first to get the base document, which should only be
        # available once logged in. If not logged in, it will redirect
        # to the login page.
        url = urlparse.urljoin(self.base_url, self.__urls['base_document'])
        handle = urllib2.urlopen(url)
        login_url = handle.geturl()
        xml_tree = etree.parse(handle, parser.parser)
        login = xml_tree.getroot()
        try:
            self.__csrf_token = login.xpath('//*[@name = "csrfmiddlewaretoken"][1]/@value')[0]
        except IndexError:
            # No csrfmiddlewaretoken input found, which may simply be
            # because the server is pre-Django 1.2. Whatever the
            # reason, do not fail here.
            self.__csrf_token = ''
        data = {'username': self.username, 'password': self.password,
                'csrfmiddlewaretoken': self.__csrf_token}
        encoded_data = urllib.urlencode(data)
        handle = urllib2.urlopen(login_url, encoded_data)
        if handle.geturl() == login_url:
            # A successful login redirects to a different page.
            raise Exception('Failed to authenticate to EATS server')
    
    def get_base_document (self):
        """Return an `eatsml.Document` instance containing only the
        infrastructural elements."""
        url = urlparse.urljoin(self.base_url, self.__urls['base_document'])
        self.__base_doc = self.__get_xml_from_server(url)
        return self.__base_doc

    def get_base_document_copy (self):
        """Return a deep copy of the base document."""
        return deepcopy(self.__base_doc)

    def import_document (self, document, import_message):
        """Import `document` into EATS. Return the URL of the
        resulting page.

        Arguments:

        - `document`: EATSML document
        - `import_message`: string description of import

        """
        string = etree.tostring(document, encoding='utf-8', pretty_print=True)
        fh = StringIO(string)
        params = {'description': import_message,
                  'import_file': fh,
                  'csrfmiddlewaretoken': self.__csrf_token}
        url = urlparse.urljoin(self.base_url, self.__urls['import'])
        handle = urllib2.urlopen(url, params)
        return handle.geturl()

    def get_annotated_import (self, base_url):
        """Return a `CollectionElementClass` instance of the annotated
        import at `base_url`.

        Arguments:

        - `base_url`: string URL of the import

        """
        url = urlparse.urljoin(base_url, 'annotated/')
        return self.__get_xml_from_server(url)

    def look_up_name (self, name):
        """Return a `CollectionElementClass` instance of the results of
        looking up `name` on the EATS server.

        Arguments:
        
        - `name`: a unicode string to look up

        """
        parameters = {'name': name.encode('utf-8')}
        encoded_parameters = urllib.urlencode(parameters)
        url = urlparse.urljoin(self.base_url, self.__urls['lookup_name'] %
                               encoded_parameters)
        return self.__get_xml_from_server(url)

    def look_up_record (self, record_id, authority_id):
        """Return a `CollectionElementClass` instance of the results
        of looking up `record_id` and `authority_id` on the EATS server.

        Arguments:

        - `record_id`: unicode string record ID to look up
        - `authority_id`: string authority ID for `key`

        """
        parameters = {'record_id': record_id.encode('utf-8'),
                      'authority': authority_id}
        encoded_parameters = urllib.urlencode(parameters)
        url = urlparse.urljoin(self.base_url, self.__urls['lookup_name'] %
                               encoded_parameters)
        return self.__get_xml_from_server(url)                      

    def get_edit_url (self, key):
        """Return the full URL for the edit page for entity, based on `key`.

        :param key: key of the entity
        :type key: `str` URL
        :rtype: `str`

        """
        return urlparse.urljoin(key, 'edit/')

    def __get_xml_from_server (self, url):
        """Return an `lxml.Element` instance from the results of
        requesting `url` from the EATS server.

        In the case of EATSML being returned from the server, the
        element returned is a `parser.CollectionElementClass`
        instance.
        
        Arguments:

        - `url`: string URL

        """
        handle = urllib2.urlopen(url)
        xml_tree = etree.parse(handle, parser.parser)
        return xml_tree.getroot()
