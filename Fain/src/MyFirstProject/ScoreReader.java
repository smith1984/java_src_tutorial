package MyFirstProject;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ScoreReader {
    public static void main(String[] args) {
        FileReader myFile = null;
        BufferedReader buff = null;
        try {
            myFile=new FileReader("scores.txt");
            buff = new BufferedReader(myFile);
            while (true) {
// считывается строка из файла scores.txt
                String line = buff.readLine();
// проверка достижения конца файла
                if (line == null) break;
                System.out.println(line);
            } // конец цикла while
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                buff.close();
                myFile.close();
            }catch(IOException e1){
                e1.printStackTrace();
            }
        }
    } // конец метода main
}