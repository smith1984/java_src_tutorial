package Cp_20;

import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.*;
public class Rescale extends JFrame{
    private BufferedImage bi;
    public Rescale(String s){
        super(s);
        Image img = getToolkit().getImage("javalogo52x88.gif");
        try{
            MediaTracker mt = new MediaTracker(this);
            mt.addImage(img, 0);
            mt.waitForID(0);
        }catch(Exception e){}
        bi = new BufferedImage(img.getWidth(this), img.getHeight(this),
                BufferedImage.TYPE_INT_RGB);
        Graphics2D big = bi.createGraphics();
        big.drawImage(img, 0, 0, this);
    }
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        int w = getSize().width;
        int bw = bi.getWidth(this);
        int bh = bi.getHeight(this);
        BufferedImage bimg =
                new BufferedImage(bw, bh, BufferedImage.TYPE_INT_RGB);
//---------- Начало определения преобразования ------------
        RescaleOp rop = new RescaleOp(0.5f, 70.0f, null);
        rop.filter(bi, bimg);
//---------- Конец определения преобразования -------------
        //---------------- Вставить в листинг 20.6 ---------------
        byte samples[][] = new byte[3][256];
        for (int j = 0; j < 255; j++){
            samples[0][j] = (byte)(255); // Красная составляющая.
            samples[1][j] = (byte)(0); // Зеленая составляющая.
            samples[2][j] = (byte)(0); // Синяя составляющая.
        }
        samples[0][255] = (byte)(255); // Цвет фона — белый.
        samples[1][255] = (byte)(255);
        samples[2][255] = (byte)(255);
        ByteLookupTable blut=new ByteLookupTable(0, samples);
        LookupOp lop = new LookupOp(blut, null);
        lop.filter(bi, bimg);
//------------------ Конец вставки ------------------------
        //-------------- Вставить в листинг 20.6 ------------------------
        float[] w1 = { 0.11111111f, 0.11111111f, 0.11111111f,
                0.11111111f, 0.11111111f, 0.11111111f,
                0.11111111f, 0.11111111f, 0.11111111f };
        Kernel kern = new Kernel(3, 3, w1);
        ConvolveOp cop = new ConvolveOp(kern, ConvolveOp.EDGE_NO_OP, null);
        cop.filter(bi, bimg);
//------------- Конец вставки ------------------------------------
        g2.drawImage(bi, null, 10, 30);
        g2.drawImage(bimg, null, w/2+3, 30);
    }
    public static void main(String[] args){
        JFrame f = new Rescale(" Изменение интенсивности");
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
