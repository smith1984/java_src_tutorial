package Ch_15;

import java.io.*;
import  java.net.*;

public class DialyAdviceServer {
    String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat",
            "One word: inappropriate", "Just for today, be honest.  Tell your boss what you *really* think",
            "You might want to rethink that haircut"};

    public void go(){
        try {
            ServerSocket socket = new ServerSocket(4242);
            while (true){
                Socket sock = socket.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getAdvice(){
        int random = (int)(Math.random()*adviceList.length);
        return adviceList[random];
    }

    public static void main (String[] args){
        DialyAdviceServer server = new DialyAdviceServer();
        server.go();
    }
}
