package Ch_5;

/**
 * Created by ito on 21.03.17.
 */
public class SecureDivisionOp {
    public static void main (String[] args){
        int result = 0;
        for (int divisor = -5; divisor <= 5; divisor++) {
            result = divisor!=0 ? 100/divisor : 0;
            if ((result != 0))
                System.out.println(result);
        }
    }
}
