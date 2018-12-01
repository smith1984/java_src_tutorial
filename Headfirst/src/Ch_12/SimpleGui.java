package Ch_12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGui implements ActionListener{
    JFrame frame;

    public static void main (String[] args){
        SimpleGui gui = new SimpleGui();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel_1 drawPanel = new MyDrawPanel_1();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent event){
        frame.repaint();
    }
}
class MyDrawPanel_1 extends JPanel{
    public void paintComponent (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math. random () * 255);
        int blue = (int) (Math. random() * 255);
        Color color = new Color(red, green, blue);
        g.setColor(color);
        g.fillRect (0, 0, this.getWidth () , this.getHeight ()) ;
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);
        GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }
}
