package Ch_6;

import javax.swing.*;
// Описание класса:
class MyClass4{
    int num;
    char symb;
    String text;
    // Конструктор класса с тремя аргументами:
    MyClass4(int n,char s,String str){
// Заполнение полей:
        set(n,s,str);
// Отображение сообщения с информацией об объекте:
        showText();
    }
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
public class ClassDemo4{
    public static void main(String[] args){
// Создание объекта с передачей аргументов конструктору:
        MyClass4 obj=new MyClass4(15,'Ы',"Просто текст.");}
}
