package Cp_22;

class TwoThreads2 extends Thread{
    private String msg;
    TwoThreads2(String s, String name){
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
    public static void main(String[] args){
        new TwoThreads2("HIP", "Thread 1").start();
        new TwoThreads2("hop", "Thread 2").start();
        System.out.println();
    }
}
