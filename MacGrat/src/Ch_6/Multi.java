package Ch_6;

/**
 * Created by ito on 15.03.17.
 */
class Multi
{
    public static void main ( String[] args ) {
        String msg = "Это локальная переменная класса Multi" ;
        System.out.println( msg ) ;
        System.out.println( Data.txt ) ;
        Data.greeting() ;
        Draw.line() ;
    }
}
