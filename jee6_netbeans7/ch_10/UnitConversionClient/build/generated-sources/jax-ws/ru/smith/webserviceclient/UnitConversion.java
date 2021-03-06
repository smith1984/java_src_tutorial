
package ru.smith.webserviceclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UnitConversion", targetNamespace = "http://webservice.smith.ru/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UnitConversion {


    /**
     * 
     * @param inches
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "inchesToCentimetrs", targetNamespace = "http://webservice.smith.ru/", className = "ru.smith.webserviceclient.InchesToCentimetrs")
    @ResponseWrapper(localName = "inchesToCentimetrsResponse", targetNamespace = "http://webservice.smith.ru/", className = "ru.smith.webserviceclient.InchesToCentimetrsResponse")
    @Action(input = "http://webservice.smith.ru/UnitConversion/inchesToCentimetrsRequest", output = "http://webservice.smith.ru/UnitConversion/inchesToCentimetrsResponse")
    public double inchesToCentimetrs(
        @WebParam(name = "inches", targetNamespace = "")
        double inches);

    /**
     * 
     * @param centimetrs
     * @return
     *     returns double
     */
    @WebMethod(operationName = "CentimetrsToInches")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CentimetrsToInches", targetNamespace = "http://webservice.smith.ru/", className = "ru.smith.webserviceclient.CentimetrsToInches")
    @ResponseWrapper(localName = "CentimetrsToInchesResponse", targetNamespace = "http://webservice.smith.ru/", className = "ru.smith.webserviceclient.CentimetrsToInchesResponse")
    @Action(input = "http://webservice.smith.ru/UnitConversion/CentimetrsToInchesRequest", output = "http://webservice.smith.ru/UnitConversion/CentimetrsToInchesResponse")
    public double centimetrsToInches(
        @WebParam(name = "centimetrs", targetNamespace = "")
        double centimetrs);

}
