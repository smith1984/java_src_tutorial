package Ch_5;

/**
 * Created by ito on 15.03.17.
 */
public class CharacterSwap {
    public static void main(String[] args){
        String txt = "" ;
        if ( txt.isEmpty() ) txt = " Боррокудо " ;
        System.out.println( "Строка: " + txt ) ;
        System.out.println( "Длина первоначальной строки: " + txt.length() ) ;
        txt = txt.trim() ;
        System.out.println( "Строка: " + txt ) ;
        System.out.println( "Длина строки: " + txt.length() ) ;
        char initial = txt.charAt(0) ;
        System.out.println( "Первая буква: " + initial ) ;
        initial = txt.charAt( ( txt.length() -1 ) );
        System.out.println( "Последняя буква: " + initial ) ;
        txt = txt.replace( 'о' , 'а' ) ;
        System.out.println( "Строка: " + txt ) ;
    }
}
