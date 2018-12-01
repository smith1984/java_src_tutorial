package Cp_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyNoteBook2 extends JFrame{
    private JTextField tf;
    private JTextArea ta;
    MyNoteBook2(String title){
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
        tf.addActionListener(new TextMove());
        b.addActionListener(new TextMove());
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args){
        JFrame f = new MyNoteBook2(" Обработка ActionEvent");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
// Вложенный класс
class TextMove implements ActionListener, KeyListener{
    public void actionPerformed(ActionEvent ae){
        ta.append(tf.getText()+"\n");
    }
    public void keyPressed(KeyEvent ke){
        if (ke.getKeyCode() == KeyEvent.VK_ESCAPE) tf.setText("");
    }
    public void keyReleased(KeyEvent ke){}
    public void keyTyped(KeyEvent ke){}
}
}
