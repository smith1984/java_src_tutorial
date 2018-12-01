package MyCalculator;

import javax.swing.*;
import java.awt.FlowLayout;
import  java.awt.GridLayout;
public class SimpleCalculator {
    public static void main(String[] args) {
// Создаём панель
        JPanel windowContent= new JPanel();
// Задаём менеджер отображения для этой панели
        FlowLayout fl = new FlowLayout();
        GridLayout gr = new GridLayout(4,2,5,5);
        windowContent.setLayout(gr);
// Создаём компоненты в памяти
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");
// Добавляем компоненты на панель
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);
// Создаём фрейм и задаём для него панель
        JFrame frame = new JFrame("My First Calculator");
        frame.setContentPane(windowContent);
// задаём и размер и делаем фрейм видимым
        frame.setSize(400,250);
        frame.setVisible(true);
    }
}