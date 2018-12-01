package Cp_14;

import java.awt.*;
import javax.swing.*;
import java.util.*;
class GridTest extends JFrame{
    GridTest(String s){
        super(s);
        setLayout(new GridLayout(4, 4, 5, 5));
        StringTokenizer st = new StringTokenizer("7 8 9 / 4 5 6 * 1 2 3 - 0 . = +");
        while(st.hasMoreTokens())
            add(new JButton(st.nextToken()));
        setSize(200, 200);
        setVisible(true);
    }
    public static void main(String[] args){
        JFrame f= new GridTest(" Менеджер GridLayout");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
