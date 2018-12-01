package Ch_13;

import javax.swing.*;
import  java.awt.*;

public class Panel1 {
    public static void main (String[] args){
        Panel1 gui = new Panel1();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("shok me");
        JButton button1 = new JButton("bliss");
        panel.add(button);
        panel.add(button1);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200, 200);
        frame.setVisible(true);

    }
}
