package Cp_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyNotebook extends JFrame{
    MyNotebook(String title){
        super(title);
        JTextField tf = new JTextField("Вводите текст", 50);
        add(tf, BorderLayout.NORTH);
        JTextArea ta = new JTextArea();
        ta.setEditable(false);
        add(ta);
        JPanel p = new JPanel();
        add(p, BorderLayout.SOUTH);
        JButton b = new JButton("Перенести");
        p.add(b);
        tf.addActionListener(new TextMove(tf, ta));
        b.addActionListener(new TextMove(tf, ta));
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args){
        JFrame f = new MyNotebook(" Обработка ActionEvent");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
class TextMove implements ActionListener{
    private JTextField tf;
    private JTextArea ta;
    TextMove(JTextField tf, JTextArea ta){
        this.tf = tf; this.ta = ta;
    }
    public void actionPerformed(ActionEvent ae){
        ta.append(tf.getText()+"\n");
    }
}