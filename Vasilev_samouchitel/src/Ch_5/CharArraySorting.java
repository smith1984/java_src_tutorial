package Ch_5;

import javax.swing.*;
public class CharArraySorting{
    public static void main(String[] args) {
        // Текст для окна сообщения:
        String text="Исходный массив:\n";
        // Размер массива и индексные переменные:
        int size,i,j;
        // Получение размера массива:
        size=Integer.parseInt(JOptionPane.showInputDialog("Размер массива:"));
        // Создание символьного массива:
        char[] symbs=new char[size];
        // Начальная буква:
        char s='a';
        // Заполнение массива (случайным образом):
        for(i=0;i<size;i++){
            symbs[i]=(char)(s+(byte)(Math.random()*26));
            text+=symbs[i]+"  ";}
        text+="\nПосле сортировки:\n";
        // Сортировка массива:
        for(i=0;i<size;i++){
            for(j=0;j<size-i-1;j++){
                if(symbs[j]>symbs[j+1]){
                    s=symbs[j+1];
                    symbs[j+1]=symbs[j];
                    symbs[j]=s;}}
        }
        // Запись в текстовую переменную элементов массива после сортировки:
        for(i=0;i<size;i++){
            text+=symbs[i]+"  ";}
        // Отображение окна сообщения:
        JOptionPane.showMessageDialog(null,text);
    }
}
