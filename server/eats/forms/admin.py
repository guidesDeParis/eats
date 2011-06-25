from django import forms

from eats.constants import AUTHORITY_TYPE_IRI, CALENDAR_TYPE_IRI, DATE_PERIOD_TYPE_IRI, DATE_TYPE_TYPE_IRI, ENTITY_RELATIONSHIP_TYPE_TYPE_IRI, ENTITY_TYPE_TYPE_IRI, LANGUAGE_TYPE_IRI, NAME_TYPE_TYPE_IRI, SCRIPT_TYPE_IRI


class AdminForm (forms.Form):

    name = forms.CharField(max_length=100)
    
    def __init__ (self, topic_map, topic_id, *args, **kwargs):
        """Initialise the form.

        :param topic_map: the EATS Topic Map
        :type topic_map: `TopicMap`
        :param topic_id: the `Identifier` id of the topic
        :type topic_id: integer or None

        """
        self.topic_map = topic_map
        self.topic_id = topic_id
        super(AdminForm, self).__init__(*args, **kwargs)


class AuthorityForm (AdminForm):

    def clean_name (self):
        name = self.cleaned_data['name']
        if self.topic_map.topic_exists(AUTHORITY_TYPE_IRI, name, self.topic_id):
            raise forms.ValidationError(
                'The name of the authority must be unique')
        return name


class CalendarForm (AdminForm):

    def clean_name (self):
        name = self.cleaned_data['name']
        if self.topic_map.topic_exists(CALENDAR_TYPE_IRI, name, self.topic_id):
            raise forms.ValidationError(
                'The name of the calendar must be unique')
        return name


class DatePeriodForm (AdminForm):

    def clean_name (self):
        name = self.cleaned_data['name']
        if self.topic_map.topic_exists(DATE_PERIOD_TYPE_IRI, name,
                                       self.topic_id):
            raise forms.ValidationError(
                'The name of the date period must be unique')
        return name


class DateTypeForm (AdminForm):

    def clean_name (self):
        name = self.cleaned_data['name']
        if self.topic_map.topic_exists(DATE_TYPE_TYPE_IRI, name,
                                       self.topic_id):
            raise forms.ValidationError(
                'The name of the date type must be unique')
        return name


class EntityRelationshipForm (AdminForm):

    reverse_name = forms.CharField(max_length=100)
    
    def clean_name (self):
        name = self.cleaned_data['name']
        if self.topic_map.topic_exists(ENTITY_RELATIONSHIP_TYPE_TYPE_IRI, name,
                                       self.topic_id):
            raise forms.ValidationError(
                'The name of the entity relationship type must be unique')
        return name

    def clean_reverse_name (self):
        name = self.cleaned_data['reverse_name']
        if self.topic_map.topic_exists(ENTITY_RELATIONSHIP_TYPE_TYPE_IRI, name,
                                       self.topic_id):
            raise forms.ValidationError(
                'The reverse name of the entity relationship type must be unique')
        return name


class EntityTypeForm (AdminForm):

    def clean_name (self):
        name = self.cleaned_data['name']
        if self.topic_map.topic_exists(ENTITY_TYPE_TYPE_IRI, name,
                                       self.topic_id):
            raise forms.ValidationError(
                'The name of the entity type must be unique')
        return name
    

class LanguageForm (AdminForm):

    code = forms.CharField(max_length=3)

    def clean_code (self):
        code = self.cleaned_data['code']
        # QAZ: Need to ensure that the code is unique, along with the
        # name. topic_exists checks on the admin name, and so is not
        # suitable.
        return code

    def clean_name (self):
        name = self.cleaned_data['name']
        if self.topic_map.topic_exists(LANGUAGE_TYPE_IRI, name, self.topic_id):
            raise forms.ValidationError(
                'The name of the language must be unique')
        return name


class NameTypeForm (AdminForm):

    def clean_name (self):
        name = self.cleaned_data['name']
        if self.topic_map.topic_exists(NAME_TYPE_TYPE_IRI, name, self.topic_id):
            raise forms.ValidationError(
                'The name of the name type must be unique')
        return name

    

class ScriptForm (AdminForm):

    code = forms.CharField(max_length=4)

    def clean_code (self):
        code = self.cleaned_data['code']
        # QAZ: Need to ensure that the code is unique, along with the
        # name. topic_exists checks on the admin name, and so is not
        # suitable.
        return code

    def clean_name (self):
        name = self.cleaned_data['name']
        if self.topic_map.topic_exists(SCRIPT_TYPE_IRI, name, self.topic_id):
            raise forms.ValidationError(
                'The name of the script must be unique')
        return name
