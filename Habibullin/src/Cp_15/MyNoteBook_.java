package Cp_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyNoteBook_ extends JFrame implements ActionListener{
    private JTextField tf;
    private JTextArea ta;
    MyNoteBook_(String title){
        super(title);
        tf = new JTextField("Вводите текст", 50);
        add(tf, BorderLayout.NORTH);
        ta = new JTextArea();
        ta.setEditable(false);
        add(ta);
        JPanel p = new JPanel();
        add(p, BorderLayout.SOUTH);
        JButton b = new JButton("Перенести");
        p.add(b);
        tf.addActionListener(this);
        b.addActionListener(this);
        setSize(300, 200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        ta.append(tf.getText()+"\n");
    }
    public static void main(String[] args){
        JFrame f = new MyNoteBook_(" Обработка ActionEvent");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}