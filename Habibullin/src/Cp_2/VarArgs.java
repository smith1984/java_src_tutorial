package Cp_2;

class VarArgs{
    private static int[] args1 = {1, 2, 3, 4, 5, 6};
    private static int[] args2 = {100, 90, 80, 70};
    public static int sum(int[] args){
        int result = 0;
        for (int k: args) result += k;
        return result;
    }
    public static int sum_(int... args){
        int result = 0;
        for (int k: args) result += k;
        return result;
    }
    public static void main(String[] args){
        System.out.println("Sum1 = " + sum(args1));
        System.out.println("Sum2 = " + sum(args2));
        System.out.println("Sum1 = " + sum_(1, 2, 3, 4, 5, 6));
        System.out.println("Sum2 = " + sum_(100, 90, 80, 70));
    }
}
