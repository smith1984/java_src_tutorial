package Cp_10;

import java.awt.*;
import java.awt.event.*;
class TextTest extends Frame{
    TextTest(String s){
        super(s);
        setLayout(null);
        setFont(new Font("Serif", Font.PLAIN, 14));
        Label l1 = new Label("Ваше имя:", Label.RIGHT);
        l1.setBounds(20, 30, 70, 25); add(l1);
        Label l2 = new Label("Пароль:", Label.RIGHT);
        l2.setBounds(20, 60, 70, 25); add(l2);
        TextField tf1 = new TextField(30);
        tf1.setBounds(100, 30, 160, 25); add(tf1);
        TextField tf2 = new TextField(30);
        tf2.setBounds(100, 60, 160, 25); add(tf2);
        tf2.setEchoChar('*');
        TextField tf3 = new TextField("Введите сюда Ваш заказ", 30);
        tf3.setBounds(10, 100, 250, 30); add(tf3);
        TextArea ta = new TextArea("Ваш заказ:", 5, 50,
                TextArea.SCROLLBARS_NONE);
        ta.setEditable(false);
        ta.setBounds(10, 150, 250, 140); add(ta);
        Button b1 = new Button("Применить");
        b1.setBounds(280, 180, 100, 30); add(b1);
        Button b2 = new Button("Отменить");
        b2.setBounds(280, 220, 100, 30); add(b2);
        Button b3 = new Button("Выйти");
        b3.setBounds(280, 260, 100, 30); add(b3);
        setSize(400, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        Frame f = new TextTest(" Поля ввода");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
}