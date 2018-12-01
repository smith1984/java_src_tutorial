package Cp_19;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
public class SimpTimer extends JFrame implements ActionListener{
    JButton bt;
    JTextArea ta;
    javax.swing.Timer t;
    SimpTimer(){
        super(" Передача фокуса");
        JPanel p = new JPanel();
        add(p, BorderLayout.NORTH);
        bt = new JButton("Останов");
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t.stop(); ta.append("\nStop");
            }
        });
        ta = new JTextArea(6, 30);
        add(ta);
        p.add(bt);
        t = new javax.swing.Timer(500, this);
        t.setInitialDelay(1000);
        t.setLogTimers(true);
        t.start();
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        ta.append("\n Время: " + new Date());
    }
    public static void main(String[] args){
        new SimpTimer();
    }
}
