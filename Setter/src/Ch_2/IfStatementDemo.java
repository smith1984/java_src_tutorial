package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class IfStatementDemo {
    public static void main(String[] args){
        // объявление переменных и присвоение значений для a и b
        int a, b, c, d;
        a = 2; b = 3;
        System.out.println("a равно " + a + ", b равно " + b);

        //проверка на больше и меньше
        if ( a < b )
            System.out.println("a меньше b ");
        if ( a > b )
            System.out.println("Этот текст вы никогда не увидете");
        System.out.println("");

        c = a - b;
        System.out.println("c равно a - b = " + c);
        if ( c >= 0 )
            System.out.println("c положительное число");
        if ( c < 0 )
            System.out.println("c отрицательное число");
        System.out.println("");

        d = b - a;
        System.out.println("d равно b - a = " + d);
        if ( d >= 0 )
            System.out.println("d положительное число");
        if ( d < 0 )
            System.out.println("d отрицательное число");
        System.out.println("");

        if ( a + c != b)
            System.out.println("a плюс c  не равно b");

        if ( a + d == b)
            System.out.println("a плюс d  равно b");
    }//main
}//IfStatementDemo
