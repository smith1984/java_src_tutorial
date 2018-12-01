package Cp_10;

import java.awt.*;
import java.awt.event.*;
class TwoFrames{
    public static void main(String[] args){
        Fr1 f1 = new Fr1(" Основное окно");
        Fr2 f2 = new Fr2(" Второе окно");
    }
}
class Fr1 extends Frame{
    Fr1(String s){
        super(s);
        setLayout(null);
        Font f = new Font("Serif", Font.BOLD, 15);
        setFont(f);
        Label l = new Label("Это главное окно", Label.CENTER);
        l.setBounds(10, 30, 180, 30);
        add(l);
        setSize(200, 100);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
}
class Fr2 extends Frame{
    Fr2(String s){
        super(s);
        setLayout(null);
        Font f = new Font("Serif", Font.BOLD, 15);
        setFont(f);
        Label l = new Label("Это второе окно", Label.CENTER);
        l.setBounds(10, 30, 180, 30);
        add(l);
        setBounds(50, 50, 200, 100);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                dispose();
            }
        });
    }
}