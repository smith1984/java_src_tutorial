package Cp_8;

import java.awt.*;
import javax.swing.*;
class SimpleFrameSwing extends JFrame{
    private SimpleFrameSwing(String s){
        super(s);
        setBackground(Color.WHITE);
        setSize(400, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.setFont(new Font("Serif", Font.ITALIC|Font.BOLD, 30));
        g.drawString("Hello, XXI Century World!", 20, 100);
    }
    public static void main(String[] args){
        new SimpleFrameSwing(" Моя программа");
    }
}
