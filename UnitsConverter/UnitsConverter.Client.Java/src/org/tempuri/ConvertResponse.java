
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ConvertResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "convertResult"
})
@XmlRootElement(name = "ConvertResponse")
public class ConvertResponse {

    @XmlElement(name = "ConvertResult")
    protected Double convertResult;

    /**
     * Gets the value of the convertResult property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConvertResult() {
        return convertResult;
    }

    /**
     * Sets the value of the convertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConvertResult(Double value) {
        this.convertResult = value;
    }

}
