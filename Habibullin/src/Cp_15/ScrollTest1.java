package Cp_15;

import java.awt.*;
import java.awt.event.*;
class ScrollTest1 extends Frame{
    private Scrollbar
            sbRed = new Scrollbar(Scrollbar.VERTICAL, 127, 16, 0, 271),
            sbGreen = new Scrollbar(Scrollbar.VERTICAL, 127, 16, 0, 271),
            sbBlue = new Scrollbar(Scrollbar.VERTICAL, 127, 16, 0, 271);
    private Color c = new Color(127, 127, 127);
    private Label lm = new Label();
    private Button
            b1 = new Button("Применить"),
            b2 = new Button("Отменить");
    ScrollTest1(String s){
        super(s);
        setLayout(null);
        setFont(new Font("Serif", Font.BOLD, 15));
        Panel p = new Panel();
        p.setLayout(null);
        p.setBounds(10,50, 150, 260); add(p);
        Label lc = new Label("Подберите цвет");
        lc.setBounds(20, 0, 120, 30); p.add(lc);
        Label lmin = new Label("0", Label.RIGHT);
        lmin.setBounds(0, 30, 30, 30); p.add(lmin);
        Label lmiddle = new Label("127", Label.RIGHT);
        lmiddle.setBounds(0, 120, 30, 30); p.add(lmiddle);
        Label lmax = new Label("255", Label.RIGHT);
        lmax.setBounds(0, 200, 30, 30); p.add(lmax);
        sbRed.setBackground(Color.red);
        sbRed.setBounds(40, 30, 20, 200); p.add(sbRed);
        sbRed.addAdjustmentListener(new ChColor());
        sbGreen.setBackground(Color.green);
        sbGreen.setBounds(70, 30, 20, 200); p.add(sbGreen);
        sbGreen.addAdjustmentListener(new ChColor());
        sbBlue.setBackground(Color.blue);
        sbBlue.setBounds(100, 30, 20, 200); p.add(sbBlue);
        sbBlue.addAdjustmentListener(new ChColor());
        Label lp = new Label("Образец:");
        lp.setBounds(250, 50, 120, 30); add(lp);
        lm.setBackground(new Color(127, 127, 127));
        lm.setBounds(220, 80, 120, 80); add(lm);
        b1.setBounds(240, 200, 100, 30); add(b1);
        b1.addActionListener(new ApplyColor());
        b2.setBounds(240, 240, 100, 30); add(b2);
        b2.addActionListener(new CancelColor());
        setSize(400, 300);
        setVisible(true);
    }
    class ChColor implements AdjustmentListener{
        public void adjustmentValueChanged(AdjustmentEvent e){
            int red = c.getRed(), green = c.getGreen(), blue = c.getBlue();
            if (e.getAdjustable() == sbRed) red = e.getValue();
            else if (e.getAdjustable() == sbGreen) green = e.getValue();
            else if (e.getAdjustable() == sbBlue) blue = e.getValue();
            c = new Color(red, green, blue);
            lm.setBackground(c);
        }
    }
    class ApplyColor implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            setBackground(c);
        }
    }
    class CancelColor implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            c = new Color(127, 127, 127);
            sbRed.setValue(127);
            sbGreen.setValue(127);
            sbBlue.setValue(127);
            lm.setBackground(c);
            setBackground(Color.white);
        }
    }
    public static void main(String[] args){
        Frame f = new ScrollTest1(" Выбор цвета");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
}