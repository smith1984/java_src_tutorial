package Ch_6;

import javax.swing.*;
// Описание класса:
class MyClass{
    int num;
    char symb;
    String text;
}
// Главный класс программы:
public class ClassDemo{
    public static void main(String[] args){
        MyClass obj=new MyClass();
// Заполнение полей объекта:
        obj.num=12;
        obj.symb='A';
        obj.text="Текстовое поле";
// Текст для отображения в окне сообщения:
        String str="Значения полей объекта:\n";
        str+="num="+obj.num+"\n";
        str+="symb="+obj.symb+"\n";
        str+="text="+obj.text;
// Отображение окна:
        JOptionPane.showMessageDialog(null,str);}
}
