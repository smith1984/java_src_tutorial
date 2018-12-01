package Cp_24;

import java.net.*;
import java.io.*;
public class SimpleURL{
    public static void main(String[] args){
        try{
            URL bhv = new URL("http://www.bhv.ru/");
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(bhv.openStream()));
            String line = null;
            while ((line = br.readLine()) != null)
                System.out.println(line);
            br.close();
        }catch(MalformedURLException me){
            System.err.println("Unknown host: " + me);
            System.exit(0);
        }catch(IOException ioe){
            System.err.println("Input error: " + ioe);
        }
    }
}