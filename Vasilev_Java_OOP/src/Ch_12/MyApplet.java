package Ch_12;

// Подключение пакетов:
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// Класс апплета:
public class MyApplet extends Applet{
    // Метка для отображения текста:
    private Label L;
    // Кнопки:
    private Button BtnH;
    private Button BtnL;
    // Основной текст:
    private String txt="Изменяющий размеры текст: сейчас размер ";
    // Размер шрифта:
    private int size;
    // Обработчик щелка на кнопке:
    private BtnPressed BP;
    // Метод для инициализации параметров:
    public void init(){
// Белый цвет фона апплета:
        setBackground(Color.WHITE);
// Начальное значение для размера шрифта:
        size=20;
// Размеры метки:
        int W,H;
// Ширина метки определяется на основе ширины апплета:
        W=getWidth();
// Высота метки определяется на основе высоты апплета:
        H=2*getHeight()/3;
// Отключение менеджера компоновки:
        setLayout(null);
// Создание метки:
        L=new Label();
// Выравнивание текста по центру:
        L.setAlignment(Label.CENTER);
// Размеры метки (применение):
        L.setSize(W,H);
// Положение метки:
        L.setLocation(0,0);
// Белый цвет фона метки:
        L.setBackground(Color.WHITE);
// Шрифт для метки:
        L.setFont(new Font("Serief",Font.BOLD,size));
// Текст метки:
        L.setText(txt+L.getFont().getSize());
// Первая кнопка (создание):
        BtnH=new Button("Больше >>");
// Вторая кнопка (создание):
        BtnL=new Button("<< Меньше");
// Положение и размеры первой кнопки:
        BtnH.setBounds(W/4,H+1,W/4,H/4);
// Положение и размеры второй кнопки:
        BtnL.setBounds(W/2+1,H+1,W/4,H/4);
// Шрифт для первой кнопки:
        BtnH.setFont(new Font("Arial",Font.BOLD,11));
// Шрифт для второй кнопки:
        BtnL.setFont(new Font("Arial",Font.BOLD,11));
// Создание обработчика для щелчка на кнопке:
        BP=new BtnPressed();
// Регистрация обработчика для первой кнопки:
        BtnH.addActionListener(BP);
// Регистрация обработчика для второй кнопки:
        BtnL.addActionListener(BP);
// Добавление первой кнопки в апплет:
        add(BtnH);
// Добавление второй кнопки в апплет:
        add(BtnL);
// Добавление метки в апплет:
        add(L);}
    // Внутренний класс для обработчика щелчка на кнопке:
    class BtnPressed implements ActionListener{
        // Закрытый метод, через который реализуется обработка:
        private void pressed(boolean btn){
            if(btn) size++;
            else size--;
            L.setFont(new Font("Serief",Font.BOLD,size));
            L.setText(txt+L.getFont().getSize());
            if(size>15) BtnL.setEnabled(true);
            else BtnL.setEnabled(false);
            if(size<25) BtnH.setEnabled(true);
            else BtnH.setEnabled(false);}
        // Реакция на щелчок на кнопке:
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==BtnH) pressed(true);
            if(ae.getSource()==BtnL) pressed(false);}
    }}

