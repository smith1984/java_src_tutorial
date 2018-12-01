package Ch_5;

/**
 * Created by ito on 21.03.17.
 */
public class StackDemo {
    public static void main(String[] args) {
    Stack stack = new Stack();
    for (int i = 0; i < 15; i++)
        stack.push(i);
    for (int i = 0; i < 15; i++)
        System.out.println(stack.topAndPop());
    }
}
