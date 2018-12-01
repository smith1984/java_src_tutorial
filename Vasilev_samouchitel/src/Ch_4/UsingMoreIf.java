package Ch_4;

import javax.swing.*;
public class UsingMoreIf{
    public static void main(String[] args){
        // Текстовые переменные для считывания ввода пользователя
        // и записи текста, выводимого в диалоговом окне:
        String text,str;
        // Считывание текста (числа), введенного пользователем:
        text=JOptionPane.showInputDialog("Введите целое число:");
        // Проверка корректности ввода:
        if(text==null){System.exit(0);}
        // Определение числа (преобразование текста в число):
        int num=Integer.parseInt(text);
        // Вложенные условные операторы:
        if(num<0){str="Вы ввели отрицательное число!";}
        else if(num>100){str="Это очень большое число!";}
        else if(num>10){str="Число, большее десяти!";}
        else{str="Число в пределах от 0 до 10!";}
        // Отображение диалогового окна:
        JOptionPane.showMessageDialog(null,str);
    }
}