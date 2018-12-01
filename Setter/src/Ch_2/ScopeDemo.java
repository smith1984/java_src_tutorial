package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class ScopeDemo {
    public static void main(String[] args){
        int x = 1;
        System.out.println("До вложенного блока x = " + x);

        {
            int y = 3;
            System.out.println("Во вложенном блоке x = " + x + ", y = " + y);
            x *=y;
        }

        System.out.println("После вложенного блока x = " + x);
    }

}
