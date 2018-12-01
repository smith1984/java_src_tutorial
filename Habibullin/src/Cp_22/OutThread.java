package Cp_22;

class OutThread extends Thread{
    private String msg;
    OutThread(String s, String name){
        super(name); msg = s;
    }
    public void run(){
        for(int i = 0; i < 20; i++){
            try{
                Thread.sleep(100);
            }catch(InterruptedException ie){}
            System.out.print(msg + " ");
        }
        System.out.println("End of " + getName());
    }
}
class TwoThreads{
    public static void main(String[] args){
        new OutThread("HIP", "Thread 1").start();
        new OutThread("hop", "Thread 2").start();
        System.out.println();
    }
}