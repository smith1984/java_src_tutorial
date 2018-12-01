package com.javarush.test.level08.lesson08.task04;

import java.lang.ref.SoftReference;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stalloneq", new Date("JUNE 1 1980"));
        map.put("Stallonea", new Date("JUNE 1 1980"));
        map.put("Stallonez", new Date("JUNE 1 1980"));
        map.put("Stallonex", new Date("JUNE 1 1980"));
        map.put("Stallones", new Date("JUNE 1 1980"));
        map.put("Stallonew", new Date("MARCH 1 1980"));
        map.put("Stallonee", new Date("JUNE 1 1980"));
        map.put("Stalloned", new Date("JUNE 1 1980"));
        map.put("Stalloner", new Date("JUNE 1 1980"));
        map.put("Stallonef", new Date("JUNE 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() == 5 | pair.getValue().getMonth() == 6 | pair.getValue().getMonth() == 7)
                iterator.remove();
        }

    }
}
