package Cp_17;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;
public class ContTheme extends JFrame{
    ContTheme(){
        super(" Окно с серой темой");
        JDesktopPane dp = new JDesktopPane();
        setLayout(new FlowLayout());
        setContentPane(dp);
        JInternalFrame ifr1 = new JInternalFrame(
                " Oкно GrayMetalTheme", true, true, true, true);
        ifr1.getContentPane().setLayout(new FlowLayout());
        ifr1.getContentPane().add(
                new JLabel("<html>Это окно Java L&F<p>Серая тема" ));
        ifr1.setBounds(0,0, 200,200);
        ifr1.setVisible(true);
        dp.add(ifr1);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        MetalLookAndFeel.setCurrentTheme(new GrayMetalTheme());
        new ContTheme();
    }
}
class GrayMetalTheme extends DefaultMetalTheme{
    public ColorUIResource getPrimary1(){
        return getSecondary1();
    }
    public ColorUIResource getPrimary2(){
        return getSecondary2();
    }
    public ColorUIResource getPrimary3(){
        return getSecondary3();
    }
    public void addCustomEntriesToTable(UIDefaults table){
        super.addCustomEntriesToTable(table);
        BorderUIResource b = new BorderUIResource(
                new CompoundBorder(
                        new LineBorder(Color.gray),
                        new LineBorder(Color.white)));
        table.put("TextField.border", b);
        table.put("PasswordField.border", b);
        table.put("TextArea.border", b);
        table.put("TextPane.font", b);
    }
}
