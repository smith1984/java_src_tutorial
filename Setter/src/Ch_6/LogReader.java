package Ch_6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ito on 21.03.17.
 */
public class LogReader {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Не задано имя лог файла");
            System.exit(0);
        }
        String logFile = null;
        BufferedReader br = null;
        try{
            logFile = args[0];
            br = new BufferedReader(new InputStreamReader(new FileInputStream(logFile)));
            while (true){
                String line = br.readLine();
                if (line !=null)
                    System.out.println(line);
                else
                    try{
                    Thread.sleep(50);
                    }
                    catch (InterruptedException e){
                    e.printStackTrace();
                    }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
