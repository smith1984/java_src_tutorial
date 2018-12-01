package Ch_2;

/**
 * Created by ito on 18.01.17.
 */
public class UsingIf {
    public static void main (String[] args){
        int x = 3, y = 6, z;
        if (x != 0){
            z = y/x;
            System.out.println("Значение z = " + z);
        }
        else
            System.out.println("Деление на нноль!");
    }
}
