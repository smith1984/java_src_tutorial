package Cp_14;

import java.awt.*;
import javax.swing.*;
class BorderPanelTest extends JFrame{
    BorderPanelTest(String s){
        super(s);
// Создаем панель p2 с тремя кнопками
        JPanel p2 = new JPanel();
        p2.add(new JButton("Выполнить"));
        p2.add(new JButton("Отменить"));
        p2.add(new JButton("Выйти"));
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
// Помещаем панель p2 с кнопками на "юге" панели p1
        p1.add(p2, BorderLayout.SOUTH);
// Поле ввода помещаем на "севере"
        p1.add(new JTextField("Поле ввода", 20), BorderLayout.NORTH);
// Область ввода помещается на панель с прокруткой
        JScrollPane sp = new JScrollPane(new JTextArea("Область ввода", 5, 20));
// Панель прокрутки помещается в центр панели p1
        p1.add(sp, BorderLayout.CENTER);
// Панель p1 помещаем в "центре" контейнера
        add(p1, BorderLayout.CENTER);
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args){
        JFrame f= new BorderPanelTest(" Сложная компоновка");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}