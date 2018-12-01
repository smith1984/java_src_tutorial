package Cp_18;

// Файл ShowWindow.java
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ShowWindow extends Applet{
    private SomeWindow sw = new SomeWindow();
    private TextField tf = new TextField(30);
    private Button b = new Button("Скрыть");
    public void init(){
        add(tf); add(b); sw.pack();
        b.addActionListener(new ActShow());
        sw.tf.addActionListener(new ActShow());
    }
    public void start(){ sw.setVisible(true); }
    public void stop(){ sw.setVisible(false); }
    public void destroy(){ sw.dispose(); sw = null; tf = null; b = null; }
    public class ActShow implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if (ae.getSource() == sw.tf)
                tf.setText(sw.tf.getText());
            else if (b.getActionCommand() == "Показать"){
                sw.setVisible(true);
                b.setLabel("Скрыть");
            }else{
                sw.setVisible(false);
                b.setLabel("Показать");
            }
        }
    }
}
class SomeWindow extends Frame{
    public TextField tf = new TextField(50);
    SomeWindow(){
        super(" Окно ввода");
        add(new Label("Введите, пожалуйста, свое имя"), "North");
        add(tf, "Center");
    }
}