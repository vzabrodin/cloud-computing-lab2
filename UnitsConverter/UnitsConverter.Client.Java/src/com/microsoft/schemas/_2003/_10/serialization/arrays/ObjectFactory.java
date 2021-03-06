
package com.microsoft.schemas._2003._10.serialization.arrays;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas._2003._10.serialization.arrays package. 
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

    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfUnitTypeArrayOfstrings3dCQ8f0");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas._2003._10.serialization.arrays
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 }
     * 
     */
    public ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 createArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0() {
        return new ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 .KeyValueOfUnitTypeArrayOfstrings3DCQ8F0 }
     * 
     */
    public ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 .KeyValueOfUnitTypeArrayOfstrings3DCQ8F0 createArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0KeyValueOfUnitTypeArrayOfstrings3DCQ8F0() {
        return new ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 .KeyValueOfUnitTypeArrayOfstrings3DCQ8F0();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfUnitTypeArrayOfstrings3dCQ8f0")
    public JAXBElement<ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0> createArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0(ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 value) {
        return new JAXBElement<ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0>(_ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0_QNAME, ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 .class, null, value);
    }

}
