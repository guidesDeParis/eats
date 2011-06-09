from tmapi.indices.type_instance_index import TypeInstanceIndex

from model_test_case import ModelTestCase


class NameTest (ModelTestCase):

    def setUp (self):
        super(NameTest, self).setUp()
        self.entity = self.tm.create_entity(self.authority)
        self.name_type = self.create_name_type('regular')
        self.name_type2 = self.create_name_type('irregular')
        self.language = self.create_language('English', 'en')
        self.language2 = self.create_language('Arabic', 'ar')
        self.script = self.create_script('Latin', 'Latn')
        self.script2 = self.create_script('Arabic', 'Arab')
        self.type_index = self.tm.get_index(TypeInstanceIndex)
        self.type_index.open()
    
    def test_create_name_property_assertion (self):
        self.assertEqual(0, len(self.entity.get_eats_names()))
        self.assertEqual(0, self.type_index.get_associations(
                self.tm.is_in_language_type).count())
        self.assertEqual(0, self.type_index.get_associations(
                self.tm.is_in_script_type).count())        
        name_assertion = self.entity.create_name_property_assertion(
            self.authority, self.name_type, self.language, self.script,
            'Name')
        self.assertEqual(1, len(self.entity.get_eats_names()))
        self.assertEqual(1, self.type_index.get_associations(
                self.tm.is_in_language_type).count())
        self.assertEqual(1, self.type_index.get_associations(
                self.tm.is_in_script_type).count())
        name = self.entity.get_entity_name(name_assertion)
        self.assertEqual(name.name_value, 'Name')
        self.assertEqual(name.name_type, self.name_type)

    def test_delete_name_property_assertion (self):
        self.assertEqual(0, len(self.entity.get_eats_names()))
        name1_assertion = self.entity.create_name_property_assertion(
            self.authority, self.name_type, self.language, self.script,
            'Name1')
        self.assertEqual(1, len(self.entity.get_eats_names()))
        name2_assertion = self.entity.create_name_property_assertion(
            self.authority, self.name_type, self.language, self.script,
            'Name2')
        self.assertEqual(2, len(self.entity.get_eats_names()))
        self.assertEqual(2, self.type_index.get_associations(
                self.tm.is_in_language_type).count())
        self.assertEqual(2, self.type_index.get_associations(
                self.tm.is_in_script_type).count())
        self.entity.delete_name_property_assertion(name2_assertion)
        self.assertEqual(1, len(self.entity.get_eats_names()))
        self.assertEqual(1, self.type_index.get_associations(
                self.tm.is_in_language_type).count())
        self.assertEqual(1, self.type_index.get_associations(
                self.tm.is_in_script_type).count())
        name1 = self.entity.get_entity_name(name1_assertion)
        self.assertEqual(name1.name_value, 'Name1')
        self.entity.delete_name_property_assertion(name1_assertion)
        self.assertEqual(0, len(self.entity.get_eats_names()))
        self.assertEqual(0, self.type_index.get_associations(
                self.tm.is_in_language_type).count())
        self.assertEqual(0, self.type_index.get_associations(
                self.tm.is_in_script_type).count())

    def test_update_name_property_assertion (self):
        name_assertion = self.entity.create_name_property_assertion(
            self.authority, self.name_type, self.language, self.script,
            'Name')
        name = self.entity.get_entity_name(name_assertion)
        self.assertEqual(name.name_type, self.name_type)
        self.assertEqual(name.name_language, self.language)
        self.assertEqual(name.name_script, self.script)
        self.assertEqual(name.name_value, 'Name')
        authority2 = self.create_authority('Authority2')
        self.entity.update_name_property_assertion(
            authority2, name_assertion, self.name_type2, self.language2,
            self.script2, 'Name2')
        self.assertEqual(name.name_type, self.name_type2)
        self.assertEqual(name.name_language, self.language2)
        self.assertEqual(name.name_script, self.script2)
        self.assertEqual(name.name_value, 'Name2')        
        
    def test_name_language (self):
        name_assertion = self.entity.create_name_property_assertion(
            self.authority, self.name_type, self.language, self.script,
            'Name')
        name = self.entity.get_entity_name(name_assertion)
        self.assertEqual(self.language, name.name_language)
        name.name_language = self.language2
        self.assertEqual(self.language2, name.name_language)
        
    def test_name_script (self):
        name_assertion = self.entity.create_name_property_assertion(
            self.authority, self.name_type, self.language, self.script,
            'Name')
        name = self.entity.get_entity_name(name_assertion)
        self.assertEqual(self.script, name.name_script)
        name.name_script = self.script2
        self.assertEqual(self.script2, name.name_script)

    def test_name_type (self):
        name_assertion = self.entity.create_name_property_assertion(
            self.authority, self.name_type, self.language, self.script,
            'Name')
        name = self.entity.get_entity_name(name_assertion)
        self.assertEqual(name.name_type, self.name_type)
        name.name_type = self.name_type2
        self.assertEqual(name.name_type, self.name_type2)
        
    def test_name_value (self):
        name_assertion = self.entity.create_name_property_assertion(
            self.authority, self.name_type, self.language, self.script,
            'Name1')
        name = self.entity.get_entity_name(name_assertion)
        self.assertEqual(name.name_value, 'Name1')
        name.name_value = 'Name2'
        self.assertEqual(name.name_value, 'Name2')