package Cp_20;

import java.applet.*;
import java.net.*;
class SimpleAudio{
    SimpleAudio(){
        try{
            AudioClip ac = Applet.newAudioClip(new URL("file:doom.mid"));
            ac.loop();
        }catch(Exception e){}
    }
    public static void main(String[] args){
        new SimpleAudio();
    }
}