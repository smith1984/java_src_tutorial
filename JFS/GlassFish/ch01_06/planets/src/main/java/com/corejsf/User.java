/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author ito
 */
@Named("user")
@SessionScoped
public class User implements Serializable {

    /**
     * Creates a new instance of User
     */
    public User() {
    }
    
}
