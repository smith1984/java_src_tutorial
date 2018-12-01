package Cp_1;

public class BooleanType {
    public static void main(String[] args){
        boolean b = true, bb = false;
        boolean result = b & bb && !bb | b;
        boolean result_2 = (!b || bb) && (bb ^ b);
        System.out.println(result);
        System.out.println(result_2);

    }
}
