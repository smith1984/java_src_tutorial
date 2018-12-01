
package ru.smith.webserviceclient;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UnitConversion", targetNamespace = "http://webservice.smith.ru/", wsdlLocation = "http://localhost:8080/UnitConversion/UnitConversion?wsdl")
public class UnitConversion_Service
    extends Service
{

    private final static URL UNITCONVERSION_WSDL_LOCATION;
    private final static WebServiceException UNITCONVERSION_EXCEPTION;
    private final static QName UNITCONVERSION_QNAME = new QName("http://webservice.smith.ru/", "UnitConversion");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/UnitConversion/UnitConversion?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UNITCONVERSION_WSDL_LOCATION = url;
        UNITCONVERSION_EXCEPTION = e;
    }

    public UnitConversion_Service() {
        super(__getWsdlLocation(), UNITCONVERSION_QNAME);
    }

    public UnitConversion_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), UNITCONVERSION_QNAME, features);
    }

    public UnitConversion_Service(URL wsdlLocation) {
        super(wsdlLocation, UNITCONVERSION_QNAME);
    }

    public UnitConversion_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UNITCONVERSION_QNAME, features);
    }

    public UnitConversion_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UnitConversion_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UnitConversion
     */
    @WebEndpoint(name = "UnitConversionPort")
    public UnitConversion getUnitConversionPort() {
        return super.getPort(new QName("http://webservice.smith.ru/", "UnitConversionPort"), UnitConversion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UnitConversion
     */
    @WebEndpoint(name = "UnitConversionPort")
    public UnitConversion getUnitConversionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.smith.ru/", "UnitConversionPort"), UnitConversion.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UNITCONVERSION_EXCEPTION!= null) {
            throw UNITCONVERSION_EXCEPTION;
        }
        return UNITCONVERSION_WSDL_LOCATION;
    }

}
