package Ch_6;

/**
 * Created by ito on 22.03.17.
 */
public class ShutDownHook {
    ShutDownHook(){}

    public static void main(String[] args) {
        Runtime rtm = Runtime.getRuntime();
        rtm.addShutdownHook(new ShutDownThread());
        rtm = null;
        try{
            System.out.println("Программа будет ждать 100 секунд, перед тем как закрыться.");
            System.out.println("Нажатие ctrl+c не завершит работу программы, а вызовет переход к следующей ее части.");
            Thread.sleep(100000);
        }
        catch (InterruptedException ie)
        {ie.printStackTrace();}
    }
}
class ShutDownThread extends Thread{
    public void run(){
        System.out.println("Программа завершена, но можно еще что то изменить");
    }
}
