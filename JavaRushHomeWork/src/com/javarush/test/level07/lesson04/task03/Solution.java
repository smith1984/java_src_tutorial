package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] arrayString = initializeArrayString();
        int[] array = initializeArray(arrayString);
        printArray(array);
        //printArray(arrayString);
    }

    public static String[] initializeArrayString() throws IOException
    {
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++)
            array[i] = reader.readLine();

        return array;
    }

    public static int[] initializeArray(String[] arrayStr){
        int[] array = new int[10];

        for (int i = 0; i < array.length; i ++)
            array[i] = arrayStr[i].length();
        return array;
    }

    public static void printArray (int[] array){
        for (int i = 0; i < array.length; i ++)
            System.out.println(array[i]);
    }

    public static void printArray (String[] array){
        for (int i = 0; i < array.length; i ++)
            System.out.println(array[i]);
    }
}
