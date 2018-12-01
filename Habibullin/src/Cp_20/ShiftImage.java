package Cp_20;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
public class ShiftImage extends JFrame{
    private Image img, newimg;
    ShiftImage(String s){
        super(s);
// 1. Получаем изображение из файла.
        img = getToolkit().getImage("javalogo52x88.gif");
// 2. Создаем экземпляр фильтра.
        ImageFilter imf = new ShiftFilter(26); // Сдвиг на 26 пикселов.
// 3. Получаем новые пикселы с помощью фильтра.
        ImageProducer ip = new FilteredImageSource(img.getSource(), imf);
// 4. Создаем новое изображение.
        newimg = createImage(ip);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics gr){
        gr.drawImage(img, 20, 40, this);
        gr.drawImage(newimg, 100, 40, this);
    }
    public static void main(String[] args){
        new ShiftImage(" Циклический сдвиг изображения");
    }
}
// Класс-фильтр
class ShiftFilter extends ImageFilter{
    private int sh; // Сдвиг на sh пикселов вправо.
    public ShiftFilter(int shift){ sh = shift; }
    public void setPixels(int x, int y, int w, int h,
                          ColorModel m, byte[] pix, int off, int size){
        for (int k = x; k < x+w; k++){
            if (k+sh <= w)
                consumer.setPixels(k, y, 1, h, m, pix, off+sh+k, size);
            else
                consumer.setPixels(k, y, 1, h, m, pix, off+sh+k-w, size);
        }
    }
}
