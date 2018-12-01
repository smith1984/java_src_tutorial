package Cp_5;

import java.util.*;
class MyParser{
    public static void main(String[] args){
        String s = "Строка, которую мы хотим разобрать на слова";
        StringTokenizer st = new StringTokenizer(s, " \t\n\r,.");
        while(st.hasMoreTokens()){
// Получаем слово и что-нибудь делаем с ним, например
// просто выводим на экран
            System.out.println(st.nextToken());
        }
    }
}
