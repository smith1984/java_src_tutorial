package Cp_21;

class SimpleExt2{
    private static void f(int n){
        System.out.println(" 10 / n = " + (10 / n));
    }
    public static void main(String[] args){
        try{
            int n = Integer.parseInt(args[0]);
            System.out.println("After parseInt()");
            f(n);
            System.out.println("After results output");
        }catch(ArithmeticException ae){
            System.out.println("From Arithm.Exc. catch: " + ae);
        }catch(ArrayIndexOutOfBoundsException arre){
            System.out.println("From Array.Exc. catch: " + arre);
        }finally{
            System.out.println("From finally");
        }
        System.out.println("After all actions");
    }
}