package Cp_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ScribbleTest extends JFrame{
    public ScribbleTest(String s){
        super(s);
        Scribble scr = new Scribble(this, 500, 500);
        JScrollPane pane = new JScrollPane(scr);
        pane.setSize(300, 300);
        add(pane, BorderLayout.CENTER);
        JPanel p = new JPanel();
        add(p, BorderLayout.SOUTH);
        JButton b1 = new JButton("Красный"); p.add(b1);
        b1.addActionListener(scr);
        JButton b2 = new JButton("Зеленый"); p.add(b2);
        b2.addActionListener(scr);
        JButton b3 = new JButton("Синий"); p.add(b3);
        b3.addActionListener(scr);
        JButton b4 = new JButton("Черный"); p.add(b4);
        b4.addActionListener(scr);
        JButton b5 = new JButton("Очистить"); p.add(b5);
        b5.addActionListener(scr);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    public static void main(String[] args){
        new ScribbleTest(" \"Рисовалка\"");
    }}
class Scribble extends JPanel implements
        ActionListener, MouseListener, MouseMotionListener{
    protected int lastX, lastY, w, h;
    protected Color currColor = Color.black;
    protected JFrame f;
    public Scribble(JFrame frame, int width, int height){
        f = frame; w = width; h = height;
        enableEvents(AWTEvent.MOUSE_EVENT_MASK |
                AWTEvent.MOUSE_MOTION_EVENT_MASK);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public Dimension getPreferredSize(){
        return new Dimension(w, h);
    }
    public void actionPerformed(ActionEvent event){
    String s = event.getActionCommand();
if (s.equals("Очистить")) repaint();
else if (s.equals("Красный")) currColor = Color.red;
else if (s.equals("Зеленый")) currColor = Color.green;
else if (s.equals("Синий")) currColor = Color.blue;
else if (s.equals("Черный")) currColor = Color.black;
}
    public void mousePressed(MouseEvent e){
        if ((e.getModifiers() & MouseEvent.BUTTON1_MASK) == 0) return;
        lastX = e.getX(); lastY = e.getY();
    }
    public void mouseDragged(MouseEvent e){
        if ((e.getModifiers() & MouseEvent.BUTTON1_MASK) == 0) return;
        Graphics g = getGraphics();
        g.setColor(currColor);
        g.drawLine(lastX, lastY, e.getX(), e.getY());
        lastX = e.getX(); lastY = e.getY();
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
}