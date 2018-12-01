package Ch_12;

// Подключение пакетов:
import java.awt.*;
import java.applet.*;
// Класс апплета:
public class ShowText extends Applet{
    // Отображаемый текст:
    String text;
    // Метод для определения цвета:
    private Color getColor(String color){
        Color clr;
        if(color.equals("желтый")) clr=Color.YELLOW;
        else if(color.equals("синий")) clr=Color.BLUE;
        else if(color.equals("красный")) clr=Color.RED;
        else clr=Color.WHITE;
        return clr;
    }
    // Метод инициализации апплета:
    public void init(){
// Считывание цвета фона:
        String color=getParameter("цвет");
// Применение цвета фона:
        setBackground(getColor(color));
// Считывание цвета для отображения текста:
        color=getParameter("цвет шрифта");
// Применение цвета для отображения текста:
        setForeground(getColor(color));
// Считывание названия шрифта:
        String font=getParameter("шрифт");
// Считывание стиля шрифта (текстовое название):
        String style=getParameter("стиль");
// Стиль шрифта:
        int stl;
// Преобразование такстового значения для стиля в числовое:
        if(style.equals("жирный")) stl=Font.BOLD;
        else if(style.equals("курсив")) stl=Font.ITALIC;
        else stl=Font.PLAIN;
// Размер шрифта:
        int size=Integer.parseInt(getParameter("размер"));
// Текст для отображения:
        text="Шрифт "+font+" "+style+" размера "+size;
// Применение атрибутов к шрифту:
        setFont(new Font(font,stl,size));}
    // Метод отрисовки апплета:
    public void paint(Graphics g){
        g.drawString(text,30,getHeight()-30);}
}