package Ch_7;

import java.io.*;

/**
 * Created by ito on 22.03.17.
 */
public class GrepInputStream extends FilterInputStream {
    String subString = null;
    BufferedReader reader;

    public GrepInputStream(InputStream in, String subString){
        super(in);
        this.reader = new BufferedReader(new InputStreamReader(in));
    }

    public final String readLine () throws IOException{
        String line;
        do{
            line = reader.readLine();
        }
        while ((line != null) && line.indexOf(subString) == -1);
        return line;
    }
}
