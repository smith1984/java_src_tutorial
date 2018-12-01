package Cp_11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

class RadioButtonTest extends JFrame implements ActionListener {
    public RadioButtonTest(){
        setBackground(Color.white);
        setLayout(new FlowLayout());
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
        p.setBorder(BorderFactory.createEtchedBorder());
        JRadioButton rb1 =
                new JRadioButton("<html><u>К</u>расный<p>фон");
        rb1.setMnemonic(KeyEvent.VK_R);
        rb1.setToolTipText("<html>Вы выбираете<p>красный фон");
        rb1.addActionListener(this);
        rb1.setActionCommand("red");
        JRadioButton rb2 =
                new JRadioButton("<html><u>З</u>еленый<p>фон");
        rb2.setMnemonic(KeyEvent.VK_P);
        rb2.setToolTipText("<html>Вы выбираете<p>зеленый фон");
        rb2.addActionListener(this);
        rb2.setActionCommand("green");
        JRadioButton rb3 =
                new JRadioButton("<html><u>С</u>иний<p>фон");
        rb3.setMnemonic(KeyEvent.VK_C);
        rb3.setToolTipText("<html>Вы выбираете<p>синий фон");
        rb3.addActionListener(this);
        rb3.setActionCommand("blue");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2); bg.add(rb3);
        p.add(rb1); p.add(rb2); p.add(rb3);
        add(p);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new RadioButtonTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
