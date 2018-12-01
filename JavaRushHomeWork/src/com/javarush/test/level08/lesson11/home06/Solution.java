package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList< Human> children = new ArrayList<>();
        ArrayList< Human> children_m_f = new ArrayList<>();
        ArrayList< Human> children_gm1_gf1 = new ArrayList<>();
        ArrayList< Human> children_gm2_gf2 = new ArrayList<>();
        Human grandfather1 = new Human("Peter", true, 90,children_gm1_gf1);
        Human grandfather2 = new Human("David", true, 90, children_gm2_gf2);
        Human grandmother1 = new Human("Ann", false, 90, children_gm1_gf1);
        Human grandmother2 = new Human("Juli", false, 90, children_gm2_gf2);
        Human father = new Human("David", true, 50, children_m_f);
        Human mother = new Human("Ann", false, 50, children_m_f);
        Human son1 = new Human("Dav", true, 30, children);
        Human son2 = new Human("Pet", true, 30, children);
        Human daughter = new Human("Davi", false, 30, children);
        children_gm1_gf1.add(father);
        children_gm2_gf2.add(mother);
        children_m_f.add(son1);
        children_m_f.add(son2);
        children_m_f.add(daughter);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human
    {
        private String name;
        private Boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, Boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
