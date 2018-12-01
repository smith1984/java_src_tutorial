package Ch_5;

class Vector{
    // Поле - ссылка на вектор (массив):
    private double[] vect=new double[3];
    // Метод для определения компонентов вектора:
    void set(double x,double y,double z){
        vect[0]=x;
        vect[1]=y;
        vect[2]=z;}
    // Метод для определения компонентов вектора:
    void set(double[] params){
        for(int i=0;i<3;i++)
            vect[i]=params[i];}
    void set(){
        set(0,0,0);}
    // Метод для отображения компонентов вектора:
    void show(){
        double[] x=new double[3];
        for(int i=0;i<3;i++)
            x[i]=Math.round(vect[i]*100)/100.0;
        System.out.print("<"+x[0]+";"+x[1]+";"+x[2]+">");}
    // Метод для отображения компонентов вектора:
    void show(char s){
        show();
        System.out.print(s);}
    // Метод для вычисления суммы векторов:
    Vector plus(Vector b){
        Vector t=new Vector();
        for(int i=0;i<3;i++)
            t.vect[i]=vect[i]+b.vect[i];
        return t;}
    // Метод для вычисления разности векторов:
    Vector minus(Vector b){
        Vector t=new Vector();
        for(int i=0;i<3;i++)
            t.vect[i]=vect[i]-b.vect[i];
        return t;}
    // Метод для вычисления произведения вектора на число:
    Vector prod(double x){
        Vector t=new Vector();
        for(int i=0;i<3;i++)
            t.vect[i]=vect[i]*x;
        return t;}
    // Метод для вычисления скалярного произведения векторов:
    double prod(Vector b){
        double x=0;
        for(int i=0;i<3;i++)
            x+=vect[i]*b.vect[i];
        return x;}
    // Метод для вычисления векторного произведения векторов:
    Vector vprod(Vector b){
        Vector t=new Vector();
        for(int i=0;i<3;i++)
            t.vect[i]=vect[(i+1)%3]*b.vect[(i+2)%3]-vect[(i+2)%3]*b.vect[(i+1)%3];
        return t;}
    // Метод для вычисления смешанного произведения векторов:
    double mprod(Vector b,Vector c){
        return vprod(b).prod(c);}
    // Метод для деления вектора на число:
    Vector div(double x){
        Vector t=new Vector();
        for(int i=0;i<3;i++)
            t.vect[i]=vect[i]/x;
        return t;}
    // Метод для вычисления модуля вектора:
    double module(){
        return Math.sqrt(prod(this));}
    // Метод для вычисления угла между векторами (в радианах):
    double ang(Vector b){
        double z;
        z=prod(b)/module()/b.module();
        return Math.acos(z);}
    // Метод для вычисления угла между векторами (в градусах):
    double angDeg(Vector b){
        return Math.toDegrees(ang(b));}
    // Метод для вычисления площади параллелограмма:
    double square(Vector b){
        Vector t;
        t=vprod(b);
        return t.module();}
    // Конструктор класса:
    Vector(double[] params){
        set(params);}
    // Конструктор класса:
    Vector(double x,double y,double z){
        set(x,y,z);}
    // Конструктор класса:
    Vector(){
        set();}
}
class VectorDemo{
    public static void main(String[] args){
        Vector a=new Vector(1,0,0);
        Vector b=new Vector(new double[]{0,1,0});
        Vector c;
        System.out.println("Векторное произведение:");
        (c=a.vprod(b)).show('\n');
        System.out.println("Смешанное произведение: "+a.mprod(b,c));
        System.out.println("Линейная комбинация векторов:");
        a.prod(3).plus(b.div(2)).minus(c).show('\n');
        a.set(4,0,-3);
        b.set(0,10,0);
        System.out.println("Угол между векторами (в градусах): "+a.angDeg(b));
        System.out.println("Площадь параллелограмма: "+a.square(b));}
}