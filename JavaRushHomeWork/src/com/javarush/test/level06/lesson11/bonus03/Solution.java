package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static int a,b,c,d,e;
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());
        e = Integer.parseInt(reader.readLine());
        int m;
        for (int i = 1; i <= 5; i++)
        {
            m = a;
            if (b < a)
            {
                a = b;
                b = m;
            }
            m = b;
            if (c < b)
            {
                b = c;
                c = m;
            }
            m = c;
            if (d < c)
            {
                c = d;
                d = m;
            }
            m = d;
            if (e < d)
            {
                d = e;
                e = m;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
