package Cp_13;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
public class RowEd extends JFrame{
    public RowEd(){
        super(" Редактор строки");
        DefaultTableModel dm = new DefaultTableModel();
        dm.setDataVector(
                new Object[][]{{"Имя", "Иван"},{"Фамилия", "Петров"},
                        {"Пол", "Мужской"}},
                new Object[]{"Сотрудник", "Сведения"});
        JTable table = new JTable(dm);
        JComboBox cb = new JComboBox();
        cb.addItem("Мужской");
        cb.addItem("Женский");
        RowEditor rowEd = new RowEditor(table);
        rowEd.setEditorAt(2, new DefaultCellEditor(cb));
        table.getColumn("Сведения").setCellEditor(rowEd);
        add(new JScrollPane(table));
        setSize(400, 100);
        setVisible(true);
    }
    public static void main(String[] args){
        new RowEd();
    }
}
class RowEditor implements TableCellEditor{
protected Hashtable editors;
protected TableCellEditor editor, defEditor;
        JTable table;
public RowEditor(JTable table){
        this.table = table;
        editors = new Hashtable();
        defEditor = new DefaultCellEditor(new JTextField());
        }
public void setEditorAt(int row, TableCellEditor editor){
        editors.put(new Integer(row), editor);
        }
public Component getTableCellEditorComponent(JTable table,
        Object value, boolean isSelected, int row, int column){
        return editor.getTableCellEditorComponent(table,
        value, isSelected, row, column);
        }
public Object getCellEditorValue(){
        return editor.getCellEditorValue();
        }
public boolean stopCellEditing(){
        return editor.stopCellEditing();
        }
    public void cancelCellEditing(){
        editor.cancelCellEditing();
    }
    public boolean isCellEditable(EventObject anEvent){
        selectEditor((MouseEvent)anEvent);
        return editor.isCellEditable(anEvent);
    }
    public void addCellEditorListener(CellEditorListener l){
        editor.addCellEditorListener(l);
    }
    public void removeCellEditorListener(CellEditorListener l){
        editor.removeCellEditorListener(l);
    }
    public boolean shouldSelectCell(EventObject anEvent){
        selectEditor((MouseEvent)anEvent);
        return editor.shouldSelectCell(anEvent);
    }
    protected void selectEditor(MouseEvent e){
        int row = (e == null) ?
                table.getSelectionModel().getAnchorSelectionIndex() :
                table.rowAtPoint(e.getPoint());
        editor = (TableCellEditor)editors.get(new Integer(row));
        if (editor == null) editor = defEditor;
    }
}
