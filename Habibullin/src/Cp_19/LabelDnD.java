package Cp_19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LabelDnD extends JFrame{
    public LabelDnD(){
        super(" Перенос текста в надпись JLabel");
        JTextField tf = new JTextField(100);
        tf.setDragEnabled(true);
        JLabel tl = new JLabel("Перетащи сюда", JLabel.LEFT);
        tl.setTransferHandler(new TransferHandler("text"));
        tl.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JComponent c = (JComponent)e.getSource();
                TransferHandler th = c.getTransferHandler();
                th.exportAsDrag(c, e, TransferHandler.COPY);
            }
        });
        getContentPane().add(tf, BorderLayout.NORTH);
        getContentPane().add(tl);
        tl.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 100);
        setVisible(true);
    }
    public static void main(String[] args){
        new LabelDnD();
    }
}