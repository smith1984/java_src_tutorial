package Ch_14;

// Подключение пакетов:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// Класс для реализации окна ввода текста:
class TextInputFrame implements ActionListener{
    // Ссылка на объект окна:
    private JFrame frame;
    // Ссылка на текстовую метку:
    JLabel enter;
    // Ссылка на текстовое поле:
    JTextField tf;
    // Ссылки на кнопки:
    JButton btYes,btNo;
    private String name;
    // Конструктор класса:
    TextInputFrame(String msg){
// Размеры окна:
        int width=300,height=150;
// Создание окна:
        frame=new JFrame(" Окно для ввода текста (имени)...");
// Определение положения и установка размеров окна:
        frame.setBounds(400,300,width,height);
// Отключение менеджера компоновки:
        frame.setLayout(null);
// Текстовая метка для поля текстового ввода:
        enter=new JLabel(msg,JLabel.LEFT);
// Положение и размер метки:
        enter.setBounds(10,10,width-20,height/6);
// Текстовое поле ввода:
        tf=new JTextField(frame.getWidth()-20);
// Положение и размер текстового поля ввода:
        tf.setBounds(10,enter.getHeight()+5,enter.getWidth(),height/6);
// Кнопка подтверждения ввода:
        btYes=new JButton("Подтверждаю");
// Положение и размеры кнопки:
        btYes.setBounds(10,height/2+10,(width-30)/2,height/6);
// Отмена режима отображения рамки фокуса в кнопке:
        btYes.setFocusPainted(false);
// Кнопка отмены (завершение работы):
        btNo=new JButton("Завершить");
// Положение и размеры кнопки:
        btNo.setBounds((width-30)/2+18,height/2+10,(width-30)/2,height/6);
// Отмена режима отображения рамки фокуса в кнопке:
        btNo.setFocusPainted(false);
// Реакция на закрытие окна щелчком на системной пиктограмме:
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Добавление в окно текстовой метки:
        frame.add(enter);
// Добавление в окно текстового поля:
        frame.add(tf);
// Добавление в окно кнопки подтверждения ввода:
        frame.add(btYes);
// Добавление в окно кнопки отмены:
        frame.add(btNo);
// Отмена возможности изменять размеры окна:
        frame.setResizable(false);
// Регистрация обработчика щелчка в кнопке подтверждения:
        btYes.addActionListener(this);
// Регистрация обработчика щелчка в кнопке отмены:
        btNo.addActionListener(this);
// Отображение окна:
        frame.setVisible(true);}
    // Обработка щелчка на кнопке:
    public void actionPerformed(ActionEvent ae){
// Считывание текста нажатой кнопки:
        String btName=ae.getActionCommand();
// Определение реакции в зависимости от нажатой кнопки:
        if(btName.equalsIgnoreCase(btYes.getText())){
// Заполнение текстового поля класса:
            name=tf.getText();
// Окно с текстовым полем убирается с экрана:
            frame.setVisible(false);
// Отображение нового окна:
            IntInputFrame.show("Сколько Вам лет? Укажите возраст (лет):",name);}
// Завершение работы:
        else System.exit(0);}
    // Метод для отображения окна:
    static void show(String txt){
// Создание анонимного объекта:
        new TextInputFrame(txt);}
}
// Класс для реализации окна для ввода целого числа:
class IntInputFrame implements ActionListener, KeyListener{
    // Ссылка на объект окна:
    private JFrame frame;
    // Ссылка на объект текстовой метки:
    private JLabel enter;
    // Ссылки на кнопки:
    private JButton btYes,btNo;
    // Ссылка на текстовое поле ввода:
    private JTextField tf;
    // Текстовое поле:
    private String name;
    // Целочисленное поле:
    private int age;
    // Конструктор класса:
    IntInputFrame(String msg,String name){
// Значение текстового поля:
        this.name=new String(name);
// Размеры окна:
        int width=300,height=150;
// Создание окна:
        frame=new JFrame(" Окно для ввода числа (возраста)...");
// Определение положения и установка размеров окна:
        frame.setBounds(400,300,width,height);
// Отключение менеджера компоновки:
        frame.setLayout(null);
// Создание текстовой метки:
        enter=new JLabel(msg,JLabel.LEFT);
// Положение и размеры метки:
        enter.setBounds(10,10,width-20,height/6);
// Создание текстового поля:
        tf=new JTextField(frame.getWidth()-20);
// Положение и размеры текстового поля:
        tf.setBounds(10,enter.getHeight()+5,enter.getWidth(),height/6);
// Регистрация обработчика в текстовом поле:
        tf.addKeyListener(this);
// Создание кнопки подтверждения ввода:
        btYes=new JButton("Подтверждаю");
// Положение и размеры кнопки подтверждения ввода:
        btYes.setBounds(10,height/2+10,(width-30)/2,height/6);
// Кнопка подтверждения ввода неактивна:
        btYes.setEnabled(false);
// Отмена режима отображения рамки фокуса в кнопке:
        btYes.setFocusPainted(false);
// Кнопка завершения работы:
        btNo=new JButton("Завершить");
// Положение и размеры кнопки:
        btNo.setBounds((width-30)/2+18,height/2+10,(width-30)/2,height/6);
// Отмена режима отображения рамки фокуса в кнопке:
        btNo.setFocusPainted(false);
// Реакция на закрытие окна щелчком на системной пиктограмме:
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Добавление в окно текстовой метки:
        frame.add(enter);
// Добавление в окно текстового поля:
        frame.add(tf);
// Добавление в окно кнопки подтверждения ввода:
        frame.add(btYes);
// Добавление в окно кнопки завершения работы:
        frame.add(btNo);
// Отмена возможности изменять размеры окна:
        frame.setResizable(false);
// Регистрация обработчика в кнопке подтверждения ввода:
        btYes.addActionListener(this);
// Регистрация обработчика в кнопке завершения работы:
        btNo.addActionListener(this);
// Отображение окна:
        frame.setVisible(true);}
    // Обработка события отпускания нажатой клавиши:
    public void keyReleased(KeyEvent ke){
        try{
// Попытка преобразовать текст в число:
            Integer.parseInt(tf.getText());
// Кнопка подтверждения ввода активна:
            btYes.setEnabled(true);
// Обработка исключения:
        }catch(Exception e){
// Кнопка подтверждения ввода неактивна:
            btYes.setEnabled(false);}
    }
    // "Пустая" реализация методов обработки нажатия кнопок:
    public void keyPressed(KeyEvent ke){}
    public void keyTyped(KeyEvent ke){}
    // Обработка нажатия кнопки:
    public void actionPerformed(ActionEvent ae){
// Определение текста нажатой кнопки:
        String btName=ae.getActionCommand();
// Реакция зависит от того, какая кнопка нажата:
        if(btName.equalsIgnoreCase(btYes.getText())){
// Целочисленному полю присваивается значение:
            age=Integer.parseInt(tf.getText());
// Окно убирается с экрана:
            frame.setVisible(false);
// Текст для отображения в окне:
            String msg="Добрый день, "+name+"!\n";
            msg+="Ваш возраст - "+age+" лет!";
// Отображается новое окно:
            MessageFrame.show(msg);
        }
// Завершение работы:
        else System.exit(0);}
    // Статический метод для отображения окна для ввода числа:
    static void show(String txt,String name){
// Создание анонимного объекта:
        new IntInputFrame(txt,name);}
}
// Класс для реализации окна с сообщением:
class MessageFrame implements ActionListener{
    // Ссылка на объект окна:
    private JFrame frame;
    // Ссылка на метку с изображением:
    JLabel il;
    // Ссылка на метку с текстом:
    JLabel message;
    // Ссылка на кнопку:
    JButton button;
    // Конструктор класса:
    MessageFrame(String msg){
// Размеры окна:
        int width=350,height=150;
// Изображение для пиктограммы метки:
        ImageIcon img=new ImageIcon("d:/Books/Files/pict.gif");
// Создание объекта окна:
        frame=new JFrame(" Сообщение...");
// Определение положения окна и установка его размеров:
        frame.setBounds(400,300,width,height);
// Реакция на закрытие через системную пиктограмму:
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Отключение менеджера компоновки:
        frame.setLayout(null);
// Изображение для пиктограммы окна:
        Image icon=frame.getToolkit().getImage("d:/Books/Files/logo.jpg");
// Создание метки с изображением:
        il=new JLabel(img);
// Считывание размеров изображения:
        int w=img.getIconWidth();
        int h=img.getIconHeight();
// Положение и размер метки с изображением:
        il.setBounds(10,10,w,h);
// Мекта с текстом:
        message=new JLabel("<html>"+msg.replace("\n","<br>")+"</html>",JLabel.LEFT);
// Положение и размеры метки с текстом:
        message.setBounds(w+20,10,width-30-w,height/2-10);
// Добавление метки с изображением в окно:
        frame.add(il);
// Добавление метки с текстом в окно:
        frame.add(message);
// Создание кнопки:
        button=new JButton("Прочитано!");
// Положение и размер кнопки:
        button.setBounds(width/4,3*height/5,width/2,height/6);
// Отмена отображения рамки фокуса в кнопке:
        button.setFocusPainted(false);
// Регистрация обработчика щелчка на кнопке:
        button.addActionListener(this);
// Добавление кнопки в окно:
        frame.add(button);
// Отмена возможности изменения размеров окна:
        frame.setResizable(false);
// Применение пиктограммы для окна:
        frame.setIconImage(icon);
// Отображение окна:
        frame.setVisible(true);}
    // Обработка щелчка на кнопке:
    public void actionPerformed(ActionEvent ae){
// Завершение работы:
        System.exit(0);}
    // Статический метод для отображения окна:
    static void show(String txt){
// Создание анонимного объекта:
        new MessageFrame(txt);}
}
public class UsingFramesDemo{
    public static void main(String[] args){
// Отображение окна для ввода имени:
        TextInputFrame.show("Как Вас зовут? Введите имя:");}
}