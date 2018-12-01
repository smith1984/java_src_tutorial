package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int sum = 0;
        int si =0;
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        while (!s.equals("сумма")){
            si = Integer.parseInt(s);
            sum = sum + si;
            s = reader.readLine();
        }
        System.out.println(sum);
    }
}
