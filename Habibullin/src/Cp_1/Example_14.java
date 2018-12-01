package Cp_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ito on 23.11.16.
 */
public class Example_14 {
    public static void main (String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ввведите координату x = ");
        Double x = Double.parseDouble(reader.readLine());
        System.out.print("Ввведите координату y = ");
        Double y = Double.parseDouble(reader.readLine());
        boolean z;
        if (Math.sqrt(x*x + y*y) <= 1)
            z = true;
        else
            z = false;
        System.out.println("Точка с данными координатами находится в еденичной окружности это - " +  z);
    }
}
