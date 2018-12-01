package com.corejsf;
import java.io.Serializable;
import java.util.Date;

import javax.inject.Named; 
   // or import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped; 
   // or import javax.faces.bean.SessionScoped;

@SessionScoped
@Named("payment") // or @ManagedBean(name="payment")
public class PaymentBean implements Serializable {
   private double amount;
   private CreditCard card = new CreditCard("");
   private Date date = new Date();

   public void setAmount(double newValue) { amount = newValue; }
   public double getAmount() { return amount; }

   public void setCard(CreditCard newValue) { card = newValue; }
   public CreditCard getCard() { return card; }
   
   public void setDate(Date newValue) { date = newValue; }
   public Date getDate() { return date; }
}