package Cp_14;

import java.awt.*;
import javax.swing.*;
public class Tabbed extends JFrame{
    Tabbed(){
        super(" Панель с вкладками");
        setLayout(new FlowLayout());
        String[] day = {"Понедельник", "Вторник", "Среда",
                "Четверг", "Пятница", "Суббота", "Воскресенье"};
        JTabbedPane sp = new JTabbedPane(JTabbedPane.TOP,
                JTabbedPane.SCROLL_TAB_LAYOUT);
        sp.setPreferredSize(new Dimension(300, 100));
        for (int i = 0; i < 7; i++){
            sp.add(day[i], new JLabel("Метка " + i));
            sp.setBackgroundAt(i, new Color(16*i, 0, 16*(7-i)));
        }
        add(sp);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new Tabbed();
    }
}