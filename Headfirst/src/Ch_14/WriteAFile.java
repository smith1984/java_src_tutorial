package Ch_14;

import java.io.*;

public class WriteAFile {
    public static void main (String [] args){
        try{
            FileWriter fileWriter = new FileWriter("foo.txt");
            fileWriter.write("Hello, Foo");
            fileWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
