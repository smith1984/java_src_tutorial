package Cp_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by ito on 29.11.16.
 */
public class Example_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку :");
        String str = reader.readLine();
        Example_3 example3 = new Example_3();
        System.out.println("В данном предложении количество слов - " + example3.count(str));
    }

    private int count(String str){
        StringTokenizer ins = new StringTokenizer(str, " \t\n\r,.:-");
        return ins.countTokens();
    }
}
