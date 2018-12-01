package Ch_12;

import java.applet.*;
import java.awt.*;
public class ShowStringApplet extends Applet{
    public void init(){
        setBackground(Color.YELLOW);
        setFont(new Font("Serief",Font.BOLD,18));
    }
    public void paint(Graphics g){
        g.drawString("Это очень простой апплет!",10,50);
    }}