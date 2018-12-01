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
public class UserBean implements Serializable {
   private String name;
   private int age;
   
   public String getName() { return name; } 
   public void setName(String newValue) { name = newValue; }
   
   public int getAge() { return age; }
   public void setAge(int newValue) { age = newValue; }
}