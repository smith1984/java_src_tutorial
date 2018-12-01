package Cp_17;

import java.awt.*;
import javax.swing.*;
public class DiffLAF extends JFrame {
    DiffLAF() {
        super(" Окно с разными L&F");
        setLayout(new FlowLayout());
        JInternalFrame ifr1 =
                new JInternalFrame(" Oкно Metal", true, true, true, true);
        ifr1.getContentPane().add(new JLabel(" Это окно Java L&F"));
        ifr1.setPreferredSize(new Dimension(200, 100));
        ifr1.setVisible(true);
        add(ifr1);
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
            JInternalFrame ifr2 =
                    new JInternalFrame(" Oкно Windows", true, true, true, true);
            ifr2.getContentPane().add(
                    new JLabel("<html>Это окно Windows L&F<p>Тема Classic"));
            ifr2.setPreferredSize(new Dimension(200, 100));
            ifr2.setVisible(true);
            add(ifr2);
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (Exception e) {
        }
        JInternalFrame ifr3 =
                new JInternalFrame(" Oкно CDE/Motif", true, true, true, true);
        ifr3.getContentPane().add(
                new JLabel("Это окно Solaris CDE L&F"));
        ifr3.setPreferredSize(new Dimension(200, 100));
        ifr3.setVisible(true);
        add(ifr3);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DiffLAF();
    }
}
