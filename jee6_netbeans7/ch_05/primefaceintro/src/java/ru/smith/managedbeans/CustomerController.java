/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.smith.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author heffel
 */
@ManagedBean
@RequestScoped
public class CustomerController {

    /** Creates a new instance of CustomerController */
    public CustomerController() {
    }

    public String saveCustomer() {
        return "confirmation";
    }
}
