import javax.swing.* ;
import java.awt.event.* ;
public class Lotto extends JFrame implements ActionListener
{
    // Компоненты.
    ClassLoader ldr = this.getClass().getClassLoader() ;
    java.net.URL iconURL = ldr.getResource( "Lotto.png" ) ;
    ImageIcon icon = new ImageIcon( "Lotto.png" ) ;
    JLabel img = new JLabel( icon ) ;
    JTextField txt = new JTextField( "" , 18 ) ;
    JButton btn = new JButton( "Показать счастливые номера" ) ;
    JPanel pnl = new JPanel() ;
    // Конструктор.
    public Lotto()
    {
        super( "Приложение Lotto" ) ; setSize( 260 , 200 ) ;
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
        pnl.add( img ) ;
        pnl.add( txt ) ;
        pnl.add( btn ) ;
        btn.addActionListener( this ) ;
        add( pnl ) ; setVisible( true ) ;
    }
// Обработчик событий.
public void actionPerformed( ActionEvent event )
{
    if ( event.getSource() == btn )
    {
        int[] nums = new int[50] ; String str = "" ;
        for ( int i = 1 ; i < 50 ; i++ ) { nums[i] = i ; }
        for ( int i = 1 ; i < 50 ; i++ )
        { int r = (int) ( 49 * Math.random() ) + 1 ;
            int temp= nums[i] ; nums[i]= nums[r] ; nums[r]= temp ; }
        for ( int i = 1 ; i < 7 ; i++ )
        { str += " " + Integer.toString( nums[i] ) + " " ; }
        txt.setText( str ) ;
    }
}// Точка входа.
    public static void main ( String[] args )
    { Lotto lotto = new Lotto() ; }
}
