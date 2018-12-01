package Cp_13;

import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.util.*;
public class FileTable extends JFrame{
    public FileTable(File dir){
        super(" Таблица файлов");
        JTable table = new JTable(new FileTableModel(dir));
        add(new JScrollPane(table));
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        File dir = args.length > 0 ? new File(args[0]) :
                new File(System.getProperty("user.home"));
        new FileTable(dir);
    }
}
class FileTableModel extends DefaultTableModel{
    protected File dir;
    protected String[] fName;
    protected String[] colName = new String[]{
            "Имя", "Размер", "Дата и время",
            "Каталог", "Для чтения", "Для записи"
    };
    protected Class[] colClass = new Class[]{
            String.class, Long.class, Date.class,
            Boolean.class, Boolean.class, Boolean.class
    };
    public FileTableModel(File dir){
        super(dir.list().length, 6);
        this.dir = dir;
        fName = dir.list();
    }
    public String getColumnName(int col){ return colName[col]; }
    public Class getColumnClass(int col){ return colClass[col]; }
    public Object getValueAt(int row, int col){
        File f = new File(dir, fName[row]);
        switch(col){
            case 0: return fName[row];
            case 1: return new Long(f.length());
            case 2: return new Date(f.lastModified());
            case 3: return f.isDirectory() ?
                    Boolean.TRUE : Boolean.FALSE;
            case 4: return f.canRead() ?
                    Boolean.TRUE : Boolean.FALSE;
            case 5: return f.canWrite() ?
                    Boolean.TRUE : Boolean.FALSE;
            default: return null;
        }
    }
}