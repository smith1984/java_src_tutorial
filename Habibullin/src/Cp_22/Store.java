package Cp_22;

class Store{
    private int inform = -1;
    private boolean ready;
    synchronized public int getInform(){
        try{
            if (!ready) wait();
            ready = false;
            return inform;
        }catch(InterruptedException ie){
        }finally{
            notify();
        }
        return -1;
    }
    synchronized public void setInform(int n){
        if (ready)
            try{
                wait();
            }catch(InterruptedException ie){}
        inform = n;
        ready = true;
        notify();
    }
}

class Producer implements Runnable{
    private Store st;
    private Thread go;
    Producer(Store st){
        this.st = st;
        go = new Thread(this);
        go.start();
    }
    public void run(){
        int n = 0;
        Thread th = Thread.currentThread();
        while (go == th){
            st.setInform(n);
            System.out.print("Put: " + n + " ");
            n++;
        }
    }
    public void stop(){ go = null; }
}
class Consumer implements Runnable{
    private Store st;
    private Thread go;
    Consumer(Store st){
        this.st = st;
        go = new Thread(this);
        go.start();
    }
    public void run(){
        Thread th = Thread.currentThread();
        while (go == th) System.out.println("Got: " + st.getInform());
    }
    public void stop(){ go = null; }
}
class ProdCons{
    public static void main(String[] args){
        Store st = new Store();
        Producer p = new Producer(st);
        Consumer c = new Consumer(st);
        try{
            Thread.sleep(30);
        }catch(InterruptedException ie){}
        p.stop(); c.stop();
    }
}
