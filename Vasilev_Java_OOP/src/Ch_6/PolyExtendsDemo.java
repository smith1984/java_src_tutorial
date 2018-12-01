package Ch_6;

// Суперкласс:
class PolyBase{
    // Коэффициенты полинома:
    double[] a;
    // Метод для вычисления значения полинома в точке:
    double value(double x){
        double s=0,q=1;
        for(int i=0;i<a.length;i++){
            s+=a[i]*q;
            q*=x;}
        return s;}
    // Степень полинома:
    int power(){
        for(int i=a.length-1;i>0;i--){
            if(a[i]!=0) return i;}
        return 0;}
    // Отображение коэффициентов и степени полинома:
    void show(){
        System.out.println("Коэффициенты полинома:");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"  ");
        System.out.print("\nСтепень полинома: ");
        System.out.println(power()+".\n");}
}
// Подкласс:
class PolyDerive extends PolyBase{
    // Метод для вычисления произведения полиномов:
    PolyBase prod(PolyBase Q){
        int i,j,n;
        n=power()+Q.power()+1;
        PolyBase tmp=new PolyBase();
        tmp.a=new double[n];
        for(i=0;i<=power();i++){
            for(j=0;j<=Q.power();j++){
                tmp.a[i+j]+=a[i]*Q.a[j];}
        }
        return tmp;}
    // Отображение параметров полинома и значения в точке:
    void show(double x){
        System.out.println("Аргумент полинома: "+x);
        System.out.println("Значение полинома: "+value(x));
        show();}
    PolyDerive(PolyBase obj){
        a=new double[obj.a.length];
        for(int i=0;i<a.length;i++)
            a[i]=obj.a[i];}
}
// Подкласс для разложения в ряд Тейлора произведения:
class Taylor extends PolyDerive{
    void show(){
        System.out.println("Ряд Тейлора!");
        super.show();
    }
    Taylor(PolyBase P,PolyBase Q){
        super(P);
        PolyBase tmp=prod(Q);
        for(int i=0;i<a.length;i++)
            a[i]=tmp.a[i];}
}
class PolyExtendsDemo{
    public static void main(String[] args){
// Исходные полиномы:
        PolyBase P=new PolyBase();
        PolyBase Q=new PolyBase();
        PolyBase R;
        P.a=new double[]{1,-2,4,1,-3};
        Q.a=new double[]{2,-1,3,0,4};
// Произведение полиномов:
        R=new PolyDerive(P).prod(Q);
        R.show();
        new PolyDerive(P).show(-1);
// Ряд Тейлора:
        new Taylor(P,Q).show();
    }}
