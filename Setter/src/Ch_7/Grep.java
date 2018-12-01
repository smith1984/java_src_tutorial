package Ch_7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ito on 22.03.17.
 */
public class Grep {
    public static void main(String[] args) {
        if ((args.length == 0 ) || args.length > 0 ){
            System.out.println("Usage: java <образец> <имя файла>");
            System.exit(0);
        }
        try{
            FileInputStream fis = new FileInputStream(args[1]);
            GrepInputStream gis = new GrepInputStream((InputStream) fis, args[0]);
            String line;
            for (;;){
                line = gis.readLine();
                if(line == null )
                    break;
                System.out.println(line);
            }
            gis.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
