package Cp_21;

class SimpleExt4{
    public static void main(String[] args){
        try{
            int n = Integer.parseInt(args[0]);
            System.out.println("After parseInt()");
            System.out.println(" 10 / n = " + (10 / n));
            System.out.println("After results output");
        }catch(RuntimeException ae){
            System.out.println("From Run.Exc. catch: " + ae);
        }finally{
            System.out.println("From finally");
        }
        System.out.println("After all actions");
    }
}