package Cp_13;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.*;
public class HeadTable extends JFrame{
    HeadTable(){
        super(" Сотрудники");
        Vector data = new Vector();
        Vector row = new Vector();
        row.addElement("Иванов");
        row.addElement(new Integer(1970));
        row.addElement(new Boolean(false));
        data.addElement(row);
        row = new Vector();
        row.addElement("Петров");
        row.addElement(new Integer(1980));
        row.addElement(new Boolean(true));
        data.addElement(row);
        Vector col = new Vector();
        col.addElement("Фамилия");
        col.addElement("Год рождения");
        col.addElement("Семейное положение");
        JTable t2 = new JTable(data, col);
        JTableHeader th = t2.getTableHeader();
        add(th, BorderLayout.NORTH);
        add(t2, BorderLayout.CENTER);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new HeadTable();
    }
}