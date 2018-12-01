/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.smith;

import ru.smith.jaxrsclient.NewJerseyClient;

/**
 *
 * @author ito
 */
public class JaxRSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewJerseyClient newJerseyClient = new NewJerseyClient();
        String response = newJerseyClient.find_XML(String.class, "1");
        System.out.println(response);
        newJerseyClient.close();
    }
    
}
