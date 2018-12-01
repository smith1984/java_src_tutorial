package Ch_8;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ito on 16.03.17.
 */
public class Layout extends JFrame {
    JPanel pnl = new JPanel( ) ;
    Container contentPane = getContentPane() ;
    JPanel grid = new JPanel( new GridLayout( 2 , 2 ) ) ;


    public Layout()
    {
        super( "Окно Swing" ) ;
        setSize( 500 , 200 ) ;
        setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
        add( pnl ) ;
        pnl.add( new JButton( "Да" ) ) ;
        pnl.add( new JButton( "Нет" ) ) ;
        pnl.add( new JButton( "Отмена" ) ) ;
        grid.add( new JButton( "1" ) ) ;
        grid.add( new JButton( "2" ) ) ;
        grid.add( new JButton( "3" ) ) ;
        grid.add( new JButton( "4" ) ) ;
        contentPane.add( "North" , pnl ) ;
        contentPane.add( "Center" , grid ) ;
        contentPane.add( "West" , new JButton( "Запад" ) ) ;
        setVisible( true ) ;
    }

    public static void main ( String[] args ) {
        Layout gui = new Layout() ;
    }
}
