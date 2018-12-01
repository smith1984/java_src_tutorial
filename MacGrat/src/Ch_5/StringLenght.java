package Ch_5;

/**
 * Created by ito on 15.03.17.
 */
public class StringLenght {
    public static void main (String[] args){
        String lang = "Java";
        String series = "in easy steps";
        String title = lang.concat(series);
        System.out.print( "\"" + title + "\" содержит " ) ;
        System.out.println( title.length() + " символов" ) ;
    }
}
