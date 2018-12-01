package Cp_17;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.*;
public class PropCh extends JFrame {
    PropCh() {
        super(" Смена размера шрифта");
        setLayout(new FlowLayout());
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu serv = new JMenu("Сервис");
        mb.add(serv);
        JMenu laf = new JMenu("Размер шрифта");
        serv.add(laf);
        ButtonGroup bg = new ButtonGroup();
        FontChange fch = new FontChange();
        for (int i = 10; i < 22; i += 2) {
            JRadioButtonMenuItem item = new JRadioButtonMenuItem("" + i);
            item.addItemListener(fch);
            bg.add(item);
            laf.add(item);
        }
        JTextArea ta = new JTextArea(5, 20);
        JTextField tf = new JTextField(20);
        JPasswordField pf = new JPasswordField(20);
        add(ta);
        add(tf);
        add(pf);
        PropertyChangeListener pcl =
                new PropertyChangeListener() {
                    public void propertyChange(PropertyChangeEvent e) {
                        SwingUtilities.updateComponentTreeUI(getContentPane());
                    }
                };
        UIManager.addPropertyChangeListener(pcl);
        UIManager.getDefaults().addPropertyChangeListener(pcl);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PropCh();
    }

    class FontChange implements ItemListener {
        public FontChange() {
        }

        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                JMenuItem mi = (JMenuItem) e.getSource();
                int n = Integer.parseInt(mi.getText());
                Font f = UIManager.getFont("TextArea.font");
                String name = f.getName();
                int style = f.getStyle();
                FontUIResource fr = new FontUIResource(name, style, n);
                UIManager.put("TextArea.font", fr);
// UIManager.put("TextField.font", fr);
// UIManager.put("PasswordField.font", fr);
                UIManager.put("EditorPane.font", fr);
                UIManager.put("TextPane.font", fr);
                UIManager.put("FormattedTextField.font", fr);
            }
        }
    }
}

