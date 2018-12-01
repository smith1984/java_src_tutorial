package Ch_12;

// Подключение библиотеки AWT:
import java.awt.*;
import java.awt.event.*;
// Класс обработчика закрытия окна:
class MyAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);}
}
// Класс окна:
class JustAFrame extends Frame{
    // Конструктор:
    JustAFrame(int a,int b){
// Аргумент конструктора суперкласса - имя окна:
        super("Новое окно");
// Объект обработчика закрытия окна:
        MyAdapter adapter=new MyAdapter();
// Размеры окна:
        setSize(a,b);
// Отображение окна:
        setVisible(true);
// Добавлен обработчик:
        addWindowListener(adapter);}
}
class MyAWTFrame{
    public static void main(String args[]){
// Создание окна:
        JustAFrame frame=new JustAFrame(400,300);
    }}