package Cp_23;

import java.awt.*;
import java.awt.geom.*;
import java.awt.print.*;
class Print2Test implements Printable{
    public int print(Graphics g, PageFormat pf, int ind)
            throws PrinterException{
// Печатаем не более 5 страниц.
        if (ind > 4) return Printable.NO_SUCH_PAGE;
        Graphics2D g2 = (Graphics2D)g;
        g2.setFont(new Font("Serif", Font.ITALIC, 30));
        g2.setColor(Color.black);
        g2.drawString("Page " + (ind + 1), 100, 100);
        g2.draw(new Ellipse2D.Double(100, 100, 200, 200));
        return Printable.PAGE_EXISTS;
    }
    public static void main(String[] args) {
// 1. Создаем экземпляр задания.
        PrinterJob pj = PrinterJob.getPrinterJob();
// 2. Открываем диалоговое окно "Параметры страницы".
        PageFormat pf = pj.pageDialog(pj.defaultPage());
// 3. Задаем вид задания, объект класса, рисующего страницу,
// и выбранные параметры страницы.
        pj.setPrintable(new Print2Test(), pf);
// 4. Если нужно напечатать несколько копий, то:
        pj.setCopies(2); // По умолчанию печатается одна копия.
// 5. Открываем диалоговое окно "Печать" (необязательно)
        if (pj.printDialog()) { // Если ОК...
            try {
                pj.print(); // Обращается к print(g, pf, ind).
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}