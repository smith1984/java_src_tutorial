package Cp_4;

import java.math.*;
class BigDecimalTest{
    public static void main(String[] args){
        BigDecimal x = new BigDecimal("-12345.67890123456789");
        BigDecimal y = new BigDecimal("345.7896e-4");
        BigDecimal z = new BigDecimal(new BigInteger("123456789"), 8);
        System.out.println("|x| = " + x.abs());
        System.out.println("x + y = " + x.add(y));
        System.out.println("x / y = " + x.divide(y, BigDecimal.ROUND_DOWN));
        System.out.println("x / y = " + x.divide(y, 6, BigDecimal.ROUND_HALF_EVEN));
        System.out.println("max(x, y) = " + x.max(y));
        System.out.println("min(x, y) = " + x.min(y));
        System.out.println("x << 3 = " + x.movePointLeft(3));
        System.out.println("x >> 3 = " + x.movePointRight(3));
        System.out.println("x * y = " + x.multiply(y));
        System.out.println("-x = " + x.negate());
        System.out.println("scale of x = " + x.scale());
        System.out.println("increase scale of x to 20 = " + x.setScale(20));
        System.out.println("decrease scale of x to 10 = " +
                x.setScale(10, BigDecimal.ROUND_HALF_UP));
        System.out.println("sign(x) = " + x.signum());
        System.out.println("x — y = " + x.subtract(y));
        System.out.println("round x = " + x.toBigInteger());
        System.out.println("mantissa of x = " + x.unscaledValue());
        System.out.println("mantissa of 0.1 =\n= " +
                new BigDecimal(0.1).unscaledValue());
    }
}
