package Ch_2;

/**
 * Created by ito on 14.03.17.
 */
public class Precedence {
    public static void main (String[] args){
        int sum = 32 - 8 + 16 * 2 ; // 16 x 2 = 32, + 24 = 56
        System.out.println( "Порядок действий по умолчанию: " + sum ) ;
        sum = ( 32 - 8 + 16 ) * 2 ; // 24 + 16 = 40, x 2 = 80
        System.out.println( "Указанный порядок действий: " + sum ) ;
        sum = ( 32 - (8 + 16) ) * 2 ; // 32 - 24 = 8, * 2 = 16
        System.out.println( "Специфичный порядок действий: " + sum ) ;
    }

}
