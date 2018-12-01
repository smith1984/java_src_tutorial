package Cp_14;

import java.awt.*;
import javax.swing.*;
public class Desk extends JFrame{
    Desk(){
        super(" Внутренний рабочий стол");
        JDesktopPane dp = new JDesktopPane();
        setContentPane(dp);
        JInternalFrame ifr1 =
                new JInternalFrame(" Первое окно", true, true, true, true);
        ifr1.getContentPane().add(new JLabel(" Это первое внутреннее окно"));
        ifr1.setBounds(10,10, 200,200);
        ifr1.setVisible(true);
        dp.add(ifr1);
        JInternalFrame ifr2 = new JInternalFrame(" Второе окно");
        ifr2.getContentPane().add(new JButton("Это второе внутреннее окно"));
        ifr2.setBounds(150, 200, 200, 100);
        ifr2.setVisible(true);
        dp.add(ifr2);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new Desk();
    }
}