package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class IExampleDemo {
    public static void main(String[] args){
        IExample ie = new IExample();
        ie.methodA();
        ie.methodB();
    }
}

interface A{
    void methodA();
}
interface B extends A{
    void methodB();
}
class IExample implements B {
    public void methodA() {
        System.out.println("MethodA");
    }

    public void methodB() {
        System.out.println("MethodB");
    }
}
