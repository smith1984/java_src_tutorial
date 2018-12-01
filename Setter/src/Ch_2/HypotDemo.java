package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class HypotDemo {
    public static void main (String[] args){
        double cathetus1, cathetus2, hypot;
        cathetus1 = 3;
        cathetus2 = 4;
        hypot = Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));
        System.out.println("Гипотенуза равна " + hypot);
    }//main()
}//HypotDEmo
