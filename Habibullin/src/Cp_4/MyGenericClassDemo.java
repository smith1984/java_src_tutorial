package Cp_4;

class MyGenericClass<T>{
    private T data;
    public MyGenericClass(){}
    public MyGenericClass(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data = data;
    }
}
class MyGenericClassDemo{
    public static void main(String[] args){
        MyGenericClass<Integer> iMyGen = new MyGenericClass<Integer>(55);
        Integer n = iMyGen.getData();
        MyGenericClass<Double> dMyGen = new MyGenericClass<Double>(-37.3456);
        Double x = dMyGen.getData();
    }
}
