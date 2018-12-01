package Ch_6;

/**
 * Created by ito on 15.03.17.
 */
class SubClass extends SuperClass
{
    public static void main ( String[] args ) {
        hello() ;
        SuperClass.hello() ;
        try
        { echo( args[0] ) ;}
        catch( Exception e )
        { System.out.println( "Требуется аргумент" ) ; }
    }
    public static void hello()
    {
        System.out.println( "Привет из Подкласса" ) ;
    }
}
