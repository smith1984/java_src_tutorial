package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class GradualCastDemo {
    public static void main(String [] asrgs){
        byte x, z;
        int y;
        x = 5;
        y = x * x;
        z = (byte) (x*x);
        System.out.println("z = " + z + "\nx = " + y);
    }
}
