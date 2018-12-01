package Ch_4;

import javax.swing.*;
public class UsingFor{
    public static void main(String[] args){
        // Граница суммы, индексная переменная и переменная для записи суммы:
        int count,i,s=0;
        // Считывание границы суммы:
        count=Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы"));
        // Текстовая переменная:
        String text="Сумма натуральных чисел от 1 до "+count+": ";
        // Вычисление суммы оператором for:
        for(i=1;i<=count;i++){
            s+=i;}
        // Вывод окна сообщения на экран:
        JOptionPane.showMessageDialog(null,text+s);
    }
}
