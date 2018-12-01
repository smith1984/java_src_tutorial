package Ch_15;

import javax.swing.*;
public class SimpleAppletDemo extends JApplet{
    // Метод запускается при загрузке апплета:
    public void init(){
// Создание метки:
        JLabel labl=new JLabel(" Это очень простой апплет!",JLabel.CENTER);
// Добавление метки в апплет:
        add(labl);}
}
