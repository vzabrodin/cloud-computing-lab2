
package org.doge.lab2.client.proxy;

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
 *         &lt;element name="DivideResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "divideResult"
})
@XmlRootElement(name = "DivideResponse")
public class DivideResponse {

    @XmlElement(name = "DivideResult")
    protected Double divideResult;

    /**
     * Gets the value of the divideResult property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDivideResult() {
        return divideResult;
    }

    /**
     * Sets the value of the divideResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDivideResult(Double value) {
        this.divideResult = value;
    }

}
