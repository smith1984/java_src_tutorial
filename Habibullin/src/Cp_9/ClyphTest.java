package Cp_9;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

class GlyphTest extends JFrame{
    GlyphTest(String s){
        super(s);
        setSize(400, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics gr){
        int h = 5;
        Graphics2D g = (Graphics2D)gr;
        FontRenderContext frc = g.getFontRenderContext();
        Font f = new Font("Serif", Font.BOLD, 30);
        GlyphVector gv = f.createGlyphVector(frc, "Пляшущий текст");
        int len = gv.getNumGlyphs();
        for (int i = 0; i < len; i++){
            Point2D.Double p = new Point2D.Double(25 * i, h = -h);
            gv.setGlyphPosition(i, p);
        }
        g.drawGlyphVector(gv, 10, 100);
    }
    public static void main(String[] args){
        new GlyphTest(" Вывод отдельных символов");
    }
}
