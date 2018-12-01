package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        ArrayList<Integer> value = new ArrayList<>();
        for (int i = 0; i < alphabet.size(); i++)
            value.add(0);
        for (String str : list){
            char [] chars = str.toCharArray();
            for (int j = 0; j < chars.length; j++)
                for (int i = 0; i < alphabet.size(); i++)
                    if (alphabet.get(i).equals(chars[j]))
                        value.set(i, value.get(i) + 1);
        }
        for (int i = 0; i < alphabet.size(); i++)
            System.out.println(alphabet.get(i) + " " + value.get(i));


    }

}
