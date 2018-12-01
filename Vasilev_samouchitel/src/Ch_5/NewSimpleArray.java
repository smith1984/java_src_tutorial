package Ch_5;

import javax.swing.*;
public class NewSimpleArray{
    public static void main(String[] args){
// Размеры массива:
        int n,m;
// Текст для отображения в окне:
        String text="Двумерный массив случайных чисел:";
// Считывание размеров массива:
        n=Integer.parseInt(JOptionPane.showInputDialog("Строк в массиве:"));
        m=Integer.parseInt(JOptionPane.showInputDialog("Столбцов в массиве:"));
// Создание массива:
        int[][] nums=new int[n][m];
// Заполнение массива случайными числами:
        for(int i=0;i<n;i++){
            text+="\n";
            for(int j=0;j<m;j++){
                nums[i][j]=(int)(10*Math.random());
                text+=nums[i][j]+"   ";}
        }
// Вывод окна сообщения с элементами массива:
        JOptionPane.showMessageDialog(null,text);}
}