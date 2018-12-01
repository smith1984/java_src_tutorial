package Cp_5;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку :");
        String str = reader.readLine();
        System.out.println("Введите символ :");
        char ch = (char) reader.read();
        Example_2 ex = new Example_2();
        ex.find(str, ch);
    }
    public void find (String str, char ch){
        int n = 0;
        int index = str.indexOf(ch);
        while (index != -1){
            n++;
            index = str.indexOf(ch, index + 1);
        }
        System.out.println("В этом предложении количество букв - " + ch +" равно - " + n);
    }
}
