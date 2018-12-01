package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class BoolDemo {
    public static void main(String[] args){
        boolean b;
        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);
        if (b)
            System.out.println("Как вы думаете увидите эту строку? Да");
        System.out.println("Выражение 10 > 9 примет значение " + (10 > 9));
    }
}//BoolDemo
