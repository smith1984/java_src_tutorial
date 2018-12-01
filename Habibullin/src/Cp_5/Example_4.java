package Cp_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ito on 29.11.16.
 */
public class Example_4 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку :");
        String str = reader.readLine();
        System.out.println("Введите слово :");
        String word = reader.readLine();
        Example_4 example_4 = new Example_4();
        example_4.find(str, word);
    }
    public void find (String str, String word){
        int n = 0;
        int index = str.indexOf(word);
        while (index != -1){
            n++;
            index = str.indexOf(word, index + 1);
        }
        System.out.println("В этом предложении количество слов - " + word +" равно - " + n);
    }
}
