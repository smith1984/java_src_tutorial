package Ch_5;

class Base{
    int a,b;
    void show(){
        System.out.println(a+":"+b);}
}
class Test{
    void f(int x,int y){
        x*=2;
        y/=2;
        System.out.println(x+":"+y);}
    void f(Base obj){
        obj.a*=2;
        obj.b/=2;
        System.out.println(obj.a+":"+obj.b);}
}
class TestDemo{
    public static void main(String args[]){
        Base obj=new Base();
        Test tstFunc=new Test();
        obj.a=10;
        obj.b=200;
        tstFunc.f(obj.a,obj.b);
        obj.show();
        tstFunc.f(obj);
        obj.show();}
}
