package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = initializeArrayList(10);

        ArrayList<String> result = doubleValues(list);

        printList(result);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        ArrayList<String> listNew = new ArrayList();
        for (String s:list)
        {
            listNew.add(s);
            listNew.add(s);
        }
        return listNew;
    }

    public static ArrayList<String> initializeArrayList(int n) throws IOException
    {

        ArrayList<String> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= n; i++)
            list.add(reader.readLine());
        return list;
    }

    public static void printList(List<String> list)
    {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
    public static void printListBack(List<String> list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
            System.out.println(list.get(i));
    }
}
