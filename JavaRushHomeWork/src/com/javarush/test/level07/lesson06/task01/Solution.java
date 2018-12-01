package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.prefs.BackingStoreException;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = initializeArrayList(5);
        System.out.println(list.size());
        printArrayList(list);
    }

    public static ArrayList<String> initializeArrayList(int n) throws IOException
    {

        ArrayList<String> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= n; i++)
            list.add(reader.readLine());
        return list;
    }

    public static void printArrayList (ArrayList<String> array){
        for (int i = 0; i < array.size(); i ++)
            System.out.println(array.get(i));
    }
}

