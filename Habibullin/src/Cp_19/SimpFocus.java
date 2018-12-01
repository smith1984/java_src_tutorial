package Cp_19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SimpFocus extends JFrame implements FocusListener{
    DefaultKeyboardFocusManager myFocusmgr =
            new DefaultKeyboardFocusManager();
    JButton bt;
    JTextField tf;
    JTextArea ta;
    SimpFocus(){
        super(" Передача фокуса");
        JPanel p = new JPanel();
        add(p, BorderLayout.NORTH);
        bt = new JButton(" myButton ");
        bt.putClientProperty("Focus", "JButton bt");
        tf = new JTextField(" myTextField ");
        tf.putClientProperty("Focus", "JTextField tf");
        tf.addFocusListener(this);
        ta = new JTextArea(6, 40);
        ta.putClientProperty("Focus", "JTextArea ta");
        add(ta);
        p.add(tf);
        p.add(bt);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        printDefaultSettings(myFocusmgr);
        changeFocusOwner(myFocusmgr);
    }
    public void focusLost(FocusEvent e){
        ta.append("\n myTextField: Фокус потерян.");
        ta.append("\n Передача фокуса компоненту " +
                ((JComponent)e.getOppositeComponent()).
                        getClientProperty("Focus")+".");
    }
    public void focusGained(FocusEvent e){
        ta.append("\n myTextField: Фокус получен.");
    }
    public void printDefaultSettings(
            DefaultKeyboardFocusManager fm){
        ta.append("\n Навигационные клавиши: ");
        ta.append("\n FORWARD_TRAVERSAL_KEYS: " +
                fm.getDefaultFocusTraversalKeys(
                        KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        ta.append("\n BACKWARD_TRAVERSAL_KEYS: " +
                fm.getDefaultFocusTraversalKeys(
                        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS));
        ta.append("\n UP_CYCLE_TRAVERSAL_KEYS: " +
                fm.getDefaultFocusTraversalKeys(
                        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS));
        ta.append("\n DOWN_CYCLE_TRAVERSAL_KEYS: " +
                fm.getDefaultFocusTraversalKeys(
                        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS));
    }
    public void changeFocusOwner(DefaultKeyboardFocusManager fm){
        ta.append("\n Фокус у " +
                ((JComponent)fm.getFocusOwner()).getClientProperty("Focus"));
        ta.append("\n Контейнер верхнего уровня: " +
                (fm.getCurrentFocusCycleRoot()));
        ta.append("\n Передача фокуса следующему компоненту.");
        fm.focusNextComponent();
        ta.append("\n Сейчас фокус у " +
                ((JComponent)fm.getFocusOwner()).getClientProperty("Focus"));
        ta.append("\n Передача фокуса предыдущему компоненту.");
        fm.focusPreviousComponent();
        ta.append("\n Теперь фокус у " +
                ((JComponent)fm.getFocusOwner()).getClientProperty("Focus"));
    }
    public static void main(String[] args){
        new SimpFocus();
    }
}
