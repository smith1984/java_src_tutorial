package Cp_14;

import java.awt.*;
import javax.swing.*;
class BorderTest extends JFrame{
    BorderTest(String s){
        super(s);
        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("Center"));
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args){
        JFrame f= new BorderTest(" Менеджер BorderLayout");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}