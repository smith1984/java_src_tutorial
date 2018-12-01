package Ch_13;

import javax.swing.*;
// Класс для реализации окна с меткой:
class MyFrame_{
    // Конструктор класса.
// Аргументы конструктора - текст для метки
// и координаты окна на экране:
    MyFrame_(String text,int x,int y){
// Создание окна:
        JFrame frm=new JFrame(" Окно с меткой");
// Положение окна на экране и размеры:
        frm.setBounds(x,y,250,120);
// Реакция на закрытие окна:
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Создание пиктограммы:
        ImageIcon icn=new ImageIcon("d:/Books/Java_guide/pictures/redshd.gif");
// Создание текстовой метки (с пиктограммой):
        JLabel lbl=new JLabel(text,icn,JLabel.CENTER);
// Добавление метки в окно:
        frm.add(lbl);
// Отображение окна:
        frm.setVisible(true);}
}
public class FrameAndLabel2{
    public static void main(String[] args){
// Создание окна (анонимный объект):
        new MyFrame_(" Метка с пиктограммой!",300,400);}
}
