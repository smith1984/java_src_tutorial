package Cp_13;

import java.awt.*;
import javax.swing.*;
public class SimpTable extends JFrame{
    SimpTable(){
        super(" My Table");
        setLayout(new FlowLayout());
        String[][] data = {{"-27", "32"}, {"-45", "55"}};
        String[] colNames = {"Вчера", "Сегодня"};
        JTable t1 = new JTable(data, colNames);
        add(new JScrollPane(t1));
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new SimpTable();
    }
}
