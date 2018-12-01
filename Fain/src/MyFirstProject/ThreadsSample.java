package MyFirstProject;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ThreadsSample extends JFrame
        implements ActionListener, Runnable{
    // Конструктор
    ThreadsSample(){
// Создать окно с кнопкой и текстовым полем
        GridLayout gl =new GridLayout(2,1);
        this.getContentPane().setLayout(gl);
        JButton myButton = new JButton("Kill Time");
        myButton.addActionListener(this);
        this.getContentPane().add(myButton);
        this.getContentPane().add(new JTextField());
    }
    public void actionPerformed(ActionEvent e){
// Создать поток и выполнить “замораживающий” код
// без блокировки
        Thread worker = new Thread(this);
        worker.start(); // вызывает метод run()
    }
    public void run(){
// Заморозить на некоторое время, чтобы показать, что
// элементы окна НЕ блокируются
        for (int i=0; i<300000;i++){
            this.setTitle("i="+i);
        }
    }
    public static void main(String[] args) {
        ThreadsSample myWindow = new ThreadsSample();
//Убедись,что окно закрывается по нажатию на крестик в углу
        myWindow.setDefaultCloseOperation(
                WindowConstants.EXIT_ON_CLOSE);
// Установи размеры окна и сделай его видимым
        myWindow.setBounds(0,0,150, 100);
        myWindow.setVisible(true);
    }
}