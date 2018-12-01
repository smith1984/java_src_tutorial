package Ch_5;

import java.io.PrintStream;

/**
 * Created by ito on 21.03.17.
 */
public class ByteBits {
    private static PrintStream out = System.out;

    public static void main(String[] args) {
        int t;
        byte val;

        val = 123;
        for (t = 128; t > 0; t = t/2) {
            if ((val & t) != 0)
                out.print("1");
            else
                out.print("0");
        }

    }
}
