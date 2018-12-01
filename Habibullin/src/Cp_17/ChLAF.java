package Cp_17;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.*;
import javax.swing.*;
public class ChLAF extends JFrame {
    ChLAF() {
        super(" Смена L&F");
        setLayout(new FlowLayout());
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu serv = new JMenu("Сервис");
        mb.add(serv);
        JMenu laf = new JMenu("Вид");
        serv.add(laf);
        ButtonGroup bg = new ButtonGroup();
        UIManager.LookAndFeelInfo[] info =
                UIManager.getInstalledLookAndFeels();
        for (int i = 0; i < info.length; i++) {
            JRadioButtonMenuItem item =
                    new JRadioButtonMenuItem(info[i].getName());
            item.addItemListener(new LAFChange(info[i].getClassName()));
            bg.add(item);
            laf.add(item);
        }
        JButton b = new JButton("Кнопка");
        add(b);
        UIManager.addPropertyChangeListener(
                new PropertyChangeListener() {
                    public void propertyChange(PropertyChangeEvent e) {
                        SwingUtilities.updateComponentTreeUI(getContentPane());
                    }
                });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChLAF();
    }

    class LAFChange implements ItemListener {
        private String className;

        public LAFChange(String className) {
            this.className = className;
        }

        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED)
                try {
                    UIManager.setLookAndFeel(className);
                } catch (Exception ex) {
                }
        }
    }
}

