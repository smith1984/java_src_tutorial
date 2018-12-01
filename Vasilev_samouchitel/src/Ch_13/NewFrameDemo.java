package Ch_13;

import javax.swing.*;
// Класс окна:
class NewFrame{
    // Конструктор класса:
    NewFrame(){
// Создание окна - объекта класса JFrame.
// Текстовый аргумент конструктора задает имя окна:
        JFrame MyFrame=new JFrame("Новое окно");
// Установка размеров окна (в пикселях по ширине и высоте):
        MyFrame.setSize(300,200);
// Реакция окна на щелчок на системной пиктограмме закрытия окна:
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Отображение окна:
        MyFrame.setVisible(true);
    }}
public class NewFrameDemo{
    public static void main(String[] args){
// Анонимный объект класса NewFrame - объект окна:
        new NewFrame();}
}