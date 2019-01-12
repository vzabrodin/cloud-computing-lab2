
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
@WebServiceClient(name = "UnitsConverter", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:26334/UnitsConverter.cs.svc?wsdl")
public class UnitsConverter
    extends Service
{

    private final static URL UNITSCONVERTER_WSDL_LOCATION;
    private final static WebServiceException UNITSCONVERTER_EXCEPTION;
    private final static QName UNITSCONVERTER_QNAME = new QName("http://tempuri.org/", "UnitsConverter");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:26334/UnitsConverter.cs.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UNITSCONVERTER_WSDL_LOCATION = url;
        UNITSCONVERTER_EXCEPTION = e;
    }

    public UnitsConverter() {
        super(__getWsdlLocation(), UNITSCONVERTER_QNAME);
    }

    public UnitsConverter(WebServiceFeature... features) {
        super(__getWsdlLocation(), UNITSCONVERTER_QNAME, features);
    }

    public UnitsConverter(URL wsdlLocation) {
        super(wsdlLocation, UNITSCONVERTER_QNAME);
    }

    public UnitsConverter(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UNITSCONVERTER_QNAME, features);
    }

    public UnitsConverter(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UnitsConverter(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IUnitsConverter
     */
    @WebEndpoint(name = "BasicHttpBinding_IUnitsConverter")
    public IUnitsConverter getBasicHttpBindingIUnitsConverter() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IUnitsConverter"), IUnitsConverter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IUnitsConverter
     */
    @WebEndpoint(name = "BasicHttpBinding_IUnitsConverter")
    public IUnitsConverter getBasicHttpBindingIUnitsConverter(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IUnitsConverter"), IUnitsConverter.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UNITSCONVERTER_EXCEPTION!= null) {
            throw UNITSCONVERTER_EXCEPTION;
        }
        return UNITSCONVERTER_WSDL_LOCATION;
    }

}