package Ch_6;

// Суперкласс:
class Compl{
    // Действительная и мнимая части числа:
    double Re,Im;
    // Метод для вычисления суммы комплексных чисел:
    Compl sum(Compl obj){
        Compl tmp=new Compl();
        tmp.Re=Re+obj.Re;
        tmp.Im=Im+obj.Im;
        return tmp;}
    // Метод для вычисления произведения комплексных чисел:
    Compl prod(Compl obj){
        Compl tmp=new Compl();
        tmp.Re=Re*obj.Re-Im*obj.Im;
        tmp.Im=Im*obj.Re+Re*obj.Im;
        return tmp;}
    // Метод перегружен для вычисления произведения
// комплексного и действительного чисел:
    Compl prod(double x){
        Compl tmp=new Compl();
        tmp.Re=Re*x;
        tmp.Im=Im*x;
        return tmp;}
    // Метод для отображения полей объекта:
    void show(){
        System.out.println("Действительная часть Re="+Re);
        System.out.println("Мнимая часть Im="+Im);}
    // Конструктор без аргумента:
    Compl(){
        Re=0;
        Im=0;}
    // Конструктор с одним аргументом:
    Compl(double x){
        Re=x;
        Im=0;}
    // Конструктор с двумя аргументами:
    Compl(double x,double y){
        Re=x;
        Im=y;}
    // Конструктор создания копии:
    Compl(Compl obj){
        Re=obj.Re;
        Im=obj.Im;}
}
// Подкласс:
class ComplNums extends Compl{
    // Количество слагаемых ряда:
    private int n;
    // Метод для вычисления комплексной экспоненты:
    ComplNums CExp(){
// Начальное значение - объект суперкласса:
        Compl tmp=new Compl(1);
// Начальная добавка - объект суперкласса:
        Compl q=new Compl(this);
// Индексная переменная:
        int i;
// Вычисление ряда:
        for(i=1;i<=n;i++){
            tmp=tmp.sum(q);
            q=q.prod(this).prod(1.0/(i+1));}
// Результат - объект подкласса:
        return new ComplNums(tmp);}
    //Конструктор суперкласса без аргументов:
    ComplNums(){
        super();
        n=100;}
    // Конструктор суперкласса с одним аргументом:
    ComplNums(double x){
        super(x);
        n=100;}
    // Конструктор суперкласса с двумя аргументами:
    ComplNums(double x,double y){
        super(x,y);
        n=100;}
    // Конструктор суперкласса с тремя аргументами:
    ComplNums(double x,double y,int m){
        super(x,y);
        n=m;}
    // Конструктор создания объекта подкласса
// на основе объекта суперкласса:
    ComplNums(Compl obj){
        super(obj);
        n=100;}
    // Конструктор создания копии для суперкласса:
    ComplNums(ComplNums obj){
        super(obj);
        n=obj.n;}
}
class ComplExtendsDemo{
    public static void main(String[] args){
        ComplNums z=new ComplNums(2,3);
// Вычисление комплексной экспоненты:
        z.CExp().show();}
}