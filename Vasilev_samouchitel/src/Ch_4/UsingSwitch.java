package Ch_4;

import javax.swing.*;
public class UsingSwitch{
    public static void main(String[] args){
        // Вводимое пользователем число:
        int num;
        // Текст из поля ввода и текст сообщения:
        String text,str;
        // Отображение окна и считывание текста:
        text=JOptionPane.showInputDialog("Введите целое число от 0 до 10:");
        // Преобразование текста в число:
        num=Integer.parseInt(text);
        // Оператор выбора:
        switch(num){
            case 0:
                str="Вы ввели нулевое значение!";
                break;
            case 1:
                str="Вы ввели единичное значение!";
                break;
            case 2:
            case 3:
            case 5:
            case 7:
                str="Вы ввели простое число!";
                break;
            case 4:
            case 6:
            case 8:
            case 10:
                str="Вы ввели четное число!";
                break;
            default:
                str="Вы ввели число 9 или\nвыходящее за пределы диапазона!";
        }
        JOptionPane.showMessageDialog(null,str);
    }
}
