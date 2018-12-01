package Ch_14;

// Подключение пакетов:
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
// Класс для кнопки:
class MyButton extends JButton{
    // Ссылка на окно, в которое добавляется кнопка:
    private MyFrame frame;
    // Конструктор класса.
// Аргументы - окно, в которое добавляется кнопка и
// логическое значение, определяющее тип кнопки:
    MyButton(MyFrame frame,boolean state){
// Вызов конструктора суперкласса:
        super();
// Ссылка на окно для добавления в него кнопки:
        this.frame=frame;
// Текст для записи имени файла изображения:
        String fileName;
// Текст для записи имени кнопки:
        String bName;
// Определение имени файла и названия кнопки:
        if(state){fileName="Yes.png";
            bName="Да";
            addActionListener(new HandlerYes(frame));}
        else{fileName="No.png";
            bName="Нет";
            addActionListener(new HandlerNo());}
// Формирование полного имени файла с изображением:
        fileName="d:\\books\\files\\"+fileName;
// Создание объекта изображения (пиктограммы):
        ImageIcon icn=new ImageIcon(fileName);
// Применение пиктограммы для кнопки:
        setIcon(icn);
// Применение названия для кнопки:
        setText(bName);
// Отмена режима отображения рамки
// вокруг текста кнопки при передаче ей фокуса:
        setFocusPainted(false);
// Размеры кнопки:
        int w=frame.getWidth()/4;
        int h=frame.getHeight()/8;
// Применение размеров для кнопки:
        setSize(w,h);
// Координаты кнопки:
        int x=frame.getWidth()/4,y=frame.getHeight()-h-50;
        if(!state) x+=w+50;
// Положение кнопки в окне:
        setLocation(x,y);
// Добавление кнопки в окно:
        frame.add(this);}
}
// Класс метки с изображением:
class MyIconLabel extends JLabel{
    // Ссылка на окно, в которое добавляется метка:
    private MyFrame frame;
    // Конструктор класса.
// Аргумент - окно, в которое добавляется метка:
    MyIconLabel(MyFrame frame){
// Вызов конструктора суперкласса:
        super();
// Заполнение поля класса:
        this.frame=frame;
// Создание изображения:
        ImageIcon icn=new ImageIcon("d:\\books\\files\\rabbit.gif");
// Добавление изображения в метку:
        setIcon(icn);
// Положение и размер метки:
        setBounds(5,15,frame.getWidth()/4-10,frame.getHeight()-30);
// Добавление метки в окно:
        frame.add(this);}
}
// Класс для панели меню:
class MyMenuBar extends JMenuBar{
    // Ссылка на окно, в которое добавляется панель:
    private MyFrame frame;
    // Конструктор класса.
// Аргумент - ссылка на окно, в которое добавляется панель:
    MyMenuBar(MyFrame frame){
// Вызов конструктора суперкласса:
        super();
// Присваивание значения ссылке на объект окна:
        this.frame=frame;
// Первое меню - "Окно":
        JMenu wind=new JMenu("Окно");
// Пункты для меню "Окно":
        JMenuItem apply=new JMenuItem("Подтверждаю");
        JMenuItem exit=new JMenuItem("Выход");
// Регистрация обработчиков событий:
        apply.addActionListener(new HandlerYes(frame));
        exit.addActionListener(new HandlerNo());
// Добавление пунктов в меню "Окно":
        wind.add(apply);
        wind.add(exit);
// Добавление меню "Окно" в панель меню:
        add(wind);
// Второе меню - "По горизонтали":
        JMenu horiz=new JMenu("По горизонтали");
// Пункты для меню "По горизонтали":
        JMenuItem left=new JMenuItem("Влево");
        JMenuItem right=new JMenuItem("Вправо");
        JMenuItem hnone=new JMenuItem("На месте");
// Регистрация обработчиков событий:
        left.addActionListener(new MenuHandler(frame,true));
        right.addActionListener(new MenuHandler(frame,true));
        hnone.addActionListener(new MenuHandler(frame,true));
// Добавление пунктов в меню "По горизонтали":
        horiz.add(left);
        horiz.add(right);
        horiz.add(hnone);
// Добавление меню "По горизонтали" в панель меню:
        add(horiz);
// Третье меню - "По вертикали":
        JMenu vert=new JMenu("По вертикали");
// Пункты для меню "По вертикали":
        JMenuItem up=new JMenuItem("Вверх");
        JMenuItem down=new JMenuItem("Вниз");
        JMenuItem vnone=new JMenuItem("На месте");
// Регистрация обработчиков событий:
        up.addActionListener(new MenuHandler(frame,false));
        down.addActionListener(new MenuHandler(frame,false));
        vnone.addActionListener(new MenuHandler(frame,false));
// Добавление пунктов в меню "По вертикали":
        vert.add(up);
        vert.add(down);
        vert.add(vnone);
// Добавление меню "По вертикали" в панель меню:
        add(vert);
// Положение и размер панели меню:
        setBounds(1,1,frame.getWidth()-1,frame.getHeight()/10);
// Добавление панели меню в окно:
        frame.add(this);
    }}
// Специальная панель:
class MyPanel extends JPanel{
    // Ссылки на метки с тексом,
// указывающим направление перемещения:
    public JLabel HLab; // по горизонтали
    public JLabel VLab; // по вертикали
    // Конструктор класса:
    MyPanel(){
// Вызов конструктора суперкласса:
        super();
// Создание текстовых меток:
        JLabel L1=new JLabel("По горизонтали: ");
        JLabel L2=new JLabel("По вертикали: ");
        HLab=new JLabel("на месте");
        VLab=new JLabel("на месте");
// Подключается менеджер компоновки.
// Панель разбивается на четыре ячейки (две строки и два столбца).
// Элементы в панели размещаются последовательно в эти ячейки.
// Зазор между ячейками составляет 3 пикселя.
        setLayout(new GridLayout(2,2,3,3));
// Добавление меток в панель:
        add(L1);
        add(HLab);
        add(L2);
        add(VLab);}
}
// Класс для реализации окна:
class MyFrame extends JFrame{
    // Ссылка на панель с текстовыми метками:
    public MyPanel move;
    // Числовое поле - массив, содержащее значения
// для шага перемещения окна по горизонтали и вертикали:
    private int[] step;
    // Метод для изменения шага перемещения по горизонтали:
    public void setH(int i){
        step[0]=i;}
    // Метод для изменения шага перемещения по вертикали:
    public void setV(int i){
        step[1]=i;}
    // Конструктор класса.
// Аргументы - название окна и его размеры:
    MyFrame(String text,int width,int height){
// Вызов конструктора суперкласса:
        super();
// Начальное значение для шага перемещений:
        step=new int[]{0,0};
// Применение заголовка:
        setTitle(text);
// Положение и размеры окна:
        setBounds(400,300,width,height);
// Отключение менеджера компоновки:
        setLayout(null);
// Реакция на закрытие окна через системною пиктограмму:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
// Создание кнопок:
        new MyButton(this,true);
        new MyButton(this,false);
// Создание панели меню:
        new MyMenuBar(this);
// Создание метки с изображением:
        new MyIconLabel(this);
// Создание метки с текстом:
        JLabel msg=new JLabel("Хотите переместить окно?");
// Положение и размеры метки с текстом:
        msg.setBounds(getWidth()/4,15,3*getWidth()/4-10,getHeight()/4-5);
// Создание шрифта:
        Font fnt=new Font("Arial",Font.BOLD,18);
// Применение шрифта для метки с текстом:
        msg.setFont(fnt);
// Добавление текстовой метки в окно:
        add(msg);
// Создание панели с текстовыми метками:
        move=new MyPanel();
// Положение и размеры панели:
        move.setBounds(msg.getX(),msg.getY()+msg.getHeight()+1,msg.getWidth(),msg.getHeight());
// Добавление панели в окно:
        add(move);
// Установка режима, не позволяющего изменять размеры окна:
        setResizable(false);
// Отображение окна:
        setVisible(true);}
    // Метод вызывается для перемещения окна
// при обработке щелчка на кнопке "Да" или
// выборе пункта меню "Подтверждаю":
    void handler(){
// Изменение позиции окна:
        setLocation(getX()+step[0],getY()+step[1]);}
}
// Класс обработчика для щелчка на кнопке "Нет" или выбора
// пункта меню "Выход":
class HandlerNo implements ActionListener{
    public void actionPerformed(ActionEvent ae){
// Завершение работы программы:
        System.exit(0);}
}
// Класс обработчика для щелчка на кнопке "Да" или выбора
// пункта меню "Подтверждаю":
class HandlerYes implements ActionListener{
    // Ссылка на объект окна, в котором расположена кнопка:
    private MyFrame frame;
    // Конструктор класса:
    HandlerYes(MyFrame frame){
// Присваивание значения ссылке:
        this.frame=frame;}
    public void actionPerformed(ActionEvent ae){
// Вызов метода handler() для обработки события:
        frame.handler();}
}
// Класс обработчика для выбора пунктов меню
// "По горизонтали" и "По вертикали":
class MenuHandler implements ActionListener{
    // Ссылка на объект окна, в котором размещена панель меню:
    private MyFrame frame;
    // Логическое поле, определяющее, какое из двух меню используется:
    private boolean dir;
    // Конструктор класса.
// Аргументы - ссылка на объект окна и логический
// параметр, определяющий одно из двух меню
// (true - меню "По горизонтали" и false - меню "По вертикали"):
    MenuHandler(MyFrame frame,boolean dir){
// Присваивание значения ссылке:
        this.frame=frame;
// Присвоаивание значения логическому параметру:
        this.dir=dir;}
    // Переопределение метода для обработки выбора пункта меню:
    public void actionPerformed(ActionEvent ae){
// Считывание команды действия:
        String cmd=ae.getActionCommand();
// Реакция на выбор меню:
        if(dir){
            frame.move.HLab.setText(cmd.toLowerCase());
            if(cmd.equalsIgnoreCase("Вправо")) frame.setH(50);
            else if(cmd.equalsIgnoreCase("Влево")) frame.setH(-50);
            else frame.setH(0);}
        else{
            frame.move.VLab.setText(cmd.toLowerCase());
            if(cmd.equalsIgnoreCase("Вверх")) frame.setV(-50);
            else if(cmd.equalsIgnoreCase("Вниз")) frame.setV(50);
            else frame.setV(0);}
    }}
// Класс с главным методом программы:
public class MakeComponentsDemo{
    public static void main(String[] args){
// Создание окна:
        new MyFrame(" Служба перемещения окна \"Быстрый Заяц\"...",380,180);
    }}
