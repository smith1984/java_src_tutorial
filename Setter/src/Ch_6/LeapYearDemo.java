package Ch_6;

import java.util.GregorianCalendar;

/**
 * Created by ito on 21.03.17.
 */
public class LeapYearDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        for (int y = 1996; y <= 2017; y++)
            if (gc.isLeapYear(y))
                System.out.println(y);
    }
}
