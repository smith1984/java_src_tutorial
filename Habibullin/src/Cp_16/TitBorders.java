package Cp_16;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class TitBorders extends JFrame{
    TitBorders(){
        super(" Рамки с надписями");
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel(" TitledBorder(String) ");
        l1.setBorder(new TitledBorder("Надпись"));
        JLabel l2 = new JLabel(
                " TitledBorder(new EtchedBorder(),\"Надпись\") ");
        l2.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Надпись"));
        JLabel l3 = new JLabel(
                "<html> Расположение CENTER," +
                        " ABOVE_TOP<p>Шрифт ITALIC, 18 ");
        l3.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Надпись",
                TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
                new Font("Times New Roman", Font.ITALIC, 18)));
        JLabel l4 =
                new JLabel(" Расположение RIGHT, BELOW_TOP ");
        l4.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Надпись",
                TitledBorder.RIGHT, TitledBorder.BELOW_TOP,
                new Font("Times New Roman", Font.ITALIC, 18),
                Color.red ));
        JLabel l5 =
                new JLabel(" Расположение CENTER, BOTTOM ");
        l5.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Подпись",
                TitledBorder.CENTER, TitledBorder.BOTTOM,
                new Font("Times New Roman", Font.ITALIC, 18),
                Color.red ));
        add(l1); add(l2); add(l3); add(l4); add(l5);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new TitBorders();
    }
}
