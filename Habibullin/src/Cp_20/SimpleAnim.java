package Cp_20;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SimpleAnim extends JFrame{
    private Image[] img = new Image[10];
    private int count;
    SimpleAnim(String s){
        super(s);
        MediaTracker tr = new MediaTracker(this);
        for (int k = 0; k < 10; k++){
            img[k] = getToolkit().getImage("run"+(k+1)+".gif");
            tr.addImage(img[k], 0);
        }
        try{
            tr.waitForAll(); // Ждем загрузки всех изображений.
        }catch(InterruptedException e){}
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.clearRect(0, 0, getSize().width, getSize().height);
        g.drawImage(img[count % 10], 0, 0, this);
    }
    public void go(){
        while(count < 100){
            repaint(); // Выводим следующий кадр.
            try{ // Задержка в 0,1 сек.
                Thread.sleep(100);
            }catch(InterruptedException e){}
            count++;
        }
    }
    public static void main(String[] args){
        SimpleAnim f = new SimpleAnim(" Простая анимация");
        f.go();
    }
}
