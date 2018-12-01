package Cp_14;

import java.awt.*;
import javax.swing.*;
public class SpringWin extends JFrame{
    JComponent[] comp = {
            new JButton("Длинная надпись"),
            new JButton("<html>Надпись с<p> двумя строками"),
            new JButton("OK")
    };
    public SpringWin(){
        super(" Размещение SpringLayout");
        SpringLayout sl = new SpringLayout();
        setLayout(sl);
// Задаем величину промежутка между компонентами
        Spring xPad = Spring.constant(6);
// Задаем величину отступа от границ контейнера
        Spring yPad = Spring.constant(10);
// Текущее положение левого верхнего угла
        Spring currX = yPad;
// Наибольшая высота компонента, пока 0
        Spring maxHeight = Spring.constant(0);
        for (int i = 0; i < comp.length; i++){
            add(comp[i]);
// Получаемразмер i-го компонента
            SpringLayout.Constraints cons = sl.getConstraints(comp[i]);
// Устанавливаем положение i-го компонента
            cons.setX(currX);
            cons.setY(yPad);
// Перемещаем текущее положение угла
            currX = Spring.sum(xPad, cons.getConstraint("East"));
            // Изменяем наибольшую высоту
            maxHeight = Spring.max(maxHeight, cons.getConstraint("South"));
        }
// Получаем размеры контейнера
        SpringLayout.Constraints pCons = sl.getConstraints(getContentPane());
// Устанавливаем размеры всего содержимого контейнера
        pCons.setConstraint(SpringLayout.EAST, Spring.sum(currX, yPad));
        pCons.setConstraint(SpringLayout.SOUTH, Spring.sum(maxHeight, yPad));
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String args[]){
        new SpringWin();
    }
}