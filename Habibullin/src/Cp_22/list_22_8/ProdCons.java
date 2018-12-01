package Cp_22.list_22_8;

import java.util.concurrent.SynchronousQueue;
public class ProdCons{
    public static void main(String[] args){
        SynchronousQueue<Integer> st = new SynchronousQueue<>();
        Consumer c = new Consumer(st);
        Producer p = new Producer(st);
        try{
            Thread.sleep(30);
        }catch(InterruptedException ie){}
        p.stop(); c.stop();
    }
}
class Producer implements Runnable{
    private SynchronousQueue<Integer> st;
    private Thread go;
    Producer(SynchronousQueue<Integer> st){
        this.st = st;
        go = new Thread(this);
        go.start();
    }
    public void run(){
        int t = 0;
        Thread th = Thread.currentThread();
        while (go == th){
            try{
                st.put(t);
            }catch(InterruptedException ie){}
            System.out.print("Put: " + t + " ");
            t++;
        }
    }
    public void stop(){ go = null; }
}
class Consumer implements Runnable{
    private SynchronousQueue<Integer> st;
    private Thread go;
    Consumer(SynchronousQueue<Integer> st){
        this.st = st;
        go = new Thread(this);
        go.start();
    }
    public void run(){
        Thread th = Thread.currentThread();
        try{
            while (go == th) System.out.println("Got: " + st.take());
        }catch(InterruptedException ie){}
    }
    public void stop(){ go = null; }
}
