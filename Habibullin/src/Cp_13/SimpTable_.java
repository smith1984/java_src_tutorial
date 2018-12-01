package Cp_13;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class SimpTable_ extends JFrame{
    SimpTable_(){
        super(" Таблица с неизменяемым первым столбцом");
        setLayout(new FlowLayout());
        JTable t1 = new JTable(new FirstColumnTableModel());
        add(new JScrollPane(t1));
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new SimpTable_();
    }
}
class FirstColumnTableModel extends AbstractTableModel{
    protected Object[][] data = {
            {"Текст", Color.black, new Boolean(true)},
            {"Фон", new Color(130, 56, 187), new Boolean(true)},
            {"Рамка", new Color(200, 45, 125), new Boolean(false)},
    };
    protected String[] colNames = {"Элемент", "Цвет", "Выбрать"};
    public FirstColumnTableModel(){ super(); }
    // Определяем обязательные методы
    public int getRowCount(){ return data.length; }
    public int getColumnCount(){ return data[0].length; }
    public Object getValueAt(int row, int col){ return data[row][col]; }
    // Запрещаем заполнять ячейки первого столбца
    public void setValueAt(Object value, int row, int col){
        if (col != 0) data[row][col] = value;
    }
    // Сообщаем, что первый столбец нельзя редактировать
    public boolean isCellEditable(int row, int col){
        return col != 0;
    }
    // Для визуализации содержимого ячеек графическим
// компонентом определяем класс ячеек столбца
    public Class getColumnClass(int col){
        return data[0][col].getClass();
    }
    // Для показа имен в строке заголовков
    public String getColumnName(int col){
        return colNames[col];
    }
}