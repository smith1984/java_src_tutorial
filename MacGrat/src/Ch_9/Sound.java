package Ch_9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ito on 16.03.17.
 */
public class Sound extends JFrame implements ActionListener {
    JPanel pnl = new JPanel( ) ;

    ClassLoader ldr = this.getClass().getClassLoader() ;
    java.applet.AudioClip audio =
            JApplet.newAudioClip( ldr.getResource( "music.wav" ) ) ;

    JButton playBtn = new JButton( "Играть" ) ;
    JButton stopBtn = new JButton( "Стоп" ) ;

    public Sound()
    {
        super( "Окно Swing" ) ;
        setSize( 500 , 200 ) ;
        setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
        add( pnl ) ;
        pnl.add( playBtn ) ;
        pnl.add( stopBtn ) ;

        setVisible( true ) ;
    }

    public void actionPerformed( ActionEvent event ) {
        if ( event.getSource() == playBtn ) audio.play() ;
        if ( event.getSource() == stopBtn ) audio.stop() ;
    }

    public static void main ( String[] args ) {
        Sound gui = new Sound() ;
    }
}
