package Cp_14;

import java.awt.*;
import javax.swing.*;
public class IntFrame extends JFrame{
    IntFrame(){
        super(" Окно с внутренними окнами");
        setLayout(new FlowLayout());
        JInternalFrame ifr1 =
                new JInternalFrame(" Первое окно", true, true, true, true);
        ifr1.getContentPane().add(new JLabel(" Это первое внутреннее окно"));
        ifr1.setPreferredSize(new Dimension(200, 200));
        ifr1.setVisible(true);
        add(ifr1);
        JInternalFrame ifr2 = new JInternalFrame(" Второе окно");
        ifr2.getContentPane().add(new JButton("Это второе внутреннее окно"));
        ifr2.setPreferredSize(new Dimension(200, 200));
        ifr2.setVisible(true);
        add(ifr2);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new IntFrame();
    }
}
