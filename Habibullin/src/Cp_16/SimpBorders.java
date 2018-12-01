package Cp_16;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class SimpBorders extends JFrame{
    SimpBorders(){
        super(" Простые рамки");
        setLayout(new FlowLayout());
        JButton l1 = new JButton(" EmptyBorder() ");
        l1.setBackground(Color.white);
        l1.setBorder(BorderFactory.createEmptyBorder());
        JLabel l2 = new JLabel(" LineBorder(Color.blue, 3) ");
        l2.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
        JLabel l3 = new JLabel(" BevelBorder(BevelBorder.RAISED) ");
        l3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        JLabel l4 = new JLabel(" BevelBorder(BevelBorder.LOWERED) ");
        l4.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        JLabel l5 = new JLabel(" Объемная двухцветная рамка ");
        l5.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,
                Color.black, Color.white, Color.black, Color.white));
        JLabel l6 = new JLabel(" EtchedBorder() ");
        l6.setBorder(BorderFactory.createEtchedBorder());
        add(l1); add(l2); add(l3);
        add(l4); add(l5); add(l6);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new SimpBorders();
    }
}
