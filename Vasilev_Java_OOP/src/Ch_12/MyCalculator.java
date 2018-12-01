package Ch_12;

// Подключение пакетов:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// Класс главного окна:
class CalculatorFrame extends JFrame{
    // Конструктор класса:
    CalculatorFrame(){
// Размеры окна:
        int w=270,h=240;
// Заголовок окна:
        setTitle("Калькулятор");
// Установка размеров и положения окна:
        setBounds(100,100,w,h);
// Создание панели с кнопками и полем:
        CPanel panel=new CPanel(w,h);
// Добавление панели в окно:
        add(panel);
// Режим запрета изменения размеров окна:
        setResizable(false);
// Отображение окна:
        setVisible(true);
// Обработка щелчка на системной кнопке закрытия окна:
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }}
// Класс панели:
class CPanel extends JPanel{
    // Текстовое поле:
    public JTextField TF;
    // Обработчик щелчка на кнопке:
    private BtnAction BtnPressed;
    // Конструктор класса (аргументы - размеры панели):
    CPanel(int W,int H){
// Размеры кнопок и отступы:
        int w=W/5,h=H/8,sx=w/5,sy=h/3;
// Отключение менеджера компоновки:
        setLayout(null);
// Установка положения и размеров панели:
        setBounds(0,0,W,H);
// Создание текстового поля:
        JTextField TF=new JTextField();
// Выравнивание текста в поле по правому краю:
        TF.setHorizontalAlignment(JTextField.RIGHT);
// Положение и размер поля:
        TF.setBounds(sx,sy,2*sx+3*w,h);
// Отмена возможности редактирования поля:
        TF.setEditable(false);
// Добавление поля на панель:
        add(TF);
// Создание обработчика щелчка на кнопке:
        BtnPressed=new BtnAction(TF);
// Список названий кнопок:
        String[] BtnTxt={"1","2","3","+","4","5","6","-","7","8","9","/","0",".","=","*"};
// Создание кнопок и добавление их на панель:
        for(int i=0;i<BtnTxt.length;i++){
            addBtn(sx+(w+sx)*(i%4),(2*sy+h)+(sy+h)*(i/4),w,h,BtnTxt[i],BtnPressed);}
// Создание кнопки сброса параметров:
        JButton BtnC=new JButton("C");
// Размер и положение кнопки:
        BtnC.setBounds(4*sx+3*w,sy,w,h);
// Добавление обработчика для кнопки:
        BtnC.addActionListener(BtnPressed);
// Режим отсутствия выделения названия кнопки при активации:
        BtnC.setFocusPainted(false);
// Красный цвет для названия кнопки:
        BtnC.setForeground(Color.RED);
// Добавление кнопки на панель:
        add(BtnC);}
    // Метод для создания и добавления кнопок
// (аргументы - положение и размер кнопки, название и обработчик щелчка):
    void addBtn(int i,int j,int w,int h,String txt,ActionListener AcList){
// Создание кнопки:
        JButton b=new JButton(txt);
// Размер и положение кнопки:
        b.setBounds(i,j,w,h);
// Режим отсутствия выделения названия кнопки при активации:
        b.setFocusPainted(false);
// Добавление обработчика для кнопки:
        b.addActionListener(AcList);
// Добавление кнопки на панель:
        add(b);}
}
// Класс обработчика щелчка на кнопке:
class BtnAction implements ActionListener{
    // Текстовое поле для вывода информации:
    public JTextField TF;
    // Индикатор состояния ввода числа:
    private boolean start;
    // Индикатор состояния ввода десятичной точки:
    private boolean point;
    // Текстовое представление последнего введенного оператора:
    private String cmnd;
    // Поле для записи промежуточного результата:
    private double result;
    // Метод для сброса параметров:
    private void onStart(){
        start=true;
        point=true;
        cmnd="C";
        result=0;
        TF.setText("0.0");}
    // Метод для вычисления результата последней операции:
    private void calc(){
// Введенное в поле число:
        double x;
        x=Double.parseDouble(TF.getText());
// Вычисление результата:
        if(cmnd.equals("*")) result*=x;
        else if(cmnd.equals("/")) result/=x;
        else if(cmnd.equals("-")) result-=x;
        else if(cmnd.equals("+")) result+=x;
        else result=x;
// Заполнение текстового поля:
        TF.setText(Double.toString(result));}
    // Конструктор класса (аргумент - текстовое поле):
    BtnAction(JTextField TF){
        this.TF=TF;
        onStart();}
    // Реакция на щелчок на кнопке:
    public void actionPerformed(ActionEvent ae){
// Считывание текста на кнопке:
        String str=ae.getActionCommand();
// Проверка вариантов:
        if(str.equals("C")){// Кнопка сброса значений
            onStart();
            return;}
// Вычисление результата:
        if(str.equals("+")|str.equals("-")|str.equals("*")|str.equals("/")|str.equals("=")){
            calc();
            cmnd=str;
            start=true;
            point=true;
            return;}
// Ввод числа:
        if(start){// Начало ввода числа
            if(str.equals(".")){// Ввод точки в начале ввода числа
                TF.setText("0.");
                point=false;
                start=false;
                return;}
            else{// Ввод цифры в начале ввода числа
                TF.setText(str);
                start=false;
                return;}
        }
        else{// Продолжение ввода числа
            if(str.equals(".")){// Попытка ввести точку
                str=point?str:"";
                point=false;}
// Добавление цифры к числу:
            // Незначащий первый ноль:
            if(TF.getText().equals("0")&!str.equals(".")) TF.setText(str);
            else TF.setText(TF.getText()+str);}
    }}
// Класс с главным методом программы:
class MyCalculator{
    public static void main(String[] args){
// Создание окна:
        new CalculatorFrame();
    }}
