package Cp_20;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;
class DrawAnim1 extends JFrame{
    private Image img;
    private int count;
    DrawAnim1(String s){
        super(s);
        MediaTracker tr = new MediaTracker(this);
        img = getToolkit().getImage("back2.jpg");
        tr.addImage(img, 0);
        try{
            tr.waitForID(0);
        }catch(InterruptedException e){}
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void update(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        int w = getSize().width, h = getSize().height;
        BufferedImage bi = (BufferedImage)createImage(w, h);
        Graphics2D big = bi.createGraphics();
// Заполняем фон изображением img.
        big.drawImage(img, 0, 0, this);
// Устанавливаем цвет рисования.
        big.setColor(Color.red);
// Рисуем в графическом контексте буфера круг,
// перемещающийся по синусоиде.
        big.fill(new Arc2D.Double(4*count, 50+30*Math.sin(count),
                50, 50, 0, 360, Arc2D.OPEN));
// Меняем цвет рисования.
        big.setColor(getForeground());
// Рисуем горизонтальную прямую
        big.draw(new Line2D.Double(0, 125, w, 125));
// Выводим изображение-буфер на экран.
        g2.drawImage(bi, 0, 0, this);
    }
    public void go(){
        while(count < 100){
            repaint();
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){}
            count++;
        }
    }
    public static void main(String[] args){
        DrawAnim1 f = new DrawAnim1(" Анимация");
        f.go();
    }
}
