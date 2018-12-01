package Ch_6;

import javax.swing.*;
// Описание класса:
class MyClass3{
    int num;
    char symb;
    String text;
    // Метод класса для отображения сообщения:
    void showText(){
// Локальная текстовая переменная:
        String str="Значения полей объекта:\n";
// Формирование результата (значения локальной переменной):
        str+="num="+num+"\n";
        str+="symb="+symb+"\n";
        str+="text="+text;
// Метод отображает окно сообщения:
        JOptionPane.showMessageDialog(null,str);}
    // Метод класса для присваивания значений полям:
    void set(int n,char s,String str){
// Заполнение полей:
        num=n;
        symb=s;
        text=str;}
}
// Главный класс программы:
public class ClassDemo3{
    public static void main(String[] args){
// Создание объектов:
        MyClass3 obj1=new MyClass3();
        MyClass3 obj2=new MyClass3();
// Заполнение полей объектов:
        obj1.set(10,'A',"Всем привет!");
        obj2.set(200,'b',"Еще раз, привет!");
// Отображение окон:
        obj1.showText();
        obj2.showText();}
}
