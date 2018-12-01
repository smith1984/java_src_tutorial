package Cp_10;

import java.awt.*;
import java.awt.event.*;
public class MenuScribble extends Frame{
    public MenuScribble(String s){
        super(s);
        ScrollPane pane = new ScrollPane();
        pane.setSize(300, 300);
        add(pane, BorderLayout.CENTER);
        Scribble scr = new Scribble(this, 500, 500);
        pane.add(scr);
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu f = new Menu("Файл");
        Menu v = new Menu("Вид");
        mb.add(f); mb.add(v);
        MenuItem open = new MenuItem("Открыть...",
                new MenuShortcut(KeyEvent.VK_O));
        MenuItem save = new MenuItem("Сохранить",
                new MenuShortcut(KeyEvent.VK_S));
        MenuItem saveAs = new MenuItem("Сохранить как...");
        MenuItem exit = new MenuItem("Выход",
                new MenuShortcut(KeyEvent.VK_Q));
        f.add(open); f.add(save); f.add(saveAs);
        f.addSeparator(); f.add(exit);
        open.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
            FileDialog fd = new FileDialog(new Frame(),
                    " Загрузить", FileDialog.LOAD);
            fd.setVisible(true);
        }
        });
        saveAs.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                FileDialog fd = new FileDialog(new Frame(),
                        " Сохранить", FileDialog.SAVE);
                fd.setVisible(true);
            }
        });
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        Menu c = new Menu("Цвет");
        MenuItem clear = new MenuItem("Очистить",
                new MenuShortcut(KeyEvent.VK_D));
        v.add(c); v.add(clear);
        MenuItem red = new MenuItem("Красный");
        MenuItem green = new MenuItem("Зеленый");
        MenuItem blue = new MenuItem("Синий");
        MenuItem black = new MenuItem("Черный");
        c.add(red); c.add(green); c.add(blue); c.add(black);
        red.addActionListener(scr);
        green.addActionListener(scr);
        blue.addActionListener(scr);
        black.addActionListener(scr);
        clear.addActionListener(scr);
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
        new MenuScribble(" \"Рисовалка\" с меню");
    }
}
class Scribble extends Component implements
        ActionListener, MouseListener, MouseMotionListener{
    protected int lastX, lastY, w, h;
    protected Color currColor = Color.black;
    protected Frame f;
    public Scribble(Frame frame, int width, int height){
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

