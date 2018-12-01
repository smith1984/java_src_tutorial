package Cp_2;

class Dummy2{
    private static void f(int[] a){
        a[0] = 5;
    }
    public static void main(String[] args){
        int[] x = {7};
        System.out.println("До: " + x[0]);
        f(x);
        System.out.println("После: " + x[0]);
    }
}