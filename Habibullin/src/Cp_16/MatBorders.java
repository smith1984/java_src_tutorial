package Cp_16;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class MatBorders extends JFrame{
    MatBorders(){
        super(" Рамки с изображениями и разной толщины");
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel(" MatteBorder(Icon) ");
        l1.setBorder(new MatteBorder(new ImageIcon("about16.gif")));
        JLabel l2 = new JLabel(" MatteBorder(3,6,3,6, Color.red) ");
        l2.setBorder(BorderFactory.createMatteBorder(3,6,3,6, Color.red));
        add(l1);
        add(l2);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new MatBorders();
    }
}
