//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.06 at 03:37:39 PM NZST 
//


package uk.ac.kcl.cch.eats.eatsml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.ac.kcl.cch.eats.eatsml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Code_QNAME = new QName("http://eats.artefact.org.nz/ns/eatsml/", "code");
    private final static QName _ReverseName_QNAME = new QName("http://eats.artefact.org.nz/ns/eatsml/", "reverse_name");
    private final static QName _Normalised_QNAME = new QName("http://eats.artefact.org.nz/ns/eatsml/", "normalised");
    private final static QName _Separator_QNAME = new QName("http://eats.artefact.org.nz/ns/eatsml/", "separator");
    private final static QName _AssembledForm_QNAME = new QName("http://eats.artefact.org.nz/ns/eatsml/", "assembled_form");
    private final static QName _DisplayForm_QNAME = new QName("http://eats.artefact.org.nz/ns/eatsml/", "display_form");
    private final static QName _Raw_QNAME = new QName("http://eats.artefact.org.nz/ns/eatsml/", "raw");
    private final static QName _Name_QNAME = new QName("http://eats.artefact.org.nz/ns/eatsml/", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.ac.kcl.cch.eats.eatsml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.Scripts }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.Scripts createScripts() {
        return new uk.ac.kcl.cch.eats.eatsml.Scripts();
    }

    /**
     * Create an instance of {@link Authority.EntityTypes.EntityType }
     * 
     */
    public Authority.EntityTypes.EntityType createAuthorityEntityTypesEntityType() {
        return new Authority.EntityTypes.EntityType();
    }

    /**
     * Create an instance of {@link Authority.Scripts }
     * 
     */
    public Authority.Scripts createAuthorityScripts() {
        return new Authority.Scripts();
    }

    /**
     * Create an instance of {@link SubjectIdentifiers }
     * 
     */
    public SubjectIdentifiers createSubjectIdentifiers() {
        return new SubjectIdentifiers();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.DatePeriods.DatePeriod }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.DatePeriods.DatePeriod createDatePeriodsDatePeriod() {
        return new uk.ac.kcl.cch.eats.eatsml.DatePeriods.DatePeriod();
    }

    /**
     * Create an instance of {@link Authority.Calendars.Calendar }
     * 
     */
    public Authority.Calendars.Calendar createAuthorityCalendarsCalendar() {
        return new Authority.Calendars.Calendar();
    }

    /**
     * Create an instance of {@link Authority.NamePartTypes }
     * 
     */
    public Authority.NamePartTypes createAuthorityNamePartTypes() {
        return new Authority.NamePartTypes();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.Languages }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.Languages createLanguages() {
        return new uk.ac.kcl.cch.eats.eatsml.Languages();
    }

    /**
     * Create an instance of {@link Authority.DateTypes }
     * 
     */
    public Authority.DateTypes createAuthorityDateTypes() {
        return new Authority.DateTypes();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.Calendars }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.Calendars createCalendars() {
        return new uk.ac.kcl.cch.eats.eatsml.Calendars();
    }

    /**
     * Create an instance of {@link Collection.EntityTypes.EntityType }
     * 
     */
    public Collection.EntityTypes.EntityType createCollectionEntityTypesEntityType() {
        return new Collection.EntityTypes.EntityType();
    }

    /**
     * Create an instance of {@link Existences }
     * 
     */
    public Existences createExistences() {
        return new Existences();
    }

    /**
     * Create an instance of {@link Collection }
     * 
     */
    public Collection createCollection() {
        return new Collection();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.Languages.Language.NamePartTypes }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.Languages.Language.NamePartTypes createLanguagesLanguageNamePartTypes() {
        return new uk.ac.kcl.cch.eats.eatsml.Languages.Language.NamePartTypes();
    }

    /**
     * Create an instance of {@link Dates }
     * 
     */
    public Dates createDates() {
        return new Dates();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.DateTypes.DateType }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.DateTypes.DateType createDateTypesDateType() {
        return new uk.ac.kcl.cch.eats.eatsml.DateTypes.DateType();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.NameTypes.NameType }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.NameTypes.NameType createNameTypesNameType() {
        return new uk.ac.kcl.cch.eats.eatsml.NameTypes.NameType();
    }

    /**
     * Create an instance of {@link DatePart }
     * 
     */
    public DatePart createDatePart() {
        return new DatePart();
    }

    /**
     * Create an instance of {@link Authority.Calendars }
     * 
     */
    public Authority.Calendars createAuthorityCalendars() {
        return new Authority.Calendars();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.Name }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.Name createName() {
        return new uk.ac.kcl.cch.eats.eatsml.Name();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.NamePartTypes.NamePartType }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.NamePartTypes.NamePartType createNamePartTypesNamePartType() {
        return new uk.ac.kcl.cch.eats.eatsml.NamePartTypes.NamePartType();
    }

    /**
     * Create an instance of {@link Authority.Languages }
     * 
     */
    public Authority.Languages createAuthorityLanguages() {
        return new Authority.Languages();
    }

    /**
     * Create an instance of {@link NameParts }
     * 
     */
    public NameParts createNameParts() {
        return new NameParts();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.NamePartTypes }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.NamePartTypes createNamePartTypes() {
        return new uk.ac.kcl.cch.eats.eatsml.NamePartTypes();
    }

    /**
     * Create an instance of {@link Authority.DatePeriods }
     * 
     */
    public Authority.DatePeriods createAuthorityDatePeriods() {
        return new Authority.DatePeriods();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.DatePeriods }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.DatePeriods createDatePeriods() {
        return new uk.ac.kcl.cch.eats.eatsml.DatePeriods();
    }

    /**
     * Create an instance of {@link Authorities }
     * 
     */
    public Authorities createAuthorities() {
        return new Authorities();
    }

    /**
     * Create an instance of {@link Authority.DatePeriods.DatePeriod }
     * 
     */
    public Authority.DatePeriods.DatePeriod createAuthorityDatePeriodsDatePeriod() {
        return new Authority.DatePeriods.DatePeriod();
    }

    /**
     * Create an instance of {@link Authority.Languages.Language }
     * 
     */
    public Authority.Languages.Language createAuthorityLanguagesLanguage() {
        return new Authority.Languages.Language();
    }

    /**
     * Create an instance of {@link Existence }
     * 
     */
    public Existence createExistence() {
        return new Existence();
    }

    /**
     * Create an instance of {@link Authority.Scripts.Script }
     * 
     */
    public Authority.Scripts.Script createAuthorityScriptsScript() {
        return new Authority.Scripts.Script();
    }

    /**
     * Create an instance of {@link Entity.EntityTypes }
     * 
     */
    public Entity.EntityTypes createEntityEntityTypes() {
        return new Entity.EntityTypes();
    }

    /**
     * Create an instance of {@link Names.Name }
     * 
     */
    public Names.Name createNamesName() {
        return new Names.Name();
    }

    /**
     * Create an instance of {@link Authority.DateTypes.DateType }
     * 
     */
    public Authority.DateTypes.DateType createAuthorityDateTypesDateType() {
        return new Authority.DateTypes.DateType();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.Calendars.Calendar }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.Calendars.Calendar createCalendarsCalendar() {
        return new uk.ac.kcl.cch.eats.eatsml.Calendars.Calendar();
    }

    /**
     * Create an instance of {@link Authority.EntityTypes }
     * 
     */
    public Authority.EntityTypes createAuthorityEntityTypes() {
        return new Authority.EntityTypes();
    }

    /**
     * Create an instance of {@link Authority.NameTypes }
     * 
     */
    public Authority.NameTypes createAuthorityNameTypes() {
        return new Authority.NameTypes();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link EntityRelationships }
     * 
     */
    public EntityRelationships createEntityRelationships() {
        return new EntityRelationships();
    }

    /**
     * Create an instance of {@link EntityRelationship }
     * 
     */
    public EntityRelationship createEntityRelationship() {
        return new EntityRelationship();
    }

    /**
     * Create an instance of {@link Entities }
     * 
     */
    public Entities createEntities() {
        return new Entities();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.Languages.Language }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.Languages.Language createLanguagesLanguage() {
        return new uk.ac.kcl.cch.eats.eatsml.Languages.Language();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.DateTypes }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.DateTypes createDateTypes() {
        return new uk.ac.kcl.cch.eats.eatsml.DateTypes();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link Collection.EntityTypes }
     * 
     */
    public Collection.EntityTypes createCollectionEntityTypes() {
        return new Collection.EntityTypes();
    }

    /**
     * Create an instance of {@link Authority.NamePartTypes.NamePartType }
     * 
     */
    public Authority.NamePartTypes.NamePartType createAuthorityNamePartTypesNamePartType() {
        return new Authority.NamePartTypes.NamePartType();
    }

    /**
     * Create an instance of {@link Names }
     * 
     */
    public Names createNames() {
        return new Names();
    }

    /**
     * Create an instance of {@link Authority.NameTypes.NameType }
     * 
     */
    public Authority.NameTypes.NameType createAuthorityNameTypesNameType() {
        return new Authority.NameTypes.NameType();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.EntityRelationshipTypes.EntityRelationshipType }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.EntityRelationshipTypes.EntityRelationshipType createEntityRelationshipTypesEntityRelationshipType() {
        return new uk.ac.kcl.cch.eats.eatsml.EntityRelationshipTypes.EntityRelationshipType();
    }

    /**
     * Create an instance of {@link DateParts }
     * 
     */
    public DateParts createDateParts() {
        return new DateParts();
    }

    /**
     * Create an instance of {@link Authority.EntityRelationshipTypes.EntityRelationshipType }
     * 
     */
    public Authority.EntityRelationshipTypes.EntityRelationshipType createAuthorityEntityRelationshipTypesEntityRelationshipType() {
        return new Authority.EntityRelationshipTypes.EntityRelationshipType();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.Scripts.Script }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.Scripts.Script createScriptsScript() {
        return new uk.ac.kcl.cch.eats.eatsml.Scripts.Script();
    }

    /**
     * Create an instance of {@link NamePart }
     * 
     */
    public NamePart createNamePart() {
        return new NamePart();
    }

    /**
     * Create an instance of {@link Authority }
     * 
     */
    public Authority createAuthority() {
        return new Authority();
    }

    /**
     * Create an instance of {@link Entity.EntityTypes.EntityType }
     * 
     */
    public Entity.EntityTypes.EntityType createEntityEntityTypesEntityType() {
        return new Entity.EntityTypes.EntityType();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.NameTypes }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.NameTypes createNameTypes() {
        return new uk.ac.kcl.cch.eats.eatsml.NameTypes();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.Languages.Language.NamePartTypes.NamePartType }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.Languages.Language.NamePartTypes.NamePartType createLanguagesLanguageNamePartTypesNamePartType() {
        return new uk.ac.kcl.cch.eats.eatsml.Languages.Language.NamePartTypes.NamePartType();
    }

    /**
     * Create an instance of {@link Authority.EntityRelationshipTypes }
     * 
     */
    public Authority.EntityRelationshipTypes createAuthorityEntityRelationshipTypes() {
        return new Authority.EntityRelationshipTypes();
    }

    /**
     * Create an instance of {@link uk.ac.kcl.cch.eats.eatsml.EntityRelationshipTypes }
     * 
     */
    public uk.ac.kcl.cch.eats.eatsml.EntityRelationshipTypes createEntityRelationshipTypes() {
        return new uk.ac.kcl.cch.eats.eatsml.EntityRelationshipTypes();
    }

    /**
     * Create an instance of {@link SubjectIdentifier }
     * 
     */
    public SubjectIdentifier createSubjectIdentifier() {
        return new SubjectIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eats.artefact.org.nz/ns/eatsml/", name = "code")
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eats.artefact.org.nz/ns/eatsml/", name = "reverse_name")
    public JAXBElement<String> createReverseName(String value) {
        return new JAXBElement<String>(_ReverseName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eats.artefact.org.nz/ns/eatsml/", name = "normalised")
    public JAXBElement<String> createNormalised(String value) {
        return new JAXBElement<String>(_Normalised_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eats.artefact.org.nz/ns/eatsml/", name = "separator")
    public JAXBElement<String> createSeparator(String value) {
        return new JAXBElement<String>(_Separator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eats.artefact.org.nz/ns/eatsml/", name = "assembled_form")
    public JAXBElement<String> createAssembledForm(String value) {
        return new JAXBElement<String>(_AssembledForm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eats.artefact.org.nz/ns/eatsml/", name = "display_form")
    public JAXBElement<String> createDisplayForm(String value) {
        return new JAXBElement<String>(_DisplayForm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eats.artefact.org.nz/ns/eatsml/", name = "raw")
    public JAXBElement<String> createRaw(String value) {
        return new JAXBElement<String>(_Raw_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eats.artefact.org.nz/ns/eatsml/", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

}
