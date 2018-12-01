package MyFirstProject;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class ByteReader {
    public static void main(String[] args) {
        FileInputStream myFile = null;
        BufferedInputStream buff =null;
        try {
// Открытие байтового потока, указывающего на файл
            myFile = new FileInputStream("c:\\temp\\abc.gif");
            buff = new BufferedInputStream(myFile);
            while (true) {
                int intValueOfByte = buff.read();
                System.out.print(" " + intValueOfByte);
                if (intValueOfByte == -1){
// достигнут конец файла нужно выйти из цикла
                    break;
                }
            } // конец цикла while
// myFile.close(); не помещайте этот вызов здесь
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл: "
                    + e.toString());
        } finally{
            try{
                myFile.close();
            } catch (Exception e1){
                e1.printStackTrace();
            }
            System.out.println(
                    "Чтение файла завершено успешно");
        }
    }
}
