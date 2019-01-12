
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
 *         &lt;element name="PowerResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "powerResult"
})
@XmlRootElement(name = "PowerResponse")
public class PowerResponse {

    @XmlElement(name = "PowerResult")
    protected Double powerResult;

    /**
     * Gets the value of the powerResult property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPowerResult() {
        return powerResult;
    }

    /**
     * Sets the value of the powerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPowerResult(Double value) {
        this.powerResult = value;
    }

}
