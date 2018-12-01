package Ch_6;

import java.io.IOException;

/**
 * Created by ito on 21.03.17.
 */
public class ExecProcess {
    public static void main(String[] args) {
        try{
            Runtime.getRuntime().exec("notepad.exe");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
