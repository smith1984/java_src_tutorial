package Ch_6;

import java.util.Date;

/**
 * Created by ito on 21.03.17.
 */
public class DatePartDemo {
    public static void main(String[] args) {
        Date newDate = new Date();
        DatePart datePart = new DatePart(newDate);
        int month = datePart.getMonth();
        System.out.println(month);
    }
}
