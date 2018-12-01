package Cp_14;

import java.awt.*;
import javax.swing.*;
public class Progress extends JFrame{
    Progress(){
        super(" Progress...");
        final ProgressMonitor mon = new ProgressMonitor(this,
                "Идет процесс.", "Осталось ", 0, 100);
        Runnable runnable = new Runnable(){
            public void run(){
                for (int i = 1; i < 100; i++){
                    try{
                        mon.setNote( "Осталось " + (100 - i) + " %");
                        mon.setProgress(i);
                        if (mon.isCanceled()){
                            mon.setProgress(100);
                            break;
                        }
                        Thread.sleep(100);
                    }catch(InterruptedException e){}
                }
                mon.close();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new Progress();
    }
}
