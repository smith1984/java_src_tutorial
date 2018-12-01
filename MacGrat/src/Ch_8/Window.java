package Ch_8;

import javax.swing.*;

/**
 * Created by ito on 15.03.17.
 */
class Window extends JFrame
{
    JPanel pnl = new JPanel( ) ;

    public Window()
    {
        super( "Окно Swing" ) ;
        setSize( 500 , 200 ) ;
        setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
        add( pnl ) ;
        setVisible( true ) ;
    }

    public static void main ( String[] args ) {
        Window gui = new Window() ;
    }
}