package Cp_2;

class Dummy1{
    private static void f(int a){
        a = 5;
    }
    public static void main(String[] args){
        int x = 7;
        System.out.println("До: " + x);
        f(x);
        System.out.println("После: " + x);
    }
}
