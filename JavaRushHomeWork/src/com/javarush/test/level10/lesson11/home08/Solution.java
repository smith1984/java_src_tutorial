package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] arrayOfStringList = new ArrayList[(int)(Math.random()*10)];
        for (int i = 0 ; i < arrayOfStringList.length; i ++)
        {
            ArrayList<String> arrayList = new ArrayList<>();
            for (int j = 0; j < (int)(Math.random()*10); j++)
                arrayList.add(Integer.toString((int)(Math.random()*10)));
            arrayOfStringList[i] = arrayList;
        }


        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}