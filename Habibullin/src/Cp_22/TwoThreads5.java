package Cp_22;

class TwoThreads5 implements Runnable{
    private String msg;
    private Thread go;
    TwoThreads5(String s){
        msg = s;
        go = new Thread(this);
        go.start();
    }
    public void run(){
        Thread th = Thread.currentThread();
        while(go == th){
            try{
                Thread.sleep(100);
            }catch(InterruptedException ie){}
            System.out.print(msg + " ");
        }
        System.out.println("End of thread.");
    }
    public void stop(){ go = null; }
    public static void main(String[] args){
        TwoThreads5 th1 = new TwoThreads5("HIP");
        TwoThreads5 th2 = new TwoThreads5("hop");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ie){}
        th1.stop(); th2.stop();
        System.out.println();
    }
}
