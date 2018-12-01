package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class StaticBlockDemo {
    public static void main (String[] args){
        System.out.println("Корень из 9 - " + StaticBlock.rootOf9);
        System.out.println("Корень из 27 - " + StaticBlock.rootOf27);
        StaticBlock staticBlock1 = new StaticBlock(4);
        StaticBlock staticBlock2 = new StaticBlock(16);
        System.out.println("sB1.number - " + staticBlock1.number);
        System.out.println("sB2.number - " + staticBlock2.number);
    }
}

class StaticBlock{
    static double rootOf9;
    static double rootOf27;
    int number;

    static {
        System.out.println("Инициализация статических членов класса");
        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    }

    StaticBlock(int number){
        this.number = number;
    }
}
