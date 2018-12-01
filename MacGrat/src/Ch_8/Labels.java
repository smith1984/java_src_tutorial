package Ch_8;

import javax.swing.*;

/**
 * Created by ito on 16.03.17.
 */
public class Labels extends JFrame {JPanel pnl = new JPanel( ) ;

    //ClassLoader ldr = this.getClass().getClassLoader() ;
    //ImageIcon duke = new ImageIcon( ldr.getResource( "duke.png" ) ) ;

    ImageIcon duke = new ImageIcon( "duke.png" ) ;
    JLabel lbl1 = new JLabel( duke ) ;
    JLabel lbl2 = new JLabel( "Дюк — талисман технологии Java." ) ;
    JLabel lbl3 = new JLabel( "Дюк" , duke , JLabel.CENTER ) ;


    public Labels()
    {
        super( "Окно Swing" ) ;
        setSize( 500 , 200 ) ;
        setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
        add( pnl ) ;
        lbl1.setToolTipText( "Дюк — талисман Java" ) ;
        lbl3.setHorizontalTextPosition( JLabel.CENTER ) ;
        lbl3.setVerticalTextPosition( JLabel.BOTTOM ) ;
        pnl.add( lbl1 ) ;
        pnl.add( lbl2 ) ;
        pnl.add( lbl3 ) ;

        setVisible( true ) ;
    }

    public static void main ( String[] args ) {

        Labels gui = new Labels() ;
    }
}
