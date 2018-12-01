package Ch_6;

/**
 * Created by ito on 15.03.17.
 */
class Scope
{
    final static String txt =
            "Это глобальная переменная класса Scope" ;
    public static void main ( String[] args ) {
        String txt = "Это локальная переменная метода main" ;
        System.out.println( txt ) ;
        sub();
        System.out.println( Scope.txt ) ;
    }
    public static void sub( ) {
        //String txt = "Это локальная переменная метода sub" ;
        System.out.println( txt ) ;
    }
}