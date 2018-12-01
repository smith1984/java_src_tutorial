package Cp_2;

class Dummy3{
    private static void f(int[] a){
        a = new int[]{5};
    }
    public static void main(String[] args){
        int[] x = {7};
        System.out.println("До: " + x[0]);
        f(x);
        System.out.println("После: " + x[0]);
    }
}
