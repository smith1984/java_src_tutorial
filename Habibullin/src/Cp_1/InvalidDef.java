package Cp_1;

/**
 * Created by ito on 18.11.16.
 */
public class InvalidDef {
    public static void main (String[] args){
        byte b1 = 50, b2 = -99, b3;
        short det = 0, ind = 1, sh = 'd';
        int i = -100, j = 100, k = 9999;
        long big = 50, veryBig = 2147483648L;
        char c1 = 'A', c2 = '?', c3 = 36, newLine = '\n';
        System.out.println((b1+c1)%(++b2/b1++));
        System.out.println((b1 < c1) && (b2 == -99) || (ind >= 0));
        System.out.println((b1 | c1) & (big ^ b1));
        System.out.println((b1<<3 + c1<<2) % (b2>>5 / b1>>>2));
    }
}
