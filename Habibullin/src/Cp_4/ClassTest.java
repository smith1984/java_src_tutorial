package Cp_4;

import java.lang.reflect.*;
class ClassTest{
    public static void main(String[] args){
        Class c = null, c1 = null, c2 = null;
        Field[] fld = null;
        String s = "Some string";
        c = s.getClass();
        try{
            c1 = Class.forName("java.lang.String"); // Старый стиль
            c2 = java.lang.String.class; // Новый стиль
            if (!c1.isPrimitive())
                fld = c1.getDeclaredFields(); // Все поля класса String
        }catch(Exception e){}
        System.out.println("Class c: " + c);
        System.out.println("Class c1: " + c1);
        System.out.println("Class c2: " + c2);
        System.out.println("Superclass c: " + c.getSuperclass());
        System.out.println("Package c: " + c.getPackage());
        System.out.println("Modifiers c: " + c.getModifiers());
        for(int i = 0; i < fld.length; i++)
            System.out.println(fld[i]);
    }
}