package Ch_3;

/**
 * Created by ito on 14.03.17.
 */
public class Label {
    public static void main(String[] args){
        outerLoop : for ( int i = 1 ; i < 4 ; i++ )
        {
            for ( int j = 1 ; j < 4 ; j++ )
            {
                if ( i == 1 && j == 1 )
                {
                    System.out.println( "outerLoop продолжает работу при i=" +i+ " j=" +j ) ;
                    continue outerLoop ;
                }
                if ( i == 2 && j == 3 )
                {
                    System.out.println( "Выход из outerLoop при i=" +i+ " j=" +j ) ;
                    break outerLoop ;
                }
                System.out.println( "Итерация i="+i+" j="+j ) ;
            }
        }
    }
}
