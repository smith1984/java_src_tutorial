package Ch_5;

import java.io.PrintStream;

/**
 * Created by ito on 21.03.17.
 */
public class ShowBitsDemo {
    private static PrintStream out = System.out;
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        b.show(128, out);
        i.show(87987,out);
        li.show(237658768, out);
        b.show(87987, out);
    }
}
