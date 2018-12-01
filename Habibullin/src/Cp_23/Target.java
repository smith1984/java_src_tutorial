package Cp_23;

import java.io.*;
class Target extends Thread{
    private PipedReader pr;
    Target(PipedWriter pw){
        try{
            pr = new PipedReader(pw);
        }catch(IOException e){
            System.err.println("From Target(): " + e);
        }
    }
    PipedReader getStream(){ return pr;}
    public void run(){
        while(true)
            try{
                System.out.println("Reading: " + pr.read());
            }catch(IOException e){
                System.out.println("The job's finished.");
                System.exit(0);
            }
    }
}
class Source extends Thread{
    private PipedWriter pw;
    Source(){
        pw = new PipedWriter();
    }
    PipedWriter getStream(){ return pw;}
    public void run(){
        for (int k = 0; k < 10; k++)
            try{
                pw.write(k);
                System.out.println("Writing: " + k);
            }catch(Exception e){
                System.err.println("From Source.run(): " + e);
            }
    }
}
class PipedPrWr{
    public static void main(String[] args){
        Source s = new Source();
        Target t = new Target(s.getStream());
        s.start(); t.start();
    }
}