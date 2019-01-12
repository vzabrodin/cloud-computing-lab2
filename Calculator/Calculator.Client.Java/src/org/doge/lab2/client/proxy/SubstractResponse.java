
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
 *         &lt;element name="SubstractResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "substractResult"
})
@XmlRootElement(name = "SubstractResponse")
public class SubstractResponse {

    @XmlElement(name = "SubstractResult")
    protected Double substractResult;

    /**
     * Gets the value of the substractResult property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubstractResult() {
        return substractResult;
    }

    /**
     * Sets the value of the substractResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubstractResult(Double value) {
        this.substractResult = value;
    }

}
