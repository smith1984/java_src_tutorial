package Ch_6;

/**
 * Created by ito on 15.03.17.
 */
public class SuperClass {
    public static void hello( )
    {
        System.out.println( "Привет из Суперкласса" ) ;
    }

    public static void echo( String arg )
    {
        try
        { System.out.println( "Вы ввели: " + arg ) ; }
        catch( Exception e )
        { System.out.println( "Требуется аргумент" ) ; }
    }
}
