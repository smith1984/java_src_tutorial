package Ch_12;

import java.io.*;
import javax.swing.*;
public class FileInputOutputDemo{
    public static void main(String[] args) throws IOException{
// Базовая директория:
        String FilePath="D:/Books/Files/";
// Считывание имени файла:
        FilePath+=JOptionPane.showInputDialog("Укажите имя файла");
        try{
// Создание файлового потока ввода:
            FileInputStream fin=new FileInputStream(FilePath);
// Создание файлового потока вывода:
            FileOutputStream fout=new FileOutputStream("D:/Books/Files/result.txt");
// Считывание из файла:
            int s=fin.read();
// Обработка считанного значения:
            while(s!=-1){
                switch(s){
                    case 'T':
                        s='t';
                        break;
                    case '.':
                        fout.write('<');
                        fout.write('*');
                        s='>';
                        break;
                }
// Запись в файл:
                fout.write(s);
// Считывание из файла:
                s=fin.read();}
// Отображение диалогового окна:
            JOptionPane.showMessageDialog(null,"Изменения в файл внесены!"," Программа закончила работу",JOptionPane.INFORMATION_MESSAGE);
// Закрытие файлов:
            fin.close();
            fout.close();
// Обработка исключительной ситуации:
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Такого файла нет!"," Произошла ошибка",JOptionPane.ERROR_MESSAGE);}
    }}