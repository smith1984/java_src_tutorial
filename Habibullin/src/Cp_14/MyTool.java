package Cp_14;

import java.awt.*;
import javax.swing.*;
public class MyTool extends JFrame{
    MyTool(){
        super(" Инструментальные панели");
        JToolBar tb1 = new JToolBar(" Панель 1"),
                tb2 = new JToolBar(" Панель 2");
        tb1.setRollover(true);
        tb1.add(new JButton(new ImageIcon("Add24.gif")));
        tb1.add(new JButton(new ImageIcon("AlignTop24.gif")));
        tb1.add(new JButton(new ImageIcon("About24.gif")));
        tb2.add(new JButton("Первая"));
        tb2.add(new JButton("Вторая"));
        tb2.add(new JButton("Третья"));
        add(tb1, BorderLayout.NORTH);
        add(tb2, BorderLayout.WEST);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new MyTool();
    }
}