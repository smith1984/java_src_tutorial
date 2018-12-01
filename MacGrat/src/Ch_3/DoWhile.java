package Ch_3;

/**
 * Created by ito on 14.03.17.
 */
public class DoWhile {
    public static void main(String[] args){
        int num = 100;
        do
        {
            System.out.println( "Используем DoWhile: " + num ) ;
            num +=10;
        }
        while ( num < 0 );
    }
}
