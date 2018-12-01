package Cp_13;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.util.*;
public class MultiLineTable extends JFrame{
    MultiLineTable(int lineCount){
        super(" Таблица с многострочными ячейками");
// Расширяем модель ячеек, переопределяя метод,
// возвращающий класс содержимого столбца
        DefaultTableModel tm = new DefaultTableModel(){
            public Class getColumnClass(int col){
                return getValueAt(0, col).getClass();
            }
        };
// Заносим в модель ячеек данные
        tm.setDataVector(
                new Object[][]{
                        {"Имя\nФамилия","Иван\nПетров","Петр\nИванов"},
                        {"Отдел\nДолжность","Сбыт\nВодитель","Сбыт\nЭкспедитор"}
                },
                new Object[]{"Данные","1","2"}
        );
// Создаем таблицу с новой моделью ячеек
        JTable t = new JTable(tm);
// Изменяем высоту ячеек на экране, чтобы поместились
// все строки содержимого ячейки
        t.setRowHeight( t.getRowHeight() * lineCount);
// Устанавливаем новый класс-рисовальщик
        t.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        add(new JScrollPane(t));
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new MultiLineTable(2);
    }
}
// Класс-рисовальщик
class MultiLineCellRenderer extends JTextArea
        implements TableCellRenderer{
    public MultiLineCellRenderer(){
        setLineWrap(true);
        setWrapStyleWord(true);
        setOpaque(true);
    }
    public Component getTableCellRendererComponent(
            JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int col){
        if (isSelected){
            setForeground(table.getSelectionForeground());
            setBackground(table.getSelectionBackground());
        }else{
            setForeground(table.getForeground());
            setBackground(table.getBackground());
        }
        if (hasFocus){
            setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
            if (table.isCellEditable(row, col)){
                setForeground(UIManager.getColor("Table.focusCellForeground"));
                setBackground( UIManager.getColor("Table.focusCellBackground"));
            }
        }else setBorder(new EmptyBorder(1, 2, 1, 2));
        setFont(table.getFont());
        setText((value == null) ? "" : value.toString());
        return this;
    }
}