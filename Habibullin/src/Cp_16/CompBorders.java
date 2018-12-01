package Cp_16;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class CompBorders extends JFrame{
    CompBorders(){
        super(" Сдвоенные рамки");
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel(
                " CompoundBorder(TitledBorder, TitledBorder) ");
        l1.setBorder(new CompoundBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createEtchedBorder(), "Заголовок",
                        TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
                        new Font("Times New Roman", Font.ITALIC|Font.BOLD, 20)),
                BorderFactory.createTitledBorder(
                        BorderFactory.createEtchedBorder(), "Подпись",
                        TitledBorder.RIGHT, TitledBorder.BOTTOM,
                        new Font("Times New Roman", Font.ITALIC, 12),
                        Color.red)
        ));
        JLabel l2 = new JLabel(
                " CompoundBorder(BevelBorder.RAISED, BevelBorder.RAISED) ");
        l2.setBorder(new CompoundBorder(
                BorderFactory.createBevelBorder(BevelBorder.RAISED),
                BorderFactory.createBevelBorder(BevelBorder.RAISED)
        ));
        JLabel l3 = new JLabel(
                " CompoundBorder(BevelBorder.RAISED, BevelBorder.LOWERED) ");
        l3.setBorder(new CompoundBorder(
                BorderFactory.createBevelBorder(BevelBorder.RAISED),
                BorderFactory.createBevelBorder(BevelBorder.LOWERED)
        ));
        add(l1); add(l2); add(l3);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new CompBorders();
    }
}
