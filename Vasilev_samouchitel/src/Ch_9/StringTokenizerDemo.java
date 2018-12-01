package Ch_9;

import java.util.*;
public class StringTokenizerDemo{
    public static void main(String[] args){
        // Базовый текст:
        String text="Очень простой текст: состоит из слов, и без цифр!";
        // Объект класса StringTokenizer:
        StringTokenizer str=new StringTokenizer(text);
        // Текстовая переменная:
        String s;
        while(str.hasMoreTokens()){
            // "Считывание" очередного слова:
            //s=str.nextToken();
            s=str.nextToken(" :,!");
            // Вывод слова на экран:
            System.out.println(s);}
    }
}
