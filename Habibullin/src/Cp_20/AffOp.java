package Cp_20;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.*;
public class AffOp extends JFrame{
    private BufferedImage bi;
    public AffOp(String s){
        super(s);
// Загружаем изображение img.
        Image img = getToolkit().getImage("javalogo52x88.gif");
// В этом блоке организовано ожидание загрузки.
        try{
            MediaTracker mt = new MediaTracker(this);
            mt.addImage(img, 0);
            mt.waitForID(0); // Ждем окончания загрузки.
        }catch(Exception e){}
        // Размеры создаваемой области bi совпадают
// с размерами изображения img.
        bi = new BufferedImage(img.getWidth(this), img.getHeight(this),
                BufferedImage.TYPE_INT_RGB);
// Создаем графический контекст big изображения bi.
        Graphics2D big = bi.createGraphics();
// Выводим изображение img в графический контекст big.
        big.drawImage(img, 0, 0, this);
    }
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        int w = getSize().width;
        int h = getSize().height;
        int bw = bi.getWidth(this);
        int bh = bi.getHeight(this);
// Создаем аффинное преобразование at.
        AffineTransform at = new AffineTransform();
        at.rotate(Math.PI/4); // Задаем поворот на 45 градусов
// по часовой стрелке вокруг левого верхнего угла.
// Затем сдвигаем изображение вправо на величину bw.
        at.preConcatenate(new AffineTransform(1, 0, 0, 1, bw, 0));
// Определяем область хранения bimg преобразованного
// изображения. Ее размер вдвое больше исходного.
        BufferedImage bimg =
                new BufferedImage(2*bw, 2*bw, BufferedImage.TYPE_INT_RGB);
// Создаем объект biop, содержащий преобразование at.
        BufferedImageOp biop = new AffineTransformOp(at,
                AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
// Преобразуем изображение, результат заносим в bimg.
        biop.filter(bi, bimg);
// Выводим исходное изображение.
        g2.drawImage(bi, null, 10, 30);
// Выводим измененную преобразованием biop область bi.
        g2.drawImage(bi, biop, w/4+3, 30);
// Выводим преобразованное внутри области bimg изображение.
        g2.drawImage(bimg, null, w/2+3, 30);
    }
    public static void main(String[] args){
        JFrame f = new AffOp(" Аффинное преобразование");
        f.setSize(400, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}