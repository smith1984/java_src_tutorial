package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class ExplicitCast {
    public static void main(String [] args){
        long l = 10;
        double d = l;
        l = (long) d;
        System.out.println("l = " + l);
    }
}
