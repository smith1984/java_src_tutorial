package Ch_8;

import javax.swing.*;

/**
 * Created by ito on 16.03.17.
 */
public class TextFields extends JFrame{
    JPanel pnl = new JPanel( ) ;

    JTextField txt1 = new JTextField( 38 ) ;
    JTextField txt2 = new JTextField( "Текст по умолчанию" , 38 ) ;

    JTextArea txtArea = new JTextArea( 5 , 37 ) ;
    JScrollPane pane = new JScrollPane( txtArea ) ;

    public TextFields()
    {
        super( "Окно Swing" ) ;
        setSize( 500 , 200 ) ;
        setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
        add( pnl ) ;
        txtArea.setLineWrap( true ) ;
        txtArea.setWrapStyleWord( true ) ;
        pane.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ) ;
        pnl.add( txt1 ) ;
        pnl.add( txt2 ) ;
        pnl.add( pane ) ;

        setVisible( true ) ;
    }

    public static void main ( String[] args ) {
        TextFields gui = new TextFields() ;
    }
}
