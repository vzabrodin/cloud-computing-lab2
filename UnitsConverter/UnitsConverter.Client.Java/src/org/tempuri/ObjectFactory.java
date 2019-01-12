
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.cloudcomputing_lab2_unitsconverter.ArrayOfUnitType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetSupportedUnitsResponseGetSupportedUnitsResult_QNAME = new QName("http://tempuri.org/", "GetSupportedUnitsResult");
    private final static QName _IsUnitCodeSupportedCode_QNAME = new QName("http://tempuri.org/", "code");
    private final static QName _ConvertTo_QNAME = new QName("http://tempuri.org/", "to");
    private final static QName _ConvertFrom_QNAME = new QName("http://tempuri.org/", "from");
    private final static QName _GetSupportedTypesResponseGetSupportedTypesResult_QNAME = new QName("http://tempuri.org/", "GetSupportedTypesResult");
    private final static QName _GetSupportedUnitsByTypeResponseGetSupportedUnitsByTypeResult_QNAME = new QName("http://tempuri.org/", "GetSupportedUnitsByTypeResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSupportedTypes }
     * 
     */
    public GetSupportedTypes createGetSupportedTypes() {
        return new GetSupportedTypes();
    }

    /**
     * Create an instance of {@link Convert }
     * 
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link GetSupportedTypesResponse }
     * 
     */
    public GetSupportedTypesResponse createGetSupportedTypesResponse() {
        return new GetSupportedTypesResponse();
    }

    /**
     * Create an instance of {@link IsUnitTypeSupportedResponse }
     * 
     */
    public IsUnitTypeSupportedResponse createIsUnitTypeSupportedResponse() {
        return new IsUnitTypeSupportedResponse();
    }

    /**
     * Create an instance of {@link GetSupportedUnitsByType }
     * 
     */
    public GetSupportedUnitsByType createGetSupportedUnitsByType() {
        return new GetSupportedUnitsByType();
    }

    /**
     * Create an instance of {@link GetSupportedUnitsByTypeResponse }
     * 
     */
    public GetSupportedUnitsByTypeResponse createGetSupportedUnitsByTypeResponse() {
        return new GetSupportedUnitsByTypeResponse();
    }

    /**
     * Create an instance of {@link IsUnitCodeSupported }
     * 
     */
    public IsUnitCodeSupported createIsUnitCodeSupported() {
        return new IsUnitCodeSupported();
    }

    /**
     * Create an instance of {@link IsUnitTypeSupported }
     * 
     */
    public IsUnitTypeSupported createIsUnitTypeSupported() {
        return new IsUnitTypeSupported();
    }

    /**
     * Create an instance of {@link GetSupportedUnits }
     * 
     */
    public GetSupportedUnits createGetSupportedUnits() {
        return new GetSupportedUnits();
    }

    /**
     * Create an instance of {@link GetSupportedUnitsResponse }
     * 
     */
    public GetSupportedUnitsResponse createGetSupportedUnitsResponse() {
        return new GetSupportedUnitsResponse();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link IsUnitCodeSupportedResponse }
     * 
     */
    public IsUnitCodeSupportedResponse createIsUnitCodeSupportedResponse() {
        return new IsUnitCodeSupportedResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSupportedUnitsResult", scope = GetSupportedUnitsResponse.class)
    public JAXBElement<ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0> createGetSupportedUnitsResponseGetSupportedUnitsResult(ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 value) {
        return new JAXBElement<ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0>(_GetSupportedUnitsResponseGetSupportedUnitsResult_QNAME, ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0 .class, GetSupportedUnitsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "code", scope = IsUnitCodeSupported.class)
    public JAXBElement<String> createIsUnitCodeSupportedCode(String value) {
        return new JAXBElement<String>(_IsUnitCodeSupportedCode_QNAME, String.class, IsUnitCodeSupported.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "to", scope = Convert.class)
    public JAXBElement<String> createConvertTo(String value) {
        return new JAXBElement<String>(_ConvertTo_QNAME, String.class, Convert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "from", scope = Convert.class)
    public JAXBElement<String> createConvertFrom(String value) {
        return new JAXBElement<String>(_ConvertFrom_QNAME, String.class, Convert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSupportedTypesResult", scope = GetSupportedTypesResponse.class)
    public JAXBElement<ArrayOfUnitType> createGetSupportedTypesResponseGetSupportedTypesResult(ArrayOfUnitType value) {
        return new JAXBElement<ArrayOfUnitType>(_GetSupportedTypesResponseGetSupportedTypesResult_QNAME, ArrayOfUnitType.class, GetSupportedTypesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSupportedUnitsByTypeResult", scope = GetSupportedUnitsByTypeResponse.class)
    public JAXBElement<ArrayOfstring> createGetSupportedUnitsByTypeResponseGetSupportedUnitsByTypeResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetSupportedUnitsByTypeResponseGetSupportedUnitsByTypeResult_QNAME, ArrayOfstring.class, GetSupportedUnitsByTypeResponse.class, value);
    }

}
