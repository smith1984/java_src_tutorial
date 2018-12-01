package Cp_22;

class TwoThreads4 implements Runnable{
    public void run(){
// synchronized public void run(){
        System.out.print("Hello, ");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ie){}
        System.out.println("World!");
    }
    public static void main(String[] args){
        TwoThreads4 th = new TwoThreads4();
        new Thread(th).start();
        new Thread(th).start();
    }
}
