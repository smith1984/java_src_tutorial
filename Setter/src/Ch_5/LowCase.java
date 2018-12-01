package Ch_5;

/**
 * Created by ito on 21.03.17.
 */
public class LowCase {
        public static void main(String[] args) {
            char ch;

            for (int i = 0; i < 10; i++) {
                ch = (char) ('A' + i);
                System.out.print(ch + " ");
                ch = (char) ((int) ch | 0x20);
                System.out.print(ch + " ");
            }
        }
}
