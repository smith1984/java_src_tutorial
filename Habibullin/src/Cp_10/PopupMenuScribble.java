package Cp_10;

import java.awt.*;
import java.awt.event.*;
public class PopupMenuScribble extends Frame{
    public PopupMenuScribble(String s){
        super(s);
        ScrollPane pane = new ScrollPane();
        pane.setSize(300, 300);
        add(pane, BorderLayout.CENTER);
        Scribble_ scr = new Scribble_(this, 500, 500);
        pane.add(scr);
        addWindowListener(new WinClose());
        pack();
        setVisible(true);
    }
    class WinClose extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new PopupMenuScribble(" \"Рисовалка\" с всплывающим меню");
    }
}
class Scribble_ extends Component implements ActionListener{
    protected int lastX, lastY, w, h;
    protected Color currColor = Color.black;
    protected Frame f;
    protected PopupMenu c;
    public Scribble_(Frame frame, int width, int height){
        f = frame; w = width; h = height;
        enableEvents(AWTEvent.MOUSE_EVENT_MASK |
                AWTEvent.MOUSE_MOTION_EVENT_MASK);
        c = new PopupMenu("Цвет");
        add(c);
        MenuItem clear = new MenuItem("Очистить",
                new MenuShortcut(KeyEvent.VK_D));
        MenuItem red = new MenuItem("Красный");
        MenuItem green = new MenuItem("Зеленый");
        MenuItem blue = new MenuItem("Синий");
        MenuItem black = new MenuItem("Черный");
        c.add(red); c.add(green); c.add(blue); c.add(black);
        c.addSeparator(); c.add(clear);
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        black.addActionListener(this);
        clear.addActionListener(this);
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
    public void processMouseEvent(MouseEvent e){
        if (e.isPopupTrigger())
            c.show(e.getComponent(), e.getX(), e.getY());
        else if (e.getID() == MouseEvent.MOUSE_PRESSED){
            lastX = e.getX(); lastY = e.getY();
        }
        else super.processMouseEvent(e);
    }
    public void processMouseMotionEvent(MouseEvent e){
        if (e.getID() == MouseEvent.MOUSE_DRAGGED){
            Graphics g = getGraphics();
            g.setColor(currColor);
            g.drawLine(lastX, lastY, e.getX(), e.getY());
            lastX = e.getX(); lastY = e.getY();
        }
        else super.processMouseMotionEvent(e);
    }
}

