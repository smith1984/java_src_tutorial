package Ch_2;

/**
 * Created by ito on 14.03.17.
 */
public class Arithmetic {
    public static void main (String[] args){
        int num = 100;
        int factor = 20;
        int sum = 0;

        sum = num + factor;
        System.out.println("Результат сложения: " + sum);

        sum = num - factor;
        System.out.println("Результат вычитания: " + sum);

        sum = num * factor;
        System.out.println("Результат умножения: " + sum);

        sum = num / factor;
        System.out.println("Результат деления: " + sum);
    }
}
