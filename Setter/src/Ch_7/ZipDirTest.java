package Ch_7;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ito on 22.03.17.
 */
public class ZipDirTest {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Usage: java <имя_архива> <имя_папки>");
            return;
        }
        String zipFile = args[0];
        String zipperDir = args[1];

        try{
            System.out.println("Начало архивирования.");
            ZipDir.exec(zipFile, zipperDir);
            System.out.println("Архивирование прошло успешно");
        }
        catch (FileNotFoundException fnfe){fnfe.printStackTrace();}
        catch (IOException ioe){ioe.printStackTrace();}
    }
}
