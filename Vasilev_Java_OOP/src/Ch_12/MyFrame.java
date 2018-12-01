package Ch_12;

// Подключение библиотеки:
import javax.swing.*;
// Расширение класса JFrame:
class JustAFrame_2 extends JFrame{
    // Конструктор класса:
    public JustAFrame_2(int a,int b){
// Заголовок окна - аргумент конструктора суперкласса:
        super("Простое графическое окно");
// Размеры окна:
        setSize(a,b);
// Реакция на попытку закрыть окно:
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Отображение окна:
        setVisible(true);}
}
class MyFrame{
    public static void main(String args[]){
// Создание окна:
        JustAFrame_2 frame=new JustAFrame_2(300,200);
    }}
