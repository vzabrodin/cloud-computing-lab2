
package org.datacontract.schemas._2004._07.cloudcomputing_lab2_unitsconverter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.cloudcomputing_lab2_unitsconverter package. 
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

    private final static QName _ArrayOfUnitType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CloudComputing.Lab2.UnitsConverter.Model", "ArrayOfUnitType");
    private final static QName _UnitType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CloudComputing.Lab2.UnitsConverter.Model", "UnitType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.cloudcomputing_lab2_unitsconverter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfUnitType }
     * 
     */
    public ArrayOfUnitType createArrayOfUnitType() {
        return new ArrayOfUnitType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CloudComputing.Lab2.UnitsConverter.Model", name = "ArrayOfUnitType")
    public JAXBElement<ArrayOfUnitType> createArrayOfUnitType(ArrayOfUnitType value) {
        return new JAXBElement<ArrayOfUnitType>(_ArrayOfUnitType_QNAME, ArrayOfUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CloudComputing.Lab2.UnitsConverter.Model", name = "UnitType")
    public JAXBElement<UnitType> createUnitType(UnitType value) {
        return new JAXBElement<UnitType>(_UnitType_QNAME, UnitType.class, null, value);
    }

}
