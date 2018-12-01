package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class BreakDemo {
    public static void main(String[] args){
        int nmax = 25;
        for (int i = 0; i <= nmax; i++){
            if (i*i > nmax)
                break;
            System.out.println("i = " + i + " i в квадрате равно " + i*i);
        }
        System.out.println("Конец цикла/");
    }
}
