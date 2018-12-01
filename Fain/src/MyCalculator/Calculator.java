package MyCalculator;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
public class Calculator {
    // Объявление всех компонентов калькулятора.
    JPanel windowContent;
    JFormattedTextField displayField;
    JButton [] numButtons;
    JButton buttonPoint;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonMultiply;
    JButton buttonDivide;
    JButton buttonEqual;
    JPanel p1;
    JPanel p2;
    // В конструкторе создаются все компоненты
// и добавляются на фрейм с помощью комбинации
// Borderlayout и Gridlayout
    Calculator(){
        windowContent= new JPanel();
// Задаём схему для этой панели
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
// Создаём и отображаем поле
// Добавляем его в Северную область окна
        displayField = new JFormattedTextField();
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        windowContent.add("North",displayField);
// Создаём кнопки, используя конструктор
// класса JButton, который принимает текст
// кнопки в качестве параметра
        numButtons = new JButton[10];
        for (int i = 0; i < 10; i++)
            numButtons[i] = new JButton(""+i);
        buttonPoint = new JButton(".");
        buttonEqual=new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
// Создаём панель с GridLayout
// которая содержит 12 кнопок - 10 кнопок с числами
// и кнопки с точкой и знаком равно
        p1 = new JPanel();
        GridLayout gl =new GridLayout(4,3);
        p1.setLayout(gl);
// Добавляем кнопки на панель p1
        for (int i = 1; i < 10; i++)
            p1.add(numButtons[i]);
        p1.add(numButtons[0]);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
// Помещаем панель p1 в центральную область окна
        windowContent.add("Center",p1);
        JPanel p2= new JPanel();
        GridLayout gl2 =new GridLayout(4,1);
        p2.setLayout(gl2);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMultiply);
        p2.add(buttonDivide);
        windowContent.add("East", p2);
//Создаём фрейм и задаём его основную панель
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
// делаем размер окна достаточным
// для того, чтобы вместить все компоненты
        frame.pack();
// Наконец, отображаем окно
        frame.setSize(200, 200);
        frame.setVisible(true);
        CalculatorEngine calcEngine = new CalculatorEngine(this);
        for (int i = 0; i < 10; i++)
        numButtons[i].addActionListener(calcEngine);
        buttonPoint.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
    }
    public static void main(String[] args) {

        Calculator calc = new Calculator();
    }
}