/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.smith;

/**
 *
 * @author ito
 */
public class UnitConversionClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Result = " + centimetrsToInches(2.54));
    }

    private static double centimetrsToInches(double centimetrs) {
        ru.smith.webserviceclient.UnitConversion_Service service = new ru.smith.webserviceclient.UnitConversion_Service();
        ru.smith.webserviceclient.UnitConversion port = service.getUnitConversionPort();
        return port.centimetrsToInches(centimetrs);
    }

}
