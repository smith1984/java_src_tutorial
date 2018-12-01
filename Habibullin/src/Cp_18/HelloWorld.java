package Cp_18;

import java.awt.*;
import java.applet.*;
public class HelloWorld extends Applet{
    public void init(){
        setBackground(Color.white);
        String font = "Serif";
        int style = Font.PLAIN, size = 10;
        font = getParameter("fontName");
        style = Integer.parseInt(getParameter("fontStyle"));
        size = Integer.parseInt(getParameter("fontSize"));
        setFont(new Font(font, style, size));
    }
    public void paint(Graphics g){
        g.drawString("Hello, XXI century World!", 10, 30);
    }
}
