package Ch_5;

class MyObjs{
    // Поля класса:
    double Re,Im;
    // Присваивание значений полям:
    void set(double Re,double Im){
        this.Re=Re;
        this.Im=Im;
        show();}
    // Отображение значений полей:
    void show(){
        System.out.println("Re="+Re+" и "+"Im="+Im);}
    // Конструктор без аргументов:
    MyObjs(){
        set(0,0);}
    // Конструктор с одним аргументом:
    MyObjs(double x){
        set(x,x);}
    // Конструктор с двумя аргументами:
    MyObjs(double x,double y){
        set(x,y);}
    // Конструктор копирования:
    MyObjs(MyObjs obj){
        set(obj.Re,obj.Im);}
    // Аргумент и результат - объекты:
    MyObjs getSum(MyObjs obj){
// Создание локального объекта:
        MyObjs tmp=new MyObjs();
// Определение параметров локального объекта:
        tmp.Re=this.Re+obj.Re;
        tmp.Im=this.Im+obj.Im;
// Возвращение результата методом:
        return tmp;}
    // "Прибавление" объекта к объекту:
    void add(MyObjs obj){
        Re+=obj.Re;
        Im+=obj.Im;}
}
class ObjsDemo{
    public static void main(String[] args){
// Создание объектов:
        MyObjs a=new MyObjs(1);
        MyObjs b=new MyObjs(-3,5);
        MyObjs c=new MyObjs(b);
// Вычисление "суммы" объектов:
        c=a.getSum(b);
// Проверка результата:
        c.show();
// Изменение объекта:
        a.add(c);
// Проверка результата:
        a.show();
    }
}