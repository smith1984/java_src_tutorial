package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static List<Integer> list1;
    public static List<Integer> list2;
    public static List<Integer> list3;
    public static void main(String[] args) throws Exception
    {
        List<Integer> list = initializeList(20);
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        sort(list);
        printList(list1);
        printList(list2);
        printList(list3);

    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static List<Integer> initializeList(int n) throws IOException
    {

        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= n; i++)
            list.add(Integer.parseInt(reader.readLine()));
        return list;
    }

    public static void sort (List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 3 == 0)
                Solution.list1.add(list.get(i));
            if (list.get(i) % 2 == 0)
                Solution.list2.add(list.get(i));
            if (list.get(i) % 3 != 0 & list.get(i) % 2 != 0)
                Solution.list3.add(list.get(i));
        }
    }
}
