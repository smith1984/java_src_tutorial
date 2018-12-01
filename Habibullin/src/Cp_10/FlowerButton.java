package Cp_10;

import java.awt.*;
import java.awt.event.*;
class FlowerButton extends Canvas implements MouseListener{
    private boolean isDown=false;
    public FlowerButton(){
        super();
        setBackground(Color.lightGray);
        addMouseListener(this);
    }
    public void drawFlower(Graphics g, int x, int y, int w, int h){
        g.drawOval(x + 2*w/5 - 6, y, w/5, w/5);
        g.drawLine(x + w/2 - 6, y + w/5, x + w/2 - 6, y + h - 4);
        g.drawOval(x + 3*w/10 - 6, y + h/3 - 4, w/5, w/5);
        g.drawOval(x + w/2 - 6, y + h/3 - 4, w/5, w/5);
    }
    public void paint(Graphics g){
        int w = getSize().width, h = getSize().height;
        if (isDown){
            g.drawLine(0, 0, w - 1, 0);
            g.drawLine(1, 1, w - 1, 1);
            g.drawLine(0, 0, 0, h - 1);
            g.drawLine(1, 1, 1, h - 1);
            drawFlower(g, 8, 10, w, h);
        }else{
            g.drawLine(0, h - 2, w - 2, h - 2);
            g.drawLine(1, h - 1, w - 1, h - 1);
            g.drawLine(w - 2, h - 2, w - 2, 0);
            g.drawLine(w - 1, h - 1, w - 1, 1);
            drawFlower(g, 6, 8, w, h);
        }
    }
    public void mousePressed(MouseEvent e){
        isDown=true;
        repaint();
    }
    public void mouseReleased(MouseEvent e){
        isDown=false;
        repaint();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e){}
}
class DrawButton extends Frame{
    DrawButton(String s){
        super(s);
        setLayout(null);
        Button b = new Button("OK");
        b.setBounds(200, 50, 100, 60); add(b);
        FlowerButton d = new FlowerButton();
        d.setBounds(50, 50, 100, 60); add(d);
        setSize(400, 150);
        setVisible(true);
    }
    public static void main(String[] args){
        Frame f = new DrawButton(" Кнопка с рисунком");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
}
