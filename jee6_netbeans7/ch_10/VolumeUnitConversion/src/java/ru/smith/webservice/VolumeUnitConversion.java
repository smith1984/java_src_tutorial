/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.smith.webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author ito
 */
@WebService(serviceName = "VolumeUnitConversion")
@Stateless()
public class VolumeUnitConversion {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "litersToGallons")
    public double litersToGallons(@WebParam(name = "liters") double liters) {
        //TODO write your implementation code here:
        return liters*0.26417;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "gallonsToLiters")
    public double gallonsToLiters(@WebParam(name = "gallons") double gallons) {
        //TODO write your implementation code here:
        return gallons*3.7854;
    }
}
