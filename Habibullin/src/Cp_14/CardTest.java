package Cp_14;

import java.awt.*;
import javax.swing.*;
class CardTest extends JFrame{
    CardTest(String s){
        super(s);
        JPanel p = new JPanel();
        CardLayout cl = new CardLayout();
        p.setLayout(cl);
        p.add(new JButton("Русская страница"),"page1");
        p.add(new JButton("English page"), "page2");
        p.add(new JButton("Deutsche Seite"), "page3");
        add(p);
        cl.next(p);
        cl.show(p, "page1");
        JPanel p2 = new JPanel();
        p2.add(new JLabel("Выберите язык:"));
        JComboBox ch = new JComboBox();
        ch.addItem("Русский");
        ch.addItem("Английский");
        ch.addItem("Немецкий");
        p2.add(ch);
        add(p2, BorderLayout.NORTH);
        setSize(400,300);
        setVisible(true);
    }
    public static void main(String[] args){
        JFrame f= new CardTest(" Менеджер CardLayout");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
