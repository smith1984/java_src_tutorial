package Ch_12;

// Подключение пакетов:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
// Класс фрейма:
class MyFrame_2 extends JFrame{
    // Счетчик окон:
    public static int count=0;
    // Конструктор:
    MyFrame_2(int a,int b){
        count++;  // Количество открытых окон
// Название окна:
        setTitle("Окно с кнопкой: "+count);
// Создание панели:
        MyPanel panel=new MyPanel();
        setSize(300,200); // Размер окна
// Закрытие окна:
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(a,b);  // Положение окна
        add(panel);        // Добавление панели
        setVisible(true);  // Отображение окна
    }}
// Класс панели:
class MyPanel extends JPanel{
    // Конструктор:
    MyPanel(){
// Создание кнопки:
        JButton button=new JButton("Создать новое окно");
        add(button);          // Добавление кнопки на панель
        button.addActionListener(listener);} // Регистрация обработчика
    // Обработчик для кнопки - объект анонимного класса:
    ActionListener listener=new ActionListener(){
        public void actionPerformed(ActionEvent event){
            Random rnd=new Random();
// Создание окна со случайными координатами размещения на экране:
            MyFrame_2 frame=new MyFrame_2(rnd.nextInt(800),rnd.nextInt(500));}};
}
class FrameAndButton{
    public static void main(String args[]){
// Создание первого окна:
        MyFrame_2 frame=new MyFrame_2(100,100);}
}
