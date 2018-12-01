package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class OddNumDemo {
    public static void main (String[] args){
        for (int i = 1; i <=10; i++){
            if (i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}
