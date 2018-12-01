package Ch_4;

class MyClass_{
    // Поля класса:
    double Re,Im;
    void set(double Re,double Im){
// Использование ссылки this:
        this.Re=Re;
        this.Im=Im;}
    void get(){
// Инструкция перехода на новую строку \n:
        System.out.println("Значения полей:\nRe="+this.Re+" и Im="+this.Im);}
}
class ThisDemo{
    public static void main(String[] args){
        MyClass_ obj=new MyClass_();
        obj.set(1,5);
        obj.get();}
}