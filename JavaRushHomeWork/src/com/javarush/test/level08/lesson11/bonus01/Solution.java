package com.javarush.test.level08.lesson11.bonus01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде:
«May is 5 month».
Используйте коллекции.
*/
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String mon = readLine(bufferedReader());
        String monToUpperCase = toUpperCase(mon);
        otvet(creatMapAng(), creatMapRu(), mon, monToUpperCase);
    }
    public static HashMap creatMapAng() {
        HashMap<String, Integer> mapAng = new HashMap<String, Integer>();
        mapAng.put("JANUARY", 1);
        mapAng.put("FEBRUARY", 2);
        mapAng.put("MARCH", 3);
        mapAng.put("APRIL", 4);
        mapAng.put("MAY", 5);
        mapAng.put("JUNE", 6);
        mapAng.put("JULY", 7);
        mapAng.put("AUGUST", 8);
        mapAng.put("SEPTEMBER", 9);
        mapAng.put("OCTOBER", 10);
        mapAng.put("NOVEMBER", 11);
        mapAng.put("DECEMBER", 12);
        mapAng.put("JAN", 1);
        mapAng.put("FEB", 2);
        mapAng.put("MAR", 3);
        mapAng.put("APR", 4);
        mapAng.put("JUN", 6);
        mapAng.put("JUL", 7);
        mapAng.put("AUG", 8);
        mapAng.put("SEPT", 9);
        mapAng.put("OCT", 10);
        mapAng.put("NOV", 11);
        mapAng.put("DEC", 12);
        return mapAng;
    }
    public static HashMap creatMapRu() {
        HashMap<String, Integer> mapRu = new HashMap<String, Integer>();
        mapRu.put("ЯНВАРЬ", 1);
        mapRu.put("ФЕВРАЛЬ", 2);
        mapRu.put("МАРТ", 3);
        mapRu.put("АПРЕЛЬ", 4);
        mapRu.put("МАЙ", 5);
        mapRu.put("ИЮНЬ", 6);
        mapRu.put("ИЮЛЬ", 7);
        mapRu.put("АВГУСТ", 8);
        mapRu.put("СЕНТЯБРЬ", 9);
        mapRu.put("ОКТЯБРЬ", 10);
        mapRu.put("НОЯБРЬ", 11);
        mapRu.put("ДЕКАБРЬ", 12);
        mapRu.put("ЯНВ", 1);
        mapRu.put("ФЕВ", 2);
        mapRu.put("МАР", 3);
        mapRu.put("АПР", 4);
        mapRu.put("МАЙ", 5);
        mapRu.put("ИЮН", 6);
        mapRu.put("ИЮЛ", 7);
        mapRu.put("АВГ", 8);
        mapRu.put("СЕН", 9);
        mapRu.put("ОКТ", 10);
        mapRu.put("НОЯ", 11);
        mapRu.put("ДЕК", 12);
        return mapRu;
    }
    public static BufferedReader bufferedReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader;
    }
    public static String readLine(BufferedReader reader) throws IOException {
        String mon = reader.readLine();
        return mon;
    }
    public static String toUpperCase(String month) {
        String monToUpperCase = month.toUpperCase();
        return monToUpperCase;
    }
    public static void otvet(HashMap<String, Integer> mapAng, HashMap<String, Integer> mapRu, String mon, String monToUpperCase) {
        int m = 0, mRu = 0;
        for (Map.Entry<String, Integer> pair : mapAng.entrySet()) if (monToUpperCase.equals(pair.getKey())) m = pair.getValue();
        for (Map.Entry<String, Integer> pair : mapRu.entrySet()) if (monToUpperCase.equals(pair.getKey())) mRu = pair.getValue();
        if (m != 0) System.out.println(mon + " is " + m + " month");
        else if (mRu != 0) System.out.println(mon + " - " + mRu + " месяц года");
        else System.out.println(mon + " - нет такого месяца");
    }
}
