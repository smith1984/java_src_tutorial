package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class FactorialDemo {
    public static void main (String[] args){
        //Factorial factorial = new Factorial();
        System.out.println("Вычиисление факториала в цикле: ");
        for (int i = 6; i > 0; i--)
            System.out.println(i + "! = " + Factorial.ComputerI(i));
        System.out.println("Вычиисление факториала рекурсивным методом: ");
        for (int i = 1; i <= 6; i++)
            System.out.println(i + "! = " + Factorial.ComputerR(i));
    }
}

class Factorial{

    static long ComputerI (int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        return result;
    }

    static long ComputerR (int n){
        if (n == 1)
            return n;
        return ComputerR(n-1)*n;
    }
}

