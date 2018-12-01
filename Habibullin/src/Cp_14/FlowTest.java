package Cp_14;

import java.awt.*;
import javax.swing.*;
class FlowTest extends JFrame{
    FlowTest(String s){
        super(s);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        add(new JButton("Кнопка"));
        add(new JLabel("Метка"));
        add(new JCheckBox("Выбор"));
        add(new JComboBox());
        add(new JTextField("Ввод", 10));
        setSize(300, 100);
        setVisible(true);
    }
    public static void main(String[] args){
        JFrame f= new FlowTest(" Менеджер FlowLayout");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}