package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class DivisionDemo {
    public static void main (String[] args){
        int iresult, iremain;
        double dresult, dremain;

        iresult = 10 / 3;
        iremain = 10 % 3;

        dremain = 10.0 % 3.0;
        dresult = 10.0 / 3.0;
        System.out.println("Частное от деления 10 / 3 = " + iresult);
        System.out.println("Остаток от деления 10 / 3 = " + iremain);
        System.out.println("Деления 10.0 / 3.0 = " + dresult);
        System.out.println("Остаток от деления 10.0 / 3.0 = " + dremain);
    }
}
