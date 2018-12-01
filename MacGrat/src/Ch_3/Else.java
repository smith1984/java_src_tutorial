package Ch_3;

/**
 * Created by ito on 14.03.17.
 */
public class Else {
    public static void main(String[] args){
        int hrs = 11;
        if (hrs < 13 )
            System.out.println("Доброе утро: " +hrs);
        else
            if (hrs < 18)
                System.out.println("Добрый день: " + hrs);
        else
            System.out.println("Добрый вечер: " + hrs);
    }
}
