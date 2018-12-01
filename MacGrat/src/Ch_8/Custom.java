package Ch_8;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ito on 16.03.17.
 */
public class Custom extends JFrame {
    JPanel pnl = new JPanel( ) ;

    JLabel lbl1 = new JLabel( "Пользовательский задний фон" ) ;
    JLabel lbl2 = new JLabel( "Пользовательский передний фон" ) ;
    JLabel lbl3 = new JLabel( "Пользовательский шрифт" ) ;

    Color customColor = new Color(146, 199, 255) ;
    Font customFont = new Font( "Serif" , Font.PLAIN , 32 ) ;

    public Custom()
    {
        super( "Окно Swing" ) ;
        setSize( 500 , 200 ) ;
        setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
        add( pnl ) ;
        lbl1.setOpaque( true ) ;
        lbl1.setBackground( Color.YELLOW ) ;
        lbl2.setForeground( customColor ) ;
        lbl3.setFont( customFont ) ;
        pnl.add( lbl1 ) ; pnl.add( lbl2 ) ; pnl.add( lbl3 ) ;
        setVisible( true ) ;
    }

    public static void main ( String[] args ) {
        Custom gui = new Custom() ;
    }
}
