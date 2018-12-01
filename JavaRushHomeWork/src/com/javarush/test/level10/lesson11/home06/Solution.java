package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static class Human
    {
        String name;
        String last_name;
        String adress;
        boolean sex;
        int age;
        int weight;

        public Human (String name){
        this.name = name;
        }

        public Human (String name, String last_name){
            this.name = name;
            this.last_name = last_name;
        }

        public Human (String name, String last_name, String adress){
            this.name = name;
            this.last_name = last_name;
            this.adress = adress;
        }

        public Human (String name, String last_name, String adress, boolean sex){
            this.name = name;
            this.last_name = last_name;
            this.adress = adress;
            this.sex = sex;
        }

        public Human (String name, String last_name, String adress, boolean sex, int age){
            this.name = name;
            this.last_name = last_name;
            this.adress = adress;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, String last_name, String adress, boolean sex, int age, int weight){
            this.name = name;
            this.last_name = last_name;
            this.adress = adress;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public Human (String name, String last_name, boolean sex, int age, int weight){
            this.name = name;
            this.last_name = last_name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public Human ( boolean sex, int age, int weight){
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public Human (String name, String last_name, boolean sex){
            this.name = name;
            this.last_name = last_name;
            this.sex = sex;
        }

        public Human ( boolean sex, int age){
            this.sex = sex;
            this.age = age;
        }
    }

}
