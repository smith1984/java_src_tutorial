package Ch_6;

import java.io.*;

/**
 * Created by ito on 21.03.17.
 */
public class ReadInput {
    String cmd = null;
    Process proc = null;
    InputStream input = null;
    BufferedReader reader = null;

    ReadInput(String cmd) throws IOException {
        this.cmd = cmd;

        try{
            proc = Runtime.getRuntime().exec(cmd);
            input = proc.getInputStream();
            reader = new BufferedReader(new InputStreamReader(input));
        }
        catch (IOException exc){
            throw  exc;
        }
    }

    public String readLine() throws IOException{
        String line = reader.readLine();
        while ((line == "\r") | (line =="")){
            line = reader.readLine();
        }
        return line;
    }

    public void close(){
        try{
            reader.close();
            input.close();
            proc.destroy();
        }
        catch (IOException exc){
            exc.printStackTrace();
        }
        finally {
            reader = null;
            input = null;
            proc = null;
        }
    }

    public static void main(String[] args) {
        String cmd = null;
        ReadInput ri = null;
        if (args.length > 0 )
            cmd = args[0];
        else
            cmd = "ping localhost";


        try{
            //PrintStream ps = new PrintStream(System.out, true, "KOI8_R");
            //System.setOut(ps);
            ri = new ReadInput(cmd);
            String line = null;
            while ((line = ri.readLine()) != null)
                if (line != "\r")
                    System.out.println("java:> " + line);
        }
        catch (IOException exc){
            exc.printStackTrace();
        }
        finally {
            ri.close();
            ri = null;
        }
    }
}
