package Cp_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ito on 23.11.16.
 */
public class Example_13 {
    public static void main (String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int y;
        int x = Integer.parseInt(reader.readLine());
        if (x < 0)
            y = x + 1;
        else
            if (x == 0)
                y = x + 2;
            else
                y = x+10;
        System.out.println(y);
    }
}
