package Cp_16;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
interface BorderConstants{
    static public final int DEFAULT_POSITION = 0;
    static public final int ABOVE_TOP = 1;
    static public final int TOP = 2;
    static public final int BELOW_TOP = 3;
    static public final int ABOVE_BOTTOM = 4;
    static public final int BOTTOM = 5;
    static public final int BELOW_BOTTOM = 6;
    static public final int DEFAULT_JUSTIFICATION = 0;
    static public final int LEFT = 1;
    static public final int CENTER = 2;
    static public final int RIGHT = 3;
    static public final int LEADING = 4;
    static public final int TRAILING = 5;
    static public final int EDGE_SPACING = 2;
    static public final int TEXT_SPACING = 2;
    static public final int TEXT_INSET_H = 5;}
public class CompTitledTest extends JFrame
        implements BorderConstants{
    public CompTitledTest(){
        super(" Рамка с компонентом");
        JLabel lab = new JLabel(" PlaceBorder(JLabel) ",
                new ImageIcon("middle.gif"), JLabel.LEFT);
        PlaceBorderPane pbp =
                new PlaceBorderPane(new EtchedBorder(), lab, CENTER, TOP);
        add(pbp);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new CompTitledTest();
    }
}
class PlaceBorderPane extends JPanel implements BorderConstants{
    protected JComponent comp;
    protected JPanel p;
    protected PlaceBorder border;
    public PlaceBorderPane(){
        this(new JLabel("Заголовок"));
    }
    public PlaceBorderPane(JComponent c){
        this(null, c, LEFT, TOP);
    }
    public PlaceBorderPane(Border b, JComponent c, int just, int pos){
        super(); comp = c;
        border = new PlaceBorder(b, c, just, pos);
        setBorder(border);
        setLayout(null);
        add(comp);
        p = new JPanel();
        add(p);
    }
    public JPanel getContentPane(){
        return p;
    }
    public void doLayout(){
        Insets insets = getInsets();
        Rectangle r = getBounds();
        r.x = 0; r.y = 0;
        comp.setBounds(border.getComponentRect(r,insets));
        r.x += insets.left;
        r.y += insets.top;
        r.width -= insets.left + insets.right;
        r.height -= insets.top + insets.bottom;
        p.setBounds(r);
    }
    class PlaceBorder extends TitledBorder{
        public PlaceBorder(JComponent c){
            this(null, c, LEFT, TOP);
        }
        public PlaceBorder(Border b){
            this(b, null, LEFT, TOP);
        }
        public PlaceBorder(Border b, JComponent c){
            this(b, c, LEFT, TOP);
        }
        public PlaceBorder(Border b, JComponent c, int just, int pos){
            super(b, null, just, pos, null, null);
            if (b == null)
                border = super.getBorder();}
        public void paintBorder(Component c, Graphics g,
                                int x, int y, int width, int height){
            Rectangle r = new Rectangle(
                    x + EDGE_SPACING, y + EDGE_SPACING,
                    width - (EDGE_SPACING * 2), height - (EDGE_SPACING * 2));
            Insets bIns = (border != null) ?
                    border.getBorderInsets(c) : new Insets(0, 0, 0, 0);
            Rectangle rect = new Rectangle(x, y, width, height);
            Insets insets = getBorderInsets(c);
            Rectangle compR = getComponentRect(rect, insets);
            int diff;
            switch (titlePosition){
                case ABOVE_TOP:
                    diff = compR.height + TEXT_SPACING;
                    r.y += diff;
                    r.height -= diff;
                    break;
                case TOP:
                case DEFAULT_POSITION:
                    diff = insets.top/2 - bIns.top - EDGE_SPACING;
                    r.y += diff;
                    r.height -= diff;
                    break;
                case BELOW_TOP:
                case ABOVE_BOTTOM:
                    break;
                case BOTTOM:
                    diff = insets.bottom/2 - bIns.bottom - EDGE_SPACING;
                    r.height -= diff;
                    break;
                case BELOW_BOTTOM:
                    diff = compR.height + TEXT_SPACING;
                    r.height -= diff;
            }
            border.paintBorder(c, g, r.x, r.y, r.width, r.height);
            Color col = g.getColor();
            g.setColor(c.getBackground());
            g.fillRect(compR.x, compR.y, compR.width, compR.height);
            g.setColor(col);
            comp.repaint();
        }
        public Insets getBorderInsets(Component c, Insets insets){
            Insets bIns = (border != null) ?
                    border.getBorderInsets(c) : new Insets(0, 0, 0, 0);
            insets.top = EDGE_SPACING + TEXT_SPACING + bIns.top;
            insets.right = EDGE_SPACING + TEXT_SPACING + bIns.right;
            insets.bottom = EDGE_SPACING + TEXT_SPACING + bIns.bottom;
            insets.left = EDGE_SPACING + TEXT_SPACING + bIns.left;
            if (c == null || comp == null) return insets;
            int h = (comp != null) ? comp.getPreferredSize().height : 0;
            switch (titlePosition){
                case ABOVE_TOP:
                    insets.top += h + TEXT_SPACING;
                    break;
                case TOP:
                case DEFAULT_POSITION:
                    insets.top += Math.max(h, bIns.top) - bIns.top;
                    break;
                case BELOW_TOP:
                    insets.top += h + TEXT_SPACING;
                    break;
                case ABOVE_BOTTOM:
                    insets.bottom += h + TEXT_SPACING;
                    break;
                case BOTTOM:
                    insets.bottom += Math.max(h, bIns.bottom) - bIns.bottom;
                    break;
                case BELOW_BOTTOM:
                    insets.bottom += h + TEXT_SPACING;
            }
            return insets;
        }
        public Rectangle getComponentRect(Rectangle rect, Insets bIns){
            Dimension d = comp.getPreferredSize();
            Rectangle r = new Rectangle(0, 0, d.width, d.height);
            switch (titlePosition){
                case ABOVE_TOP:
                    r.y = EDGE_SPACING;
                    break;
                case TOP:
                case DEFAULT_POSITION:
                    r.y = EDGE_SPACING +
                            (bIns.top - EDGE_SPACING - TEXT_SPACING - d.height)/2;
                    break;
                case BELOW_TOP:
                    r.y = bIns.top - d.height - TEXT_SPACING;
                    break;
                case ABOVE_BOTTOM:
                    r.y = rect.height - bIns.bottom + TEXT_SPACING;
                    break;
                case BOTTOM:
                    r.y = rect.height - bIns.bottom + TEXT_SPACING +
                        (bIns.bottom - EDGE_SPACING - TEXT_SPACING - d.height)/2;
                    break;
                case BELOW_BOTTOM:
                    r.y = rect.height - d.height - EDGE_SPACING;
            }
            switch (titleJustification) {
                case LEFT:
                case DEFAULT_JUSTIFICATION:
                    r.x = TEXT_INSET_H + bIns.left;
                    break;
                case RIGHT:
                    r.x = rect.width - bIns.right -TEXT_INSET_H - r.width;
                    break;
                case CENTER:
                    r.x = (rect.width - r.width) / 2;
            }
            return r;
        }
    }}