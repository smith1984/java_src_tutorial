package Ch_15;

import java.awt.*;
import javax.swing.*;
public class AppletWithParams extends JApplet{
    public void init(){
        // HTML-текст для метки (начальное значение):
        String text="<html>Используется шрифт размера ";
        // Размер шрифта - считывание параметра из html-документа:
        int size=Integer.parseInt(getParameter("size"));
        // Создание объекта шрифта:
        Font fnt=new Font("Arial",Font.BOLD,size);
        // Изменение текста метки:
        text+=size+".<br>";
        // Объектная переменная для цвета фона:
        Color clr;
        // Цвет фона - считывание параметра из html-документа:
        String clrName=getParameter("color");
        // Определение цвета:
        if(clrName.equalsIgnoreCase("синий")) clr=Color.BLUE;
        else if(clrName.equalsIgnoreCase("красный")) clr=Color.RED;
        else if(clrName.equalsIgnoreCase("желтый")) clr=Color.YELLOW;
        else if(clrName.equalsIgnoreCase("зеленый")) clr=Color.GREEN;
        else clr=Color.GRAY;
        // Применение цвета:
        getContentPane().setBackground(clr);
        // Изменение текста метки:
        text+="Цвет фона: "+clrName.toLowerCase()+".</html>";
        // Создание метки:
        JLabel lb=new JLabel(text,JLabel.CENTER);
        // Применение шрифта для метки:
        lb.setFont(fnt);
        // Добавление метки на панель апплета:
        add(lb);}
}