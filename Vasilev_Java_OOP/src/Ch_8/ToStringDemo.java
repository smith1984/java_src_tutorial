package Ch_8;

class ComplNums{
    // Поля класса:
    double Re;
    double Im;
    // Конструктор:
    ComplNums(double x,double y){
        Re=x;
        Im=y;}
    // Переопределение метода toString():
    public String toString(){
        String result="",sign="",ImPart="",RePart="";
        if(Re!=0||(Re==0&&Im==0)) RePart+=Re;
        if((Im>0)&&(Re!=0)) sign+="+";
        if(Im!=0) ImPart+=Im+"i";
        result=RePart+sign+ImPart;
        return result;}
}
class toStringDemo{
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j+=2){
                ComplNums z=new ComplNums(i-2,j-3);
// Автоматический вызов метода toString():
                System.out.println(z);
            }
        }
    }
}
