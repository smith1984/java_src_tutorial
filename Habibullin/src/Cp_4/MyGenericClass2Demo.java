package Cp_4;

class MyGenericClass2<S, T>{
    private S id;
    private T data;
    public MyGenericClass2(){}
    public MyGenericClass2(S id, T data){
        this.id = id;
        this.data = data;
    }
    public S getId(){
        return id;
    }
    public void setId(S data){
        this.id = id;
    }
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data = data;
    }
}
public class MyGenericClass2Demo<S, T>{
    public MyGenericClass2<S, T>
    makeClass2(S id, MyGenericClass<T> data){
        return new MyGenericClass2(id, data.getData());
    }
    public static void main(String[] args){
        MyGenericClass<Double> dMyGen = new MyGenericClass<>(34.456);
        MyGenericClass2Demo<Long, Double> d =
                new MyGenericClass2Demo<>();
        MyGenericClass2<Long, Double> ldMyGen2 =
                d.makeClass2(123456L, dMyGen);
    }
}