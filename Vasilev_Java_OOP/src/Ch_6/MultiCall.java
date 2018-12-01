package Ch_6;

class A_2{
    int a;
    A_2(int i){
        a=i;
        System.out.println("Поле a: "+a);}
}
class B_2 extends A_2{
    int b;
    B_2(int i,int j){
        super(i);
        b=j;
        System.out.println("Поле b: "+b);}
}
class C extends B_2{
    int c;
    C(int i,int j,int k){
        super(i,j);
        c=k;
        System.out.println("Поле c: "+c);}
}
class MultiCall{
    public static void main(String args[]){
        C obj=new C(1,2,3);}
}
