package Ch_12;

// Подключение пакетов:
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
// Класс фрейма:
class MyFrame_3 extends Frame{
    public static int count=0; // Количество открытых окон
    // Конструктор:
    MyFrame_3(int a,int b){
        count++;                   // Количество открытых окон
        setTitle("Окно с кнопкой: "+count);
        setLayout(null);        // Отключение менеджера размещения элементов
        Font f=new Font("Arial",Font.BOLD,11);  // Определение шрифта
        setFont(f);                             // Применение шрифта
        Button btn=new Button("Создать новое окно");
        btn.setBounds(50,100,200,30);  // Размеры и положение кнопки
        add(btn);                      // Добавление кнопки
        setBounds(a,b,300,200);        // Положение и размер окна
// Регистрация обработчика в окне:
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ve){
                System.exit(0);}               // Закрытие окна
        });
// Регистрация обработчика в кнопке:
        btn.addActionListener(new ButtonPressed());
        setVisible(true);              // Отображение окна
    }}
// Класс обработчика для кнопки:
class ButtonPressed implements ActionListener{
    private Random rnd;
    // Конструктор:
    ButtonPressed(){
        rnd = new Random();}
    public void actionPerformed(ActionEvent ae){
// Создание окна со случайным положением на экране:
        new MyFrame_3(rnd.nextInt(800),rnd.nextInt(500));}
}
class FrameAndButtonAWT{
    public static void main(String args[]){
// Создание первого окна:
        MyFrame_3 frame=new MyFrame_3(100,100);}
}