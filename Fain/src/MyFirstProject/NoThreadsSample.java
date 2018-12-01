package MyFirstProject;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class NoThreadsSample extends JFrame
        implements ActionListener{
    // Конструктор
    NoThreadsSample(){
// Создать окно с кнопкой и текстовым полем
        GridLayout gl =new GridLayout(2,1);
        this.getContentPane().setLayout(gl);
        JButton myButton = new JButton("Kill Time");
        myButton.addActionListener(this);
        this.getContentPane().add(myButton);
        this.getContentPane().add(new JTextField());
    }
    // Обработчик нажатия кнопки
    public void actionPerformed(ActionEvent e){
// Просто заморозить на некоторое время,
// чтобы показать, что окно заблокировано
        for (int i=0; i<300000;i++){
            this.setTitle("i="+i);
        }
    }
    public static void main(String[] args) {
// Создать окно
        NoThreadsSample myWindow = new NoThreadsSample();
// Убедиться, что окно закрывается при нажатии на крестик в углу
        myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
// Установить размеры окна – координаты левого верхнего
//угла и высоту с шириной
        myWindow.setBounds(0,0,150, 100);
//Сделать окно видимым
        myWindow.setVisible(true);
    }
}
