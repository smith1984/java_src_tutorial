package Ch_13;

import javax.swing.*;
import  java.awt.*;

public class Button1 {
    public static void main (String[] args){
        Button1 button1 = new Button1();
        button1.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton south = new JButton("South");
        JButton north = new JButton("North");
        JButton center = new JButton("Centr");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.CENTER, center);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
