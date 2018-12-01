package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class NestVar {
    public static void main(String[] args){
        int count = 1;
        System.out.println("count = " + count);

        {
            //int count = 2;
            System.out.println("count = " + count);
            int n = 3;
            System.out.println("n = " +n);
        }
        {
            int n = 4;
            System.out.println("n = " +n);
        }
    }
}
