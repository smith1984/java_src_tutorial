package Ch_12;

// Подключение пакетов:
import java.awt.*;
import java.awt.event.*;
// Класс фрейма:
class PlotFrame extends Frame{
    // Конструктор (аргументы - высота и ширина окна):
    PlotFrame(int H,int W){
// Заголовок окна:
        setTitle("График функции");
        setBounds(100,50,W,H);        // Положение и размер окна
        setBackground(Color.GRAY);    // Цвет фона окна
        setLayout(null);        // Отключение менеджера размещения элементов
        Font f=new Font("Arial",Font.BOLD,11);  // Определение шрифта
        setFont(f);                             // Применение шрифта
        BPanel BPnl=new BPanel(6,30,W/4,H-35);   // Создание панели с кнопками
        add(BPnl);                               // Добавление панели в главное окно
// Панель для отображения графика (создание):
        PPanel PPnl=new PPanel(W/4+10,30,3*W/4-15,H-120,BPnl);
// Добавление панели в главное окно:
        add(PPnl);
// Третья панель для отображения справки:
        HPanel HPnl=new HPanel(W/4+10,H-85,3*W/4-15,80);
// Добавление панели в в главное окно:
        add(HPnl);
// Регистрация обработчика в окне (закрытие окна):
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ve){
                System.exit(0);}               // Закрытие окна
        });
// Регистрация обработчика для первой кнопки:
        BPnl.B1.addActionListener(new Button1Pressed(BPnl,PPnl));
// Регистрация обработчика для второй кнопки:
        BPnl.B2.addActionListener(new Button2Pressed());
// Регистрация обработчика для флажка вывода сетки:
        BPnl.Cb[3].addItemListener(new cbChanged(BPnl));
// Размер окна (фрейма) не изменяется:
        setResizable(false);
// Значок для окна программы:
        setIconImage(getToolkit().getImage("C:/icons/icon.png"));
        setVisible(true);              // Отображение окна
    }}
// Класс панели с кнопками:
class BPanel extends Panel{
    // Метки панели:
    public Label[] L;
    // Группа переключателей панели:
    public CheckboxGroup CbG;
    // Переключатели панели:
    public Checkbox[] Cb;
    // Раскрывающийся список:
    public Choice Ch;
    // Текстовое поле:
    public TextField TF;
    // Кнопки панели:
    public Button B1,B2;
    // Конструктор
// (аргументы - координаты и размеры панели):
    BPanel(int x,int y,int W,int H){
// Отключение менеджера размещения элементов на панели:
        setLayout(null);
        setBounds(x,y,W,H);   // Положение и размер панели
        setBackground(Color.LIGHT_GRAY);    // Цвет фона панели
// Массив меток:
        L=new Label[3];
// Текстовая метка:
        L[0]=new Label("Выбор цвета:",Label.CENTER);
// Шрифт для текстовой метки:
        L[0].setFont(new Font("Arial",Font.BOLD,12));
// Размеры метки:
        L[0].setBounds(5,5,getWidth()-10,30);
// Добавление метки на панель:
        add(L[0]);
// Группа переключателей:
        CbG=new CheckboxGroup();
        Cb=new Checkbox[4];
// Переключатели группы:
        Cb[0]=new Checkbox(" красный ",CbG,true); // Красный
        Cb[1]=new Checkbox(" синий ",CbG,false);  // Синий
        Cb[2]=new Checkbox(" черный ",CbG,false); // Черный
// Флажок вывода сетки:
        Cb[3]=new Checkbox(" Сетка ",true);
// Размеры переключателей и флажка и добавление их на панель:
        for(int i=0;i<4;i++){
            Cb[i].setBounds(5,30+i*25,getWidth()-10,30); // Размер
            add(Cb[i]);
        }
// Раскрывающийся список выбора цвета для линий сетки:
        Ch=new Choice();
// Добавление элемента "Зеленый":
        Ch.add("Зеленый");
// Добавление элемента "Желтый":
        Ch.add("Желтый");
// Добавление элемента "Серый":
        Ch.add("Серый");
// Размер и положение раскрывающегося списка:
        Ch.setBounds(20,140,getWidth()-25,30);
// Добавление списка на панель:
        add(Ch);
// Вторая текстовая метка:
        L[1]=new Label("Интервал по х:",Label.CENTER);
// Шрифт для метки:
        L[1].setFont(new Font("Arial",Font.BOLD,12));
// Размер и положение метки:
        L[1].setBounds(5,220,getWidth()-10,30);
// Добавление метки на панель:
        add(L[1]);
// Третья текстовая метка:
        L[2]=new Label("От x=0 до x=",Label.LEFT);
// Размер и положение метки:
        L[2].setBounds(5,250,70,20);
// Добавление метки на панель:
        add(L[2]);
// Текстовое поле для ввода границы интервала:
        TF=new TextField("10");
// Размер и положение поля:
        TF.setBounds(75,250,45,20);
// Добавление поля на панель:
        add(TF);
// Первая кнопка ("Нарисовать"):
        B1=new Button("Нарисовать");
// Вторая кнопка ("Закрыть"):
        B2=new Button("Закрыть");
// Размеры и положение первой кнопки:
        B1.setBounds(5,getHeight()-75,getWidth()-10,30);
// Размер и положение второй кнопки:
        B2.setBounds(5,getHeight()-35,getWidth()-10,30);
        add(B1);      // Добавление первой кнопки на панель
        add(B2);      // Добавление второй кнопки на панель
    }}
// Класс панели для отображения графика:
class PPanel extends Panel{
    // Ссылка на объект реализации графика функции:
    public Plotter G;
    // Внутренний класс для реализации графика функции:
    class Plotter{
        // Границы диапазона изменения координат:
        private double Xmin=0,Xmax,Ymin=0,Ymax=1.0;
        // Состояние флажка вывода сетки:
        private boolean status;
        // Цвет для линии графика:
        private Color clr;
        // Цвет для отображения линий сетки:
        private Color gclr;
        // Конструктор класса
// (аргументы - панель с кнопками и панель для отображения графика):
        Plotter(BPanel P){
// Считывание значения текстового поля и преобразование в число:
            try{
                Xmax=Double.valueOf(P.TF.getText());}
            catch(NumberFormatException e){
                P.TF.setText("10");
                Xmax=10;}
            status=P.Cb[3].getState();
// Определение цвета линий сетки:
            switch(P.Ch.getSelectedIndex()){
                case 0:
                    gclr=Color.GREEN;
                    break;
                case 1:
                    gclr=Color.YELLOW;
                    break;
                default:
                    gclr=Color.GRAY;}
// Цвет линии графика:
            String name=P.CbG.getSelectedCheckbox().getLabel();
            if(name.equalsIgnoreCase(" красный ")) clr=Color.RED;
            else if(name.equalsIgnoreCase(" синий ")) clr=Color.BLUE;
            else clr=Color.BLACK;
        }
        // Отображаемая на графике функция:
        private double f(double x){
            return (1+Math.sin(x))/(1+Math.abs(x));}
        // Метод для считывания и запоминания настроек:
        public Plotter remember(BPanel P){
            return new Plotter(P);}
        // Метод для отображения графика и сетки
// (Fig - объект графического контекста):
        public void plot(Graphics Fig){
// Параметры области отображения графика:
            int H,W,h,w,s=20;
            H=getHeight();
            W=getWidth();
            h=H-2*s;
            w=W-2*s;
// Очистка области графика:
            Fig.clearRect(0,0,W,H);
// Индексная переменная и количество линий сетки:
            int k,nums=10;
// Цвет координатных осей - черный:
            Fig.setColor(Color.BLACK);
// Отображение координатных осей:
            Fig.drawLine(s,s,s,h+s);
            Fig.drawLine(s,s+h,s+w,s+h);
// Отображение засечек и числовых значений на координатных осях:
            for(k=0;k<=nums;k++){
                Fig.drawLine(s+k*w/nums,s+h,s+k*w/nums,s+h+5);
                Fig.drawLine(s-5,s+k*h/nums,s,s+k*h/nums);
                Fig.drawString(Double.toString(Xmin+k*(Xmax-Xmin)/nums),s+k*w/nums-5,s+h+15);
                Fig.drawString(Double.toString(Ymin+k*(Ymax-Ymin)/nums),s-17,s+h-1-k*h/nums);
            }
// Отображение сетки (если установлен флажок):
            if(status){
                Fig.setColor(gclr);
// Отображение линий сетки:
                for(k=1;k<=nums;k++){
                    Fig.drawLine(s+k*w/nums,s,s+k*w/nums,h+s);
                    Fig.drawLine(s,s+(k-1)*h/nums,s+w,s+(k-1)*h/nums);
                }}
// Отображение графика:
            Fig.setColor(clr);     // Установка цвета линии
// Масштаб на один пиксель по каждой из координат:
            double dx=(Xmax-Xmin)/w,dy=(Ymax-Ymin)/h;
// Переменные для записи декартовых координат:
            double x1,x2,y1,y2;
// Переменные для записи координат в окне отображения графика:
            int h1,h2,w1,w2;
// Начальные значения:
            x1=Xmin;
            y1=f(x1);
            w1=s;
            h1=h+s-(int)Math.round(y1/dy);
// Шаг в пикселях для базовых точек:
            int step=5;
// Отображение базовых точек и соединение их линиями:
            for(int i=step;i<=w;i+=step){
                x2=i*dx;
                y2=f(x2);
                w2=s+(int)Math.round(x2/dx);
                h2=h+s-(int)Math.round(y2/dy);
// Линия:
                Fig.drawLine(w1,h1,w2,h2);
// Базовая точка (квадрат):
                Fig.drawRect(w1-2,h1-2,4,4);
// Новые значения для координат:
                x1=x2;
                y1=y2;
                w1=w2;
                h1=h2;}
        }}
    // Конструктор панели
// (аргументы - координаты и размеры панели,
// а также ссылка на панель с кнопками):
    PPanel(int x,int y,int W,int H,BPanel P){
// Создание объекта реализации графика функции:
        G=new Plotter(P);
// Цвет фона панели:
        setBackground(Color.WHITE);
// Размер и положение панели:
        setBounds(x,y,W,H);
    }
    // Переопределение метода перерисовки панели:
    public void paint(Graphics g){
// При перерисовке панели вызывается метод
// для отображения графика:
        G.plot(g);
    }}
// Класс для панели справки:
class HPanel extends Panel{
    // Метка:
    public Label L;
    // Текстовая область:
    public TextArea TA;
    // Конструктор создания панели
// (аргументы - координаты и размеры панели):
    HPanel(int x,int y,int W,int H){
// Цвет фона панели:
        setBackground(Color.LIGHT_GRAY);
// Размер и положение панели:
        setBounds(x,y,W,H);
// Отключения менеджера размещения компонентов панели:
        setLayout(null);
// Метка для панели справки:
        L=new Label("СПРАВКА",Label.CENTER);
// Размер и положение метки:
        L.setBounds(0,0,W,20);
// Добавление метки на панель:
        add(L);
// Текстовая область для панели справки:
        TA=new TextArea(" График функции y(x)=(1+sin(x))/(1+|x|)");
// Шрифт для текстовой области:
        TA.setFont(new Font("Serif",Font.PLAIN,15));
// Размер и положение текстовой области:
        TA.setBounds(5,20,W-10,60);
// Область недоступна для редактирования:
        TA.setEditable(false);
// Добавление текстовой области на панель справки:
        add(TA);
    }}
// Класс обработчика для первой кнопки:
class Button1Pressed implements ActionListener{
    // Панель с кнопками:
    private BPanel P1;
    // Панель для отображения графики:
    private PPanel P2;
    // Конструктор класса (аргументы - панели):
    Button1Pressed(BPanel  P1,PPanel P2){
        this.P1=P1;
        this.P2=P2;}
    // Метод для обработки щелчка на кнопке:
    public void actionPerformed(ActionEvent ae){
// Обновление параметров (настроек) для отображения графика:
        P2.G=P2.G.remember(P1);
// Реакция на щелчок (прорисовка графика):
        P2.G.plot(P2.getGraphics());
    }}
// Класс обработчика для второй кнопки:
class Button2Pressed implements ActionListener{
    // Метод для обработки щелчка на кнопке:
    public void actionPerformed(ActionEvent ae){
// Реакция на щелчок:
        System.exit(0);
    }}
// Класс обработчика для флажка вывода сетки:
class cbChanged implements ItemListener{
    // Список выбора цвета для сетки:
    private Choice ch;
    // Конструктор класса (аргумент - панель с кнопками):
    cbChanged(BPanel P){
        this.ch=P.Ch;}
    // Метод для обработки изменения состояния флажка:
    public void itemStateChanged(ItemEvent ie){
// Реакция на изменение состояния флажка:
        ch.setEnabled(ie.getStateChange()==ie.SELECTED);
    }}
// Класс с главным методом программы:
class PlotDemo{
    public static void main(String args[]){
// Создание окна:
        new PlotFrame(400,500);}
}
