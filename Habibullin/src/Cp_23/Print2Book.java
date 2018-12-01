package Cp_23;

import java.awt.*;
import java.awt.print.*;
public class Print2Book{
    public static void main(String[] args){
        PrinterJob pj = PrinterJob.getPrinterJob();
// Для титульного листа выбирается альбомная ориентация.
        PageFormat pfl = pj.defaultPage();
        pfl.setOrientation(PageFormat.LANDSCAPE);
// Параметры других страниц задаются в диалоговом окне.
        PageFormat pf2 = pj.pageDialog(new PageFormat());
        Book bk = new Book();
// Первая страница — титульный лист.
        bk.append(new Cover(), pfl);
// Две другие страницы.
        bk.append(new Content(), pf2, 2);
// Определяется вид печати — Pageable Job.
        pj.setPageable(bk);
        if (pj.printDialog()){
            try{
                pj.print();
            }catch(Exception e){}
        }
        System.exit(0);
    }
}
class Cover implements Printable{
    public int print(Graphics g, PageFormat pf, int ind)
            throws PrinterException{
        g.setFont(new Font("Helvetica-Bold", Font.PLAIN, 40));
        g.setColor(Color.black);
        int y = (int)(pf.getImageableY() +
                pf.getImageableHeight()/2);
        g.drawString("Это заголовок.", 72, y);
        g.drawString("Он печатается вдоль длинной", 72, y+60);
        g.drawString("стороны листа бумаги.", 72, y+120);
        return Printable.PAGE_EXISTS;
    }
}
class Content implements Printable{
    public int print(Graphics g, PageFormat pf, int ind)
            throws PrinterException{
        Graphics2D g2 = (Graphics2D)g;
        g2.setFont(new Font("Serif", Font.PLAIN, 12));
        g2.setColor(Color.black);
        int x = (int)pf.getImageableX() + 30;
        int y = (int)pf.getImageableY();
        g2.drawString("Это строки обычного текста.", x, y += 16);
        g2.drawString("Они печатаются с параметрами,", x, y += 16);
        g2.drawString("выбранными в диалоговом окне.", x, y += 16);
        return Printable.PAGE_EXISTS;
    }
}