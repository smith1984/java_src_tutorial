package Ch_6;

/**
 * Created by ito on 15.03.17.
 */
class Methods
{
    public static void main ( String[] args ) {
        System.out.println( "Сообщение из главного метода." ) ;
        sub() ;
    }

    public static void sub()
    {
        System.out.println( "Сообщение из метода sub." ) ;
    }
}
