package Ch_4;

class UsingStatic{
    // Статические поля:
    static int a=3;
    static int b;
    // Статический метод:
    static void meth(int x){
        System.out.println("x="+x);
        System.out.println("a="+a);
        System.out.println("b="+b);}
    // Статический блок:
    static{
        System.out.println("Статический блок:");
        b=a*4;}
    // Вызов статического метода:
    public static void main(String args[]){
        meth(123);
    }}