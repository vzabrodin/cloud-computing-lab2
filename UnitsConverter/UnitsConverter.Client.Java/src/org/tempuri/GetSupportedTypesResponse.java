
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cloudcomputing_lab2_unitsconverter.ArrayOfUnitType;


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
 *         &lt;element name="GetSupportedTypesResult" type="{http://schemas.datacontract.org/2004/07/CloudComputing.Lab2.UnitsConverter.Model}ArrayOfUnitType" minOccurs="0"/>
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
    "getSupportedTypesResult"
})
@XmlRootElement(name = "GetSupportedTypesResponse")
public class GetSupportedTypesResponse {

    @XmlElementRef(name = "GetSupportedTypesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUnitType> getSupportedTypesResult;

    /**
     * Gets the value of the getSupportedTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnitType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUnitType> getGetSupportedTypesResult() {
        return getSupportedTypesResult;
    }

    /**
     * Sets the value of the getSupportedTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnitType }{@code >}
     *     
     */
    public void setGetSupportedTypesResult(JAXBElement<ArrayOfUnitType> value) {
        this.getSupportedTypesResult = value;
    }

}
