package Ch_10;

import javax.swing.*;
import java.awt.event.*;

public class LottoApplet extends JApplet implements ActionListener
{
    // Компоненты.
    //ClassLoader ldr = this.getClass().getClassLoader() ;
    //java.net.URL iconURL = ldr.getResource( "Lotto.png" ) ;
    ImageIcon icon = new ImageIcon( "Lotto.png" ) ;
    JLabel img = new JLabel( icon ) ;
    JTextField txt = new JTextField( "" , 18 ) ;
    JButton btn = new JButton( "Показать счастливые номера" ) ;
    JPanel pnl = new JPanel() ;
    // Точка входа апплета.
    public void init()
    {
        add( pnl ) ;
        pnl.add( img ) ; pnl.add( txt ) ; pnl.add( btn ) ;
        btn.addActionListener( this ) ;
        String bgStr = getParameter( "BgColor" ) ;
        int bgHex = Integer.parseInt( bgStr , 16 ) ;
        pnl.setBackground( new java.awt.Color( bgHex ) ) ;

    }
    // Обработчик событий.
    public void actionPerformed( ActionEvent event )
    {
        if ( event.getSource() == btn )
        {
            int[] nums = new int[50] ; String str = "" ;
            for ( int i = 1 ; i < 50 ; i++ ) { nums[ i ] = i ; }
            for ( int i = 1 ; i < 50 ; i++ )
            {
                int r = (int) Math.ceil( 49 * Math.random() ) + 1 ;
                int temp=nums[i]; nums[i]=nums[r]; nums[r]=temp;
            }
            for ( int i = 1 ; i < 7 ; i++ )
            { str += " " + Integer.toString( nums[ i ] ) + " " ; }
            txt.setText( str ) ;
        }
    }
}