package Ch_4;

import javax.swing.*;
public class UsingWhile{
    public static void main(String[] args){
        // Граница суммы, индексные переменные и переменные для записи суммы:
        int count,i=1,j=1,s1=0,s2=0;
        // Считывание границы суммы:
        count=Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы"));
        // Текстовые переменные:
        String text="Сумма натуральных чисел от 1 до "+count+".\n";
        String str1="Оператор while: ";
        String str2="Оператор do-while: ";
        // Вычисление суммы оператором while:
        while(i<=count){
            s1+=i;
            i++;}
        // Вычисление суммы оператором do-while:
        do{
            s2+=j;
            j++;
        }while(j<=count);
        // Уточнение текста для сообщения:
        str1+=s1+"\n";
        str2+=s2;
        // Вывод окна сообщения на экран:
        JOptionPane.showMessageDialog(null,text+str1+str2);
    }
}
