package Cp_10;
import java.awt.*;
import java.awt.event.*;
class LoginWin extends Dialog{
    LoginWin(Frame f, String s){
        super(f, s, true);
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
        Button b1 = new Button("Применить");
        b1.setBounds(50, 100, 100, 30); add(b1);
        Button b2 = new Button("Отменить");
        b2.setBounds(160, 100, 100, 30); add(b2);
        setBounds(50, 50, 300, 150);
    }
}
class DialogTest extends Frame{
    DialogTest(String s){
        super(s);
        setLayout(null);
        setSize(200, 100);
        setVisible(true);
        Dialog d = new LoginWin(this, " Окно входа");
        d.setVisible(true);
    }
    public static void main(String[] args){
        Frame f = new DialogTest(" Окно-владелец");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
}