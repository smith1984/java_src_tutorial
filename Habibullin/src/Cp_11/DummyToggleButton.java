package Cp_11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class DummyToggleButton extends JFrame{
    private JToggleButton tb;
    public DummyToggleButton(){
        tb = new JToggleButton("<html><u>Д</u>а?<p>Нет?");
        tb.setMnemonic(KeyEvent.VK_L);
        tb.setToolTipText("Сделайте выбор");
        add(tb);
// Для JDK версии ранее 5.0 уберите комментарий
// getContentPane().add(tb);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new DummyToggleButton();
    }
}