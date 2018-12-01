package Cp_18;

import java.applet.*;
import java.awt.*;
public class SimpleAudioImage extends Applet{
    private Image img;
    private AudioClip ac;
    public void init(){
        img = getImage(getDocumentBase(), "javalogo52x88.gif");
        ac = getAudioClip(getDocumentBase(), "yesterday.au");
    }
    public void start(){ ac.loop(); }
    public void paint(Graphics g){
        int w = img.getWidth(this), h = img.getHeight(this);
        g.drawImage(img, 0, 0, 2 * w, 2 * h, this);
    }
    public void stop(){ ac.stop(); }
}
