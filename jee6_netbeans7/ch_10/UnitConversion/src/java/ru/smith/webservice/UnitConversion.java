/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.smith.webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ito
 */
@WebService(serviceName = "UnitConversion")
public class UnitConversion {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "inchesToCentimetrs")
    public double inchesToCentimetrs(@WebParam(name = "inches") double inches) {
        //TODO write your implementation code here:
        return inches*2.54;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CentimetrsToInches")
    public double CentimetrsToInches(@WebParam(name = "centimetrs") double centimetrs) {
        //TODO write your implementation code here:
        return centimetrs/2.54;
    }
}
