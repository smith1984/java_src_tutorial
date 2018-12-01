package Cp_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ito on 23.11.16.
 */
public class Example_16 {
    public static void main (String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите натуральное число n: ");
        long n = Long.parseLong(reader.readLine());
        long del = 2;
        int max = 0;
        int stepen_del = 1;
        while (del <= n){
            if (n%del == 0)
                max = stepen_del;
            del = del*2;
            stepen_del ++;
        }
        System.out.print("Наибольшая степень числа 2, являющегося делителем числа n = " + n + " равняется - " + max);

    }
}
