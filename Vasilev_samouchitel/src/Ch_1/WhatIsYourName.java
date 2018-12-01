package Ch_1;

import javax.swing.*;
public class WhatIsYourName {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Добрый день! Как Вас зовут?");
        JOptionPane.showMessageDialog(null, "Приятно познакомиться,\n"+name+"!");
    }
}