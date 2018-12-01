package Cp_10;

import java.awt.*;
import java.awt.event.*;
class SimpleComp extends Frame{
    SimpleComp(String s){
        super(s);
        setLayout(null);
        Font f = new Font("Serif", Font.BOLD, 15);
        setFont(f);
        Label l1 = new Label("Выберите товар:", Label.CENTER);
        l1.setBounds(10, 50, 120, 30); add(l1);
        Label l2 = new Label("Выберите способ оплаты:");
        l2.setBounds(160, 50, 200, 30); add(l2);
        Checkbox ch1 = new Checkbox("Книги");
        ch1.setBounds(20, 90, 100, 30); add(ch1);
        Checkbox ch2 = new Checkbox("Диски");
        ch2.setBounds(20, 120, 100, 30); add(ch2);
        Checkbox ch3 = new Checkbox("Игрушки");
        ch3.setBounds(20, 150, 100, 30); add(ch3);
        CheckboxGroup grp = new CheckboxGroup();
        Checkbox chg1 = new Checkbox("Почтовым переводом", grp, true);
        chg1.setBounds(170, 90, 200, 30); add(chg1);
        Checkbox chg2 = new Checkbox("Кредитной картой", grp, false);
        chg2.setBounds(170, 120, 200, 30); add(chg2);
        Button b1 = new Button("Продолжить");
        b1.setBounds( 30, 220, 100, 30); add(b1);
        Button b2 = new Button("Отменить");
        b2.setBounds(140, 220, 100, 30); add(b2);
        Button b3 = new Button("Выйти");
        b3.setBounds(250, 220, 100, 30); add(b3);
        setSize(400, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        Frame f = new SimpleComp(" Простые компоненты");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
}
