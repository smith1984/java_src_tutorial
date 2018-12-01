package Cp_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example_15 {
    public static void main (String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите натуральное число n: ");
        int n = Integer.parseInt(reader.readLine());
        long factorial = 1;
        for (int i = 2; i <= n; i++)
            factorial = factorial*i;
        System.out.println("Факториал числа " + n + " равен " + factorial);

    }
}
