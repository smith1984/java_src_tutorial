package Ch_2;

/**
 * Created by ito on 17.03.17.
 */
public class SwitchDemo {
    public static void main(String[] args){
        for (int x = 1; x < 14; x++)
            switch (x){
                case 1:case 2:case 12:
                    System.out.println(x + ": Winter");
                    break;
                case 3:case 4:case 5:
                    System.out.println(x + ": Spring");
                    break;
                case 6:case 7:case 8:
                    System.out.println(x + ": Summer");
                    break;
                case 9:case 10:case 11:
                    System.out.println(x + ": Fall");
                    break;
                default:
                    System.out.println(x + ": Нет такого месяца");

            }
    }
}
