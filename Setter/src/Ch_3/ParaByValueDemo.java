package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class ParaByValueDemo {
    public static void main (String [] args){
        ParaByValue test = new ParaByValue();
        int a = 2, b = 5;
        test.callByVal(a, b);
        System.out.println("a = " + a + "\nb = " + b);
    }
}
class ParaByValue{
    void callByVal (int x, int y){
        x = x + y;
        y = y + 1;
        System.out.println("x = " + x + "\ny = " + y);
    }
}
