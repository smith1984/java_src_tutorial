package Cp_4;

import java.math.BigInteger;
class BigIntegerTest{
    public static void main(String[] args){
        BigInteger a = new BigInteger("99999999999999999");
        BigInteger b = new BigInteger("88888888888888888888");
        System.out.println("bits in a = " + a.bitLength());
        System.out.println("bits in b = " + b.bitLength());
        System.out.println("a + b = " + a.add(b));
        System.out.println("a & b = " + a.and(b));
        System.out.println("a & ~b = " + a.andNot(b));
        System.out.println("a / b = " + a.divide(b));
        BigInteger[] r = a.divideAndRemainder(b);
        System.out.println("a / b: q = " + r[0] + ", r = " + r[1]);
        System.out.println("gcd(a, b) = " + a.gcd(b));
        System.out.println("max(a, b) = " + a.max(b));
        System.out.println("min(a, b) = " + a.min(b));
        System.out.println("a mod b = " + a.mod(b));
        System.out.println("1/a mod b = " + a.modInverse(b));
        System.out.println("a^n mod b = " + a.modPow(a, b));
        System.out.println("a * b = " + a.multiply(b));
        System.out.println("-a = " + a.negate());
        System.out.println("~a = " + a.not());
        System.out.println("a | b = " + a.or(b));
        System.out.println("a ^ 3 = " + a.pow(3));
        System.out.println("a % b = " + a.remainder(b));
        System.out.println("a << 3 = " + a.shiftLeft(3));
        System.out.println("a >> 3 = " + a.shiftRight(3));
        System.out.println("sign(a) = " + a.signum());
        System.out.println("a — b = " + a.subtract(b));
        System.out.println("a ^ b = " + a.xor(b));
    }
}
