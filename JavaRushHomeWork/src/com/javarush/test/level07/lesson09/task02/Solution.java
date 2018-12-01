package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = initializeArrayList(5);
        list.remove(2);
        printListBack(list);

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
