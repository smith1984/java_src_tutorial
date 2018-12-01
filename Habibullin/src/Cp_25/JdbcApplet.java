package Cp_25;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
import java.sql.*;
public class JdbcApplet extends Applet implements ActionListener, Runnable{
    private TextField tf1, tf2, tf3;
    private TextArea ta;
    private Button b1, b2;
    private String url = "jdbc:oracle:thin:@localhost:1521:ORCL",
            login = "scott",
            password = "tiger",
            query = "SELECT * FROM dept";
    private Thread th;
    private Vector results;
    public void init(){
        setBackground(Color.white);
        /*try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        }catch(SQLException e){
            System.err.println(e);
        }*/
        setLayout(null);
        setFont(new Font("Serif", Font.PLAIN, 14));
        Label l1 = new Label("URL базы:", Label.RIGHT);
        l1.setBounds(20, 30, 70, 25); add(l1);
        Label l2 = new Label("Имя:", Label.RIGHT);
        l2.setBounds(20, 60, 70, 25); add(l2);
        Label l3 = new Label("Пароль:", Label.RIGHT);
        l3.setBounds(20, 90, 70, 25); add(l3);
        tf1 = new TextField(url, 30);
        tf1.setBounds(100, 30, 280, 25); add(tf1);
        tf2 = new TextField(login, 30);
        tf2.setBounds(100, 60, 280, 25); add(tf2);
        tf3 = new TextField(password, 30);
        tf3.setBounds(100, 90, 280, 25); add(tf3);
        tf3.setEchoChar('*');
        Label l4 = new Label("Запрос:", Label.LEFT);
        l4.setBounds(10, 120, 70, 25); add(l4);
        ta = new TextArea(query, 5, 50, TextArea.SCROLLBARS_NONE);
        ta.setBounds(10, 150, 370, 100); add(ta);
        Button b1 = new Button("Отправить");
        b1.setBounds(280, 260, 100, 30); add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        url = tf1.getText();
        login = tf2.getText();
        password = tf3.getText();
        query = ta.getText();
        if (th == null){
            th = new Thread(this);
            th.start();
        }
    }
    public void run(){
        try{
            Connection con = DriverManager.getConnection(url, login, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
// Узнаем число столбцов
            int n = rsmd.getColumnCount();
            results = new Vector();
            while (rs.next()){
                String s = " ";
// Номера столбцов начинаются с 1!
                for (int i = 1; i <= n; i++)
                    s += " " + rs.getObject(i);
                results.addElement(s);
            }
            rs.close();
            st.close();
            con.close();
            repaint();
        }catch(Exception e){
            System.err.println(e);
        }
        repaint();
    }
    public void paint(Graphics g){
        if (results == null){
            g.drawString("Can't execute the query", 5, 30);
            return;
        }
        int y = 30, n = results.size();
        for (int i = 0; i < n; i++)
            g.drawString((String)results.elementAt(i), 5, y += 20);
    }
}