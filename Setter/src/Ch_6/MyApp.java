package Ch_6;

import jdk.nashorn.internal.runtime.Debug;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by ito on 21.03.17.
 */
public class MyApp {
    public static void main(String[] args) {
        try {
            PrintStream eerOut = new PrintStream(new FileOutputStream("Error.log"));
            System.setErr(eerOut);

            PrintStream sysOut = new PrintStream(new FileOutputStream("Debug.log"));
            System.setOut(sysOut);
        }
        catch (Exception e){
            System.out.println("Сообщения о нормальной работе.");
            System.err.println("Сообщения об ошибках");
        }
    }
}
