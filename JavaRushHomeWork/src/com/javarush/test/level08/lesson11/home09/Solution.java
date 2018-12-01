package com.javarush.test.level08.lesson11.home09;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        isDateOdd("MAY 1 2013");
    }

    public static boolean isDateOdd(String date) throws Exception
    {
        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        format.applyPattern("MMMM d yyyy");
        Date date_= format.parse(date);
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(0);
        yearStartTime.setMonth(0);
        yearStartTime.setYear(date_.getYear());
        long day = (int)(date_.getTime() - yearStartTime.getTime()) / (1000*3600*24);
        if (day % 2 == 0 )
            return false;
        else
            return true;
    }
}
