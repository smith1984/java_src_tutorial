package Ch_13;

import javax.swing.*;
// Класс для реализации окна с меткой:
class MyFrame{
    // Конструктор класса:
    MyFrame(){
// Создание окна:
        JFrame frm=new JFrame(" Окно с меткой");
// Положение окна на экране и размеры:
        frm.setBounds(400,300,180,100);
// Реакция на закрытие окна:
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Создание текстовой метки:
        JLabel lbl=new JLabel(" Всем огромный привет!");
// Добавление метки в окно:
        frm.add(lbl);
// Отображение окна:
        frm.setVisible(true);}
}
public class FrameAndLabel{
    public static void main(String[] args){
// Создание окна (анонимный объект):
        new MyFrame();}
}