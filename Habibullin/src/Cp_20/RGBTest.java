package Cp_20;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
public class RGBTest extends JFrame{
    private Image img, newimg;
    RGBTest(String s){
        super(s);
        img = getToolkit().getImage("javalogo52x88.gif");
        RGBImageFilter rgb = new ColorFilter();
        newimg = createImage(new FilteredImageSource(img.getSource(), rgb));
        setSize(400, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.drawImage(img, 10, 40, this);
        g.drawImage(newimg, 150, 40, this);
    }
    public static void main(String[] args){
        new RGBTest(" Изменение цвета");
    }
}
class ColorFilter extends RGBImageFilter{
    ColorFilter(){
        canFilterIndexColorModel = true;
    }
    public int filterRGB(int x, int y, int rgb){
        return rgb >> 1;
    }
}
