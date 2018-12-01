package com.corejsf;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.inject.Named; 
   // or import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped; 
   // or import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Past;

@Named("user") // or @ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {
   private String name;
   private String password;
   @Past private Date birthday = new GregorianCalendar(2000, 0, 1).getTime();

   public String getName() { return name; }   
   public void setName(String newValue) { name = newValue; }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }

   public Date getBirthday() { return birthday; }
   public void setBirthday(Date newValue) { birthday = newValue; }
}
