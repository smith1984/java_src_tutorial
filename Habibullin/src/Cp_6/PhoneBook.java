package Cp_6;

import java.util.*;
class PhoneBook{
    public static void main(String[] args){
        Hashtable<String, String> yp = new Hashtable<>();
        String name = null;
        yp.put("John", "123-45-67");
        yp.put("Lennon", "567-34-12");
        yp.put("Bill", "342-65-87");
        yp.put("Gates", "423-83-49");
        yp.put("Batman", "532-25-08");
        try{
            name = args[0];
        }catch(Exception e){
            System.out.println("Usage: java PhoneBook Name");
            return;
        }
        if (yp.containsKey(name))
            System.out.println(name + "'s phone = " + yp.get(name));
        else
            System.out.println("Sorry, no such name");
    }
}