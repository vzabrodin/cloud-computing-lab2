
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CryptoCurrency", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:1940/CryptoCurrency.svc?wsdl")
public class CryptoCurrency
    extends Service
{

    private final static URL CRYPTOCURRENCY_WSDL_LOCATION;
    private final static WebServiceException CRYPTOCURRENCY_EXCEPTION;
    private final static QName CRYPTOCURRENCY_QNAME = new QName("http://tempuri.org/", "CryptoCurrency");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1940/CryptoCurrency.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CRYPTOCURRENCY_WSDL_LOCATION = url;
        CRYPTOCURRENCY_EXCEPTION = e;
    }

    public CryptoCurrency() {
        super(__getWsdlLocation(), CRYPTOCURRENCY_QNAME);
    }

    public CryptoCurrency(WebServiceFeature... features) {
        super(__getWsdlLocation(), CRYPTOCURRENCY_QNAME, features);
    }

    public CryptoCurrency(URL wsdlLocation) {
        super(wsdlLocation, CRYPTOCURRENCY_QNAME);
    }

    public CryptoCurrency(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CRYPTOCURRENCY_QNAME, features);
    }

    public CryptoCurrency(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CryptoCurrency(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ICryptoCurrency
     */
    @WebEndpoint(name = "BasicHttpBinding_ICryptoCurrency")
    public ICryptoCurrency getBasicHttpBindingICryptoCurrency() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ICryptoCurrency"), ICryptoCurrency.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICryptoCurrency
     */
    @WebEndpoint(name = "BasicHttpBinding_ICryptoCurrency")
    public ICryptoCurrency getBasicHttpBindingICryptoCurrency(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ICryptoCurrency"), ICryptoCurrency.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CRYPTOCURRENCY_EXCEPTION!= null) {
            throw CRYPTOCURRENCY_EXCEPTION;
        }
        return CRYPTOCURRENCY_WSDL_LOCATION;
    }

}
