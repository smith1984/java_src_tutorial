package Cp_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WheelEv extends JFrame
        implements MouseWheelListener{
    JTextArea ta = new JTextArea(5, 30);
    WheelEv(){
        super(" Колесико мыши");
        getContentPane().add(ta);
        ta.addMouseWheelListener(this);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void mouseWheelMoved(MouseWheelEvent e){
        if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL)
            ta.append(" Единицы = " + e.getUnitsToScroll() +
                    " Количество = "+ e.getScrollAmount() +
                    " Вращение = " + e.getWheelRotation() + "\n");
    }
    public static void main(String[] args){
        new WheelEv();
    }
}
