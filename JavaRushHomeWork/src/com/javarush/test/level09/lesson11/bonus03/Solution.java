package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (String x : array)
        {
            if (isNumber(x))
                integerArrayList.add(Integer.parseInt(x));
            else
                stringArrayList.add(x);
        }

        String min;
        for (int i = 0; i < stringArrayList.size(); i++)
            for (int j = 0; j < stringArrayList.size(); j++){
                min = stringArrayList.get(i);
                if (isGreaterThan(stringArrayList.get(j), min)){
                    String sj = stringArrayList.get(j);
                    stringArrayList.set(j, min);
                    stringArrayList.set(i, sj);
                }
            }

        int max;
        for (int i = 0; i < integerArrayList.size(); i++)
            for (int j = 0; j < integerArrayList.size(); j++){
                max = integerArrayList.get(i);
                if (integerArrayList.get(j) < max){
                    int ij = integerArrayList.get(j);
                    integerArrayList.set(j, max);
                    integerArrayList.set(i, ij);
                }
            }

        int i = 0;
        int j = 0;
        for (int k = 0; k < array.length; k++)
        {
            if (isNumber(array[k])){
                array[k] = "" + integerArrayList.get(i);
                i++;
            }
            else{
                array[k] = stringArrayList.get(j);
                j++;
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
