package Ch_8;

import javax.swing.*;

/**
 * Created by ito on 16.03.17.
 */
public class Buttons extends JFrame {

    JPanel pnl = new JPanel( ) ;

    //ClassLoader ldr = this.getClass().getClassLoader() ;

    //java.net.URL tickURL = ldr.getResource( "tick.png" ) ;
    //java.net.URL crossURL = ldr.getResource( "cross.png" ) ;

    //ImageIcon tick = new ImageIcon( tickURL ) ;
    //ImageIcon cross = new ImageIcon( crossURL ) ;
    ImageIcon tick = new ImageIcon( "tick.png" ) ;
    ImageIcon cross = new ImageIcon( "cross.png" ) ;

    JButton btn = new JButton( "Нажми меня" ) ;
    JButton tickBtn = new JButton( tick ) ;
    JButton crossBtn = new JButton( "СТОП" , cross ) ;

    public Buttons()
    {
        super( "Окно Swing" ) ;
        setSize( 500 , 200 ) ;
        setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
        add( pnl ) ;
        pnl.add( btn ) ;
        pnl.add( tickBtn ) ;
        pnl.add( crossBtn ) ;
        setVisible( true ) ;
    }

    public static void main ( String[] args ) {
        Buttons gui = new Buttons() ;
    }
}
