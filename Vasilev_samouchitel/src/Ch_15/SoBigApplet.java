package Ch_15;

// Подключение пакетов:
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
// Класс для панели со статическим текстом:
class SimpleTextPanel extends JPanel{
    // Конструктор класса:
    SimpleTextPanel(String text){
// Конструктор суперкласса:
        super();
// Создание метки:
        JLabel lbl=new JLabel(text,JLabel.CENTER);
// Применение шрифта для метки:
        lbl.setFont(new Font("Monospaced",Font.BOLD+Font.ITALIC,15));
// Добавление метки на панель:
        add(lbl);}}
// Класс для панели с изменяемым текстом:
class MainTextPanel extends JPanel{
    // Метка с изменяемым текстом:
    private JLabel MainText;
    // Метод для изменения текста метки:
    public void setMainText(String text){
        MainText.setText(text);}
    // Метод для применения шрифта метки:
    public void setMainFont(Font fnt){
        MainText.setFont(fnt);}
    // Конструктор класса:
    MainTextPanel(String text,Font fnt){
// Конструктор суперкласса:
        super();
// Отображение рамки вокруг панели:
        setBorder(BorderFactory.createEtchedBorder());
// Создание метки:
        MainText=new JLabel(text,JLabel.CENTER);
// Применение для метки шрифта:
        MainText.setFont(fnt);
// Добавление метки на панель:
        add(MainText);}}
// Классы подпанелей, используемые в панели с вкладками.
// Класс панели с раскрывающимся списком
// для выбора типа шрифта:
class FontTypePanel extends JPanel{
    // Поле - объект раскрывающегося списка:
    private JComboBox FontTypeList;
    // Метод для определения типа шрифта:
    public String getFontType(){
        return (String)FontTypeList.getSelectedItem();}
    // Конструктор класса:
    FontTypePanel(ActionListener hnd){
// Вызов конструктора суперкласса:
        super();
// Отображение рамки вокруг панели:
        setBorder(BorderFactory.createEtchedBorder());
// Подключение менеджера компоновки:
        setLayout(new GridLayout(5,1,2,2));
// Добавление текстовой метки:
        add(new JLabel("Выберите тип шрифта:"));
// Список доступных шрифтов:
        String[] fonts={"Dialog","DialogInput","Monospaced","Serif","SansSerif"};
// Создание раскрывающегося списка:
        FontTypeList=new JComboBox(fonts);
// Регистрация обработчика:
        FontTypeList.addActionListener(hnd);
// Добавление раскрывающегося списка в панель:
        add(FontTypeList);}}
// Класс для панели с группой переключателей
// для выбора стиля шрифта:
class FontStylePanel extends JPanel{
    // Поля - объекты переключателей:
    private JRadioButton normal,italic,bold,it_bold;
    // Метод для определения стиля шрифта:
    public int getFontStyle(){
        if(normal.isSelected()) return Font.PLAIN;
        if(italic.isSelected()) return Font.ITALIC;
        if(bold.isSelected()) return Font.BOLD;
        else return Font.ITALIC+Font.BOLD;}
    // Конструктор класса:
    FontStylePanel(ActionListener hnd){
// Вызов конструктора суперкласса:
        super();
// Отображение рамки вокруг панели:
        setBorder(BorderFactory.createEtchedBorder());
// Подключение менеджера компоновки:
        setLayout(new GridLayout(5,1,2,2));
// Добавление в панель текстовой метки:
        add(new JLabel("Выберите стиль шрифта:"));
// Объект для группы переключателей:
        ButtonGroup rbg=new ButtonGroup();
// Первый переключатель:
        normal=new JRadioButton("Обычный",true);
// Регистрация обработчика:
        normal.addActionListener(hnd);
// Добавление первого переключателя в группу:
        rbg.add(normal);
// Добавление первого переключателя на панель:
        add(normal);
// Второй переключатель:
        italic=new JRadioButton("Курсив",false);
// Регистрация обработчика:
        italic.addActionListener(hnd);
// Добавление второго переключателя в группу:
        rbg.add(italic);
// Добавление второго переключателя на панель:
        add(italic);
// Третий переключатель:
        bold=new JRadioButton("Жирный",false);
// Регистрация обработчика:
        bold.addActionListener(hnd);
// Добавление третьего переключателя в группу:
        rbg.add(bold);
// Добавление третьего переключателя на панель:
        add(bold);
// Четвертый переключатель:
        it_bold=new JRadioButton("Жирный курсив",false);
// Регистрация обработчика:
        it_bold.addActionListener(hnd);
// Добавление четвертого переключателя в группу:
        rbg.add(it_bold);
// Добавление четвертого переключателя на панель:
        add(it_bold);}}
// Класс панели с регулятором выбора размера шрифта:
class FontSizePanel extends JPanel{
    // Поле - объект регулятора:
    private JSpinner FontSize;
    // Метод для определения размера шрифта:
    public int getFontSize(){
        return (Integer)FontSize.getValue();}
    // Конструктор класса:
    FontSizePanel(ChangeListener hnd){
// Вызов конструктора суперкласса:
        super();
// Отображение рамки вокруг панели:
        setBorder(BorderFactory.createEtchedBorder());
// Подключение менеджера компоновки:
        setLayout(new GridLayout(5,1,2,2));
// Добавление текстовой метки:
        add(new JLabel("Выберите размер шрифта:"));
// Объект для модели регулятора:
        SpinnerNumberModel snm=new SpinnerNumberModel(15,15,25,1);
// Создание объекта регулятора:
        FontSize=new JSpinner(snm);
// Регистрация обработчика:
        FontSize.addChangeListener(hnd);
// Добавление регулятора на панель:
        add(FontSize);}}
// Класс для панели первой вкладки:
class FontPanel extends JPanel{
    // Поле - ссылка на панель выбора типа шрифта:
    private FontTypePanel FTP;
    // Поле - ссылка на панель выбора стиля шрифта:
    private FontStylePanel FSP;
    // Поле - ссылка на панель выбора размера шрифта:
    private FontSizePanel FZP;
    // Метод для определения шрифта:
    public Font newFont(){
        return new Font(FTP.getFontType(),FSP.getFontStyle(),FZP.getFontSize());}
    // Конструктор класса:
    FontPanel(ActionListener hnd1,ChangeListener hnd2){
// Конструктор суперкласса:
        super();
// Подключение менеджера компоновки:
        setLayout(new GridLayout(1,3,2,2));
// Панель выбора типа шрифта:
        FTP=new FontTypePanel(hnd1);
// Панель выбора стиля шрифта:
        FSP=new FontStylePanel(hnd1);
// Панель выбора размера шрифта:
        FZP=new FontSizePanel(hnd2);
// Добавление панели выбора типа шрифта в панель-контейнер:
        add(FTP);
// Добавление панели выбора стиля шрифта в панель-контейнер:
        add(FSP);
// Добавление панели выбора размера шрифта в панель-контейнер:
        add(FZP);}}
// Класс для панели второй вкладки:
class TextPanel extends JPanel{
    // Ссылка на текстовое поле:
    public JTextField TF;
    // Ссылка на опцию:
    public JCheckBox CB;
    // Ссылка на кнопку:
    public JButton BT;
    // Конструктор класса:
    TextPanel(ActionListener hnd){
// Конструктор суперкласса:
        super();
// Подключение менеджера компоновки:
        setLayout(new GridLayout(4,1,2,2));
// Отображение рамки вокруг панели:
        setBorder(BorderFactory.createEtchedBorder());
// Создание опции:
        CB=new JCheckBox("Изменить значение текста",false);
// Регистрация обработчика:
        CB.addActionListener(hnd);
// Создание текстового поля:
        TF=new JTextField();
// Текстовое поле недоступно:
        TF.setEnabled(false);
// Создание кнопки:
        BT=new JButton("Подтверждаю");
// Регистрация обработчика:
        BT.addActionListener(hnd);
// Кнопка недоступна:
        BT.setEnabled(false);
// Добавление опции на панель:
        add(CB);
// Добавление метки на панель:
        add(new JLabel(" Поле для ввода текста:"));
// Добавление текстового поля на панель:
        add(TF);
// Добавление кнопки на панель:
        add(BT);}}
// Класс для панели с вкладками:
class TPanel extends JTabbedPane{
    // Ссылка на панель выбора шрифта:
    public FontPanel FP;
    // Ссылка на панель выбора текста:
    public TextPanel TP;
    // Конструктор класса:
    TPanel(ActionListener hnd1,ChangeListener hnd2,ActionListener hnd3){
// Конструктор суперкласса:
        super();
// Создание панели выбора шрифта:
        FP=new FontPanel(hnd1,hnd2);
// Добавление вкладки с панелью выбора шрифта:
        addTab("Выбор шрифта",FP);
// Создание панели выбора текста:
        TP=new TextPanel(hnd3);
// Добавление вкладки с панелью выбора текста:
        addTab("Выбор текста",TP);
    }}
// Класс создания апплета:
public class SoBigApplet extends JApplet{
    // Ссылка на панель с вкладками:
    private TPanel tpnl;
    // Ссылка на панель со статическим текстом:
    private SimpleTextPanel stp;
    // Ссылка на панель с изменяемым текстом:
    private MainTextPanel mtp;
    // Метод инициализации апплета:
    public void init(){
// Обработчик для утилит выбора шрифта:
        FontHandler fhnd=new FontHandler();
// Обработчик для утилит выбора текста:
        TextHandler thnd=new TextHandler();
// Отключение менеджера компоновки:
        setLayout(null);
// Переменные для записи размеров апплета:
        int w,h;
// Считывание ширины апплета:
        w=getWidth();
// Считывание высоты апплета:
        h=getHeight();
// Создание панели с вкладками:
        tpnl=new TPanel(fhnd,fhnd,thnd);
// Положение и размеры панели с вкладками:
        tpnl.setBounds(0,0,w,3*h/5);
// Создание панели со статическим текстом:
        stp=new SimpleTextPanel("Образец текста:");
// Положение и размеры панели со статическим текстом:
        stp.setBounds(0,3*h/5,w,h/5);
// Панель с изменяемым текстом:
        mtp=new MainTextPanel("Здесь отображается текстовая строка",tpnl.FP.newFont());
// Положение и размеры панели с изменяемым текстом:
        mtp.setBounds(0,4*h/5,w,h/5);
// Добавление в апплет панели с вкладками:
        add(tpnl);
// Добавление в апплет панели со статическим текстом:
        add(stp);
// Добавление в апплет панели с изменяемым текстом:
        add(mtp);}
    // Внутренний класс для обработки изменений типа, стиля и размера шрифта:
    class FontHandler implements ActionListener,ChangeListener{
        // Внутренний метод для "считывания" и применения шрифта:
        private void applyFont(){
            mtp.setMainFont(tpnl.FP.newFont());}
        // Переопределение метода для реакции на изменение типа и стиля шрифта:
        public void actionPerformed(ActionEvent ae){
            applyFont();}
        // Переопределение метода для реакции на изменение размера шрифта:
        public void stateChanged(ChangeEvent ce){
            applyFont();}}
    // Внутренний класс для обработки изменения отображаемого текста:
    class TextHandler implements ActionListener{
        // Внутренний метод для изменения состояния элементов управления панели:
        private void OffOn(boolean state){
            tpnl.TP.CB.setSelected(state);
            tpnl.TP.TF.setEnabled(state);
            tpnl.TP.BT.setEnabled(state);}
        // Переопределение метода для реакции на изменение
// состояния управляющих элементов панели:
        public void actionPerformed(ActionEvent ae){
            String ac=ae.getActionCommand();
            if(ac.equalsIgnoreCase(tpnl.TP.BT.getText())){
                mtp.setMainText(tpnl.TP.TF.getText());
                OffOn(false);}
            else OffOn(tpnl.TP.CB.isSelected());}
    }}
