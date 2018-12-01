package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       List<String> list = new ArrayList<>();
        Collections.addAll(list, "мама", "мыла", "раму");
        list.add("именно");
        list.add(2,"именно");
        list.add(1,"именно");
        printList(list);
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
