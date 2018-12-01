package Ch_5;

import javax.swing.*;
public class SimpleArray{
    public static void main(String[] args){
// Индексная переменная и размер массива:
        int i,size;
// Текст для отображения:
        String text="Массив из нечетных чисел:\n";
// Ввод размера массива:
        size=Integer.parseInt(JOptionPane.showInputDialog("Укажите размер массива:"));
// Создание массива:
        int[] nums=new int[size];
// Заполнение массива и формирование текста для вывода:
        for(i=0;i<size;i++){
            nums[i]=2*i+1;
            text+=nums[i]+"  ";
        }
// Вывод окна сообщения:
        JOptionPane.showMessageDialog(null,text);
    }
}
