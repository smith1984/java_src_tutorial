package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = operation(initializeArrayList(5));
        print(list);

    }

    public static ArrayList<String> initializeArrayList(int n) throws IOException
    {

        ArrayList<String> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= n; i++)
            list.add(reader.readLine());
        return list;
    }

    public static void print(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static ArrayList<String> operation (ArrayList<String> list){
        String s;
        for (int i = 1; i <=13; i ++){
            s = list.get(list.size()- 1);
            list.remove(list.size() - 1);
            list.add(0, s);
        }
        return list;
    }
}
