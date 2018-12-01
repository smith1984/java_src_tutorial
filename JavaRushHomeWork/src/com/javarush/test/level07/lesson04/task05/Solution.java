package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] bigArray = initializeArray(20);
        int[] smallArray_1 = initializeArray(10, bigArray, 0);
        int[] smallArray_2 = initializeArray(10, bigArray, 10);
        printArray(smallArray_2);
        //printArray(smallArray_1);

    }
    public static int[] initializeArray(int n) throws IOException
    {
        int[] array = new int[n];
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++){
            s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }

    public static int[] initializeArray(int n, int[] array, int a){
        int[] smallArray = new int[n];

        for (int i = 0; i < smallArray.length; i ++)
            smallArray[i] = array[i+a];
        return smallArray;
    }

    public static void printArray (int[] array){
        for (int i = 0; i < array.length; i ++)
            System.out.println(array[i]);
    }
}
