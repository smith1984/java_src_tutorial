package Cp_4;

class NumberTest{
    public static void main(String[] args){
        int i = 0;
        short sh = 0;
        double d = 0;
        Integer k1 = Integer.valueOf(55);
        Integer k2 = Integer.valueOf(100);
        Double d1 = Double.valueOf(3.14);
        try{
            i = Integer.parseInt(args[0]);
            sh = Short.parseShort(args[0]);
            d = Double.parseDouble(args[1]);
            d1 = new Double(args[1]);
            k1 = new Integer(args[0]);
        }catch(Exception e){}
        double x = 1.0 / 0.0;
        System.out.println("i = " + i);
        System.out.println("sh = " + sh);
        System.out.println("d = " + d);
        System.out.println("k1.intValue() = " + k1.intValue());
        System.out.println("d1.intValue() = " + d1.intValue());
        System.out.println("k1 > k2? " + k1.compareTo(k2));
        System.out.println("x = " + x);
        System.out.println("x isNaN? " + Double.isNaN(x));
        System.out.println("x isInfinite? " + Double.isInfinite(x));
        System.out.println("x == Infinity? " + (x == Double.POSITIVE_INFINITY));
        System.out.println("d = " + Double.doubleToLongBits(d));
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("i = " + Integer.toHexString(i));
        System.out.println("i = " + Integer.toOctalString(i));
    }
}