package Cp_4;

class Average<T extends Number>{
    T[] data;
    public Average(T[] data) { this.data = data; }
    public double average(){
        double result = 0.0;
        for (T t: data) result += t.doubleValue();
        return result / data.length;
    }
    public static void main(String[] args){
        Integer[] iArray = {1, 2, 3, 4};
        Double[] dArray = {3.4, 5.6, 2.3, 1.24};
        Average<Integer> iAver = new Average<>(iArray);
        System.out.println("int average = " + iAver.average());
        Average<Double> dAver = new Average<>(dArray);
        System.out.println("double average = " + dAver.average());
    }
}
