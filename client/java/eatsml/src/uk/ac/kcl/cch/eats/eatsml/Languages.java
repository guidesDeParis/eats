//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.06 at 03:37:39 PM NZST 
//


package uk.ac.kcl.cch.eats.eatsml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="language" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://eats.artefact.org.nz/ns/eatsml/}name">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://eats.artefact.org.nz/ns/eatsml/}code"/>
 *                   &lt;element name="name_part_types" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name_part_type" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://eats.artefact.org.nz/ns/eatsml/}ref_attribute"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://eats.artefact.org.nz/ns/eatsml/}id_attribute"/>
 *                 &lt;attribute name="eats_id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="user_preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "language"
})
@XmlRootElement(name = "languages")
public class Languages {

    @XmlElement(required = true)
    protected List<Languages.Language> language;

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Languages.Language }
     * 
     * 
     */
    public List<Languages.Language> getLanguage() {
        if (language == null) {
            language = new ArrayList<Languages.Language>();
        }
        return this.language;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://eats.artefact.org.nz/ns/eatsml/}name">
     *       &lt;sequence>
     *         &lt;element ref="{http://eats.artefact.org.nz/ns/eatsml/}code"/>
     *         &lt;element name="name_part_types" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name_part_type" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://eats.artefact.org.nz/ns/eatsml/}ref_attribute"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://eats.artefact.org.nz/ns/eatsml/}id_attribute"/>
     *       &lt;attribute name="eats_id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="user_preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "namePartTypes"
    })
    public static class Language
        extends Name
    {

        @XmlElement(required = true)
        protected String code;
        @XmlElement(name = "name_part_types")
        protected Languages.Language.NamePartTypes namePartTypes;
        @XmlAttribute(name = "eats_id")
        @XmlSchemaType(name = "anySimpleType")
        protected String eatsId;
        @XmlAttribute(name = "user_preferred")
        protected Boolean userPreferred;
        @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the namePartTypes property.
         * 
         * @return
         *     possible object is
         *     {@link Languages.Language.NamePartTypes }
         *     
         */
        public Languages.Language.NamePartTypes getNamePartTypes() {
            return namePartTypes;
        }

        /**
         * Sets the value of the namePartTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Languages.Language.NamePartTypes }
         *     
         */
        public void setNamePartTypes(Languages.Language.NamePartTypes value) {
            this.namePartTypes = value;
        }

        /**
         * Gets the value of the eatsId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEatsId() {
            return eatsId;
        }

        /**
         * Sets the value of the eatsId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEatsId(String value) {
            this.eatsId = value;
        }

        /**
         * Gets the value of the userPreferred property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUserPreferred() {
            return userPreferred;
        }

        /**
         * Sets the value of the userPreferred property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUserPreferred(Boolean value) {
            this.userPreferred = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name_part_type" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://eats.artefact.org.nz/ns/eatsml/}ref_attribute"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "namePartType"
        })
        public static class NamePartTypes {

            @XmlElement(name = "name_part_type", required = true)
            protected List<Languages.Language.NamePartTypes.NamePartType> namePartType;

            /**
             * Gets the value of the namePartType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the namePartType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNamePartType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Languages.Language.NamePartTypes.NamePartType }
             * 
             * 
             */
            public List<Languages.Language.NamePartTypes.NamePartType> getNamePartType() {
                if (namePartType == null) {
                    namePartType = new ArrayList<Languages.Language.NamePartTypes.NamePartType>();
                }
                return this.namePartType;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attGroup ref="{http://eats.artefact.org.nz/ns/eatsml/}ref_attribute"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class NamePartType {

                @XmlAttribute(required = true)
                @XmlIDREF
                @XmlSchemaType(name = "IDREF")
                protected Object ref;

                /**
                 * Gets the value of the ref property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getRef() {
                    return ref;
                }

                /**
                 * Sets the value of the ref property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setRef(Object value) {
                    this.ref = value;
                }

            }

        }

    }

}