package Ch_4;

/**
 * Created by ito on 14.03.17.
 */
public class Convert {
        public static void main ( String[] args ) {
            float daysFloat = 365.25f ;
            String weeksString = "52" ;
            int daysInt = (int) daysFloat ;
            int weeksInt = Integer.parseInt( weeksString ) ;
            int week = ( daysInt / weeksInt ) ;
            System.out.println( "Дней в неделе: " + week ) ;
        }
}
