
package org.datacontract.schemas._2004._07.cloudcomputing_lab2_unitsconverter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitType" type="{http://schemas.datacontract.org/2004/07/CloudComputing.Lab2.UnitsConverter.Model}UnitType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnitType", propOrder = {
    "unitType"
})
public class ArrayOfUnitType {

    @XmlElement(name = "UnitType")
    @XmlSchemaType(name = "string")
    protected List<UnitType> unitType;

    /**
     * Gets the value of the unitType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitType }
     * 
     * 
     */
    public List<UnitType> getUnitType() {
        if (unitType == null) {
            unitType = new ArrayList<UnitType>();
        }
        return this.unitType;
    }

}
