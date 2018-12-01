package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        List<Integer> list = initializeList(10);
        printListBack(list);
    }

    public static List<Integer> initializeList(int n) throws IOException
    {

        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= n; i++)
            list.add(Integer.parseInt(reader.readLine()));
        return list;
    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static void printListBack(List<Integer> list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
            System.out.println(list.get(i));
    }
}
