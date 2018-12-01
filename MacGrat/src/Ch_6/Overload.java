package Ch_6;

/**
 * Created by ito on 15.03.17.
 */
class Overload
{
    public static void main ( String[] args ) {
        System.out.println( write( 12 ) ) ;
        System.out.println( write( "Двенадцать" ) ) ;
        System.out.println( write( 4 , 16 ) ) ;
    }
    public static String write( int num )
    { return ( "Переданное целое " + num ) ; }

    public static String write( String num )
    { return ( "Переданное строковое " + num ) ; }

    public static String write( int num1 , int num2 )
    { return ( "Результат равен " + ( num1 * num2 ) ) ; }
}