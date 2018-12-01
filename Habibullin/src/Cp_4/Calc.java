package Cp_4;

import java.math.*;
class Calc{
    public static void main(String[] args){
        if (args.length < 3){
            System.err.println("Usage: java Calc operand operator operand");
            return;
        }
        BigDecimal a = new BigDecimal(args[0]);
        BigDecimal b = new BigDecimal(args[2]);
        switch (args[1].charAt(0)){
            case '+': System.out.println(a.add(b)); break;
            case '-': System.out.println(a.subtract(b)); break;
            case '*': System.out.println(a.multiply(b)); break;
            case '/': System.out.println(a.divide(b,
                    BigDecimal.ROUND_HALF_EVEN)); break;
            default : System.out.println("Invalid operator");
        }
    }
}
