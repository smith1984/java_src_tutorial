package Cp_14;

import java.awt.*;
import javax.swing.*;
public class MyBox extends JFrame{
    JButton b1 = new JButton("Первая");
    JButton b2 = new JButton("Вторая");
    JTextArea ta = new JTextArea(5, 30);
    MyBox(){
        super(" Линейная панель");
        setLayout(new FlowLayout());
        Box out = Box.createVerticalBox();
        Box in1 = Box.createHorizontalBox();
        Box in2 = Box.createHorizontalBox();
        out.add(in1);
        out.add(in2);
        in1.add(ta);
        in2.add(Box.createHorizontalGlue());
        in2.add(b1);
        in2.add(b2);
        add(out);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new MyBox();
    }
}
