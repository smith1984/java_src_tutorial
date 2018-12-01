package test;

import javax.sound.midi.*;

public class MusicTest {
    public void play(){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Мы получили синтезатор");
        }
        catch (Exception e){
            System.out.println("Неудача");
        }
    }

    public static void main (String[] args){
        MusicTest musicTest = new MusicTest();
        musicTest.play();
    }
}
