
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cloudcomputing_lab2_unitsconverter.UnitType;


/**
 * <p>Java class for ArrayOfKeyValueOfUnitTypeArrayOfstrings3dCQ8f0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfUnitTypeArrayOfstrings3dCQ8f0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfUnitTypeArrayOfstrings3dCQ8f0" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/CloudComputing.Lab2.UnitsConverter.Model}UnitType"/>
 *                   &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
 *                 &lt;/sequence>
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
@XmlType(name = "ArrayOfKeyValueOfUnitTypeArrayOfstrings3dCQ8f0", propOrder = {
    "keyValueOfUnitTypeArrayOfstrings3DCQ8F0"
})
public class ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 {

    @XmlElement(name = "KeyValueOfUnitTypeArrayOfstrings3dCQ8f0")
    protected List<ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 .KeyValueOfUnitTypeArrayOfstrings3DCQ8F0> keyValueOfUnitTypeArrayOfstrings3DCQ8F0;

    /**
     * Gets the value of the keyValueOfUnitTypeArrayOfstrings3DCQ8F0 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfUnitTypeArrayOfstrings3DCQ8F0 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfUnitTypeArrayOfstrings3DCQ8F0().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 .KeyValueOfUnitTypeArrayOfstrings3DCQ8F0 }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 .KeyValueOfUnitTypeArrayOfstrings3DCQ8F0> getKeyValueOfUnitTypeArrayOfstrings3DCQ8F0() {
        if (keyValueOfUnitTypeArrayOfstrings3DCQ8F0 == null) {
            keyValueOfUnitTypeArrayOfstrings3DCQ8F0 = new ArrayList<ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 .KeyValueOfUnitTypeArrayOfstrings3DCQ8F0>();
        }
        return this.keyValueOfUnitTypeArrayOfstrings3DCQ8F0;
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
     *         &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/CloudComputing.Lab2.UnitsConverter.Model}UnitType"/>
     *         &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
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
        "key",
        "value"
    })
    public static class KeyValueOfUnitTypeArrayOfstrings3DCQ8F0 {

        @XmlElement(name = "Key", required = true)
        @XmlSchemaType(name = "string")
        protected UnitType key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfstring value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link UnitType }
         *     
         */
        public UnitType getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link UnitType }
         *     
         */
        public void setKey(UnitType value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfstring }
         *     
         */
        public ArrayOfstring getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfstring }
         *     
         */
        public void setValue(ArrayOfstring value) {
            this.value = value;
        }

    }

}
