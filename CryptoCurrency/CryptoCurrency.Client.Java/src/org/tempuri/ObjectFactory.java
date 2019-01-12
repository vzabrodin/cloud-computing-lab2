
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


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

    private final static QName _ConvertCurrencyCodeFrom_QNAME = new QName("http://tempuri.org/", "currencyCodeFrom");
    private final static QName _ConvertCurrencyCodeTo_QNAME = new QName("http://tempuri.org/", "currencyCodeTo");
    private final static QName _GetSupportedCurrenciesResponseGetSupportedCurrenciesResult_QNAME = new QName("http://tempuri.org/", "GetSupportedCurrenciesResult");
    private final static QName _IsCurrencySupportedCurrencyCode_QNAME = new QName("http://tempuri.org/", "currencyCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSupportedCurrencies }
     * 
     */
    public GetSupportedCurrencies createGetSupportedCurrencies() {
        return new GetSupportedCurrencies();
    }

    /**
     * Create an instance of {@link Convert }
     * 
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link IsCurrencySupportedResponse }
     * 
     */
    public IsCurrencySupportedResponse createIsCurrencySupportedResponse() {
        return new IsCurrencySupportedResponse();
    }

    /**
     * Create an instance of {@link GetSupportedCurrenciesResponse }
     * 
     */
    public GetSupportedCurrenciesResponse createGetSupportedCurrenciesResponse() {
        return new GetSupportedCurrenciesResponse();
    }

    /**
     * Create an instance of {@link IsCurrencySupported }
     * 
     */
    public IsCurrencySupported createIsCurrencySupported() {
        return new IsCurrencySupported();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "currencyCodeFrom", scope = Convert.class)
    public JAXBElement<String> createConvertCurrencyCodeFrom(String value) {
        return new JAXBElement<String>(_ConvertCurrencyCodeFrom_QNAME, String.class, Convert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "currencyCodeTo", scope = Convert.class)
    public JAXBElement<String> createConvertCurrencyCodeTo(String value) {
        return new JAXBElement<String>(_ConvertCurrencyCodeTo_QNAME, String.class, Convert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSupportedCurrenciesResult", scope = GetSupportedCurrenciesResponse.class)
    public JAXBElement<ArrayOfstring> createGetSupportedCurrenciesResponseGetSupportedCurrenciesResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetSupportedCurrenciesResponseGetSupportedCurrenciesResult_QNAME, ArrayOfstring.class, GetSupportedCurrenciesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "currencyCode", scope = IsCurrencySupported.class)
    public JAXBElement<String> createIsCurrencySupportedCurrencyCode(String value) {
        return new JAXBElement<String>(_IsCurrencySupportedCurrencyCode_QNAME, String.class, IsCurrencySupported.class, value);
    }

}
