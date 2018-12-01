package Ch_12;

import java.io.*;
public class FileInOutDemo {
    public static void main(String[] args) throws IOException{
        try{
// Создание байтового потока ввода:
            FileInputStream fis=new FileInputStream("D:/Books/Files/base.txt");
// Создание байтового потока вывода:
            FileOutputStream fos=new FileOutputStream("D:/Books/Files/data.txt",true);
// Создание буферизированного потока ввода:
            BufferedReader br=new BufferedReader(new InputStreamReader(fis,"windows-1251"));
// Создание буферизированного потока вывода:
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fos));
// Текстовая переменная:
            String str;
            do{
// Считывание строки из файла:
                str=br.readLine();
// Вывод считанной строки в консоль:
                System.out.println(str);
// Переход к новой строке в файле результата:
                bw.newLine();
// Запись в файл результата преобразованной строки:
                bw.write(str.toLowerCase().replace(' ','_'));
            }while(!str.equalsIgnoreCase("Омар Хайям"));
// Закрытие потоков:
            br.close();
            bw.close();
// Обработка ошибки:
        }catch(FileNotFoundException e){
            System.out.println("Файл не найден! "+e);}
    }}