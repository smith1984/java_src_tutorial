package Cp_20;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
public class CropTest extends JFrame{
    private Image img, cropimg, replimg, averimg;
    CropTest(String s){
        super(s);
// 1. Создаем изображение — объект класса Image.
        img = getToolkit().getImage("javalogo52x88.gif");
// 2. Создаем объекты-фильтры:
// а) выделяем левый верхний угол размером 30x30,
        CropImageFilter crp =
                new CropImageFilter(0, 0, 30, 30);
// б) увеличиваем изображение в два раза простым методом,
        ReplicateScaleFilter rsf =
                new ReplicateScaleFilter(104, 176);
// в) увеличиваем изображение в два раза с усреднением.
        AreaAveragingScaleFilter asf =
                new AreaAveragingScaleFilter(104, 176);
// 3. Создаем измененные изображения.
        cropimg = createImage(new FilteredImageSource(img.getSource(), crp));
        replimg = createImage(new FilteredImageSource(img.getSource(), rsf));
        averimg = createImage(new FilteredImageSource(img.getSource(), asf));
        setSize(400, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.drawImage(img, 10, 40, this);
        g.drawImage(cropimg, 150, 40, 100, 100, this);
        g.drawImage(replimg, 10, 150, this);
        g.drawImage(averimg, 150, 150, this);
    }
    public static void main(String[] args){
        new CropTest(" Масштабирование");
    }
}