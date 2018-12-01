package Ch_09;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class SimpleFrame extends JFrame {
    SimpleFrame(){
        setTitle("Не щелкайте по кнопке");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new JButton("Щелкните на мне!"));
        setSize(300, 100);
        setVisible(true);
    }
}
