package Cp_9;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;
class StillText extends JFrame{
    StillText(String s){
        super(s);
        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics gr){
        Graphics2D g = (Graphics2D)gr;
        int w = getSize().width, h = getSize().height;
        FontRenderContext frc = g.getFontRenderContext();
        String s = "Тень";
        Font f = new Font("Serif", Font.BOLD, h/3);
        TextLayout tl = new TextLayout(s, f, frc);
        AffineTransform at = new AffineTransform();
        at.setToTranslation(w/2-tl.getBounds().getWidth()/2, h/2);
        Shape sh = tl.getOutline(at);
        g.draw(sh);
        AffineTransform atsh = new AffineTransform(1, 0.0, 1.5, -1, 0.0, 0.0);
        g.transform(at);
        g.transform(atsh);
        Font df = f.deriveFont(atsh);
        TextLayout dtl = new TextLayout(s, df, frc);
        Shape sh2 = dtl.getOutline(atsh);
        g.fill(sh2);
    }
    public static void main(String[] args){
        new StillText(" Эффект тени");
    }
}
