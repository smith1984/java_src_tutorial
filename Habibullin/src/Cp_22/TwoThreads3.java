package Cp_22;

class TwoThreads3 implements Runnable{
    private String msg;
    TwoThreads3(String s){ msg = s; }
    public void run(){
        for(int i = 0; i < 20; i++){
            try{
                Thread.sleep(100);
            }catch(InterruptedException ie){}
            System.out.print(msg + " ");
        }
        System.out.println("End of thread.");
    }
    public static void main(String[] args){
        new Thread(new TwoThreads3("HIP"), "Thread 1").start();
        new Thread(new TwoThreads3("hop"), "Thread 2").start();
        System.out.println();
    }
}
