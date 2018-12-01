package Cp_18;

// Файл RunningString.java
import java.awt.*;
import java.applet.*;
public class RunningString extends Applet{
    private boolean go;
    public void start(){
        go = true;
        sendMessage("Эта строка выводится апплетом");
    }
    public void sendMessage(String s){
        String s1 = s + " ";
        while (go){
            showStatus(s);
            try{
                Thread.sleep(200);
            }catch(Exception e){}
            s = s1.substring(1) + s.charAt(0);
            s1 =s;
        }
    }
    public void stop(){
        go = false;
    }
}
