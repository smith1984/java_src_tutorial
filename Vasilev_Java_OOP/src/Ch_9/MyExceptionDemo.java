package Ch_9;

// Класс исключения:
class MyException extends Exception{
    private double min;
    private double max;
    private String error;
    // Конструктор:
    MyException(double x,double y,String str){
        min=x;
        max=y;
        error=str;}
    // Переопределение метода toString():
    public String toString(){
        return "Произошла ошибка ("+error+"): попадание в диапазон ["+min+","+max+"]";}
}
class MyExceptionDemo{
    // Метод выбрасывает исключение пользовательского типа:
    static double MyLog(double x) throws MyException{
        if(x<0||x>1) return Math.log(x*(x-1));
        else throw new MyException(0,1,"неверный аргумент");
    }
    public static void main(String args[]){
        double x=-1.2,y=1.2,z=0.5;
        try{
            System.out.println("ln("+x+")="+MyLog(x));
            System.out.println("ln("+y+")="+MyLog(y));
            System.out.println("ln("+z+")="+MyLog(z));
        }catch(MyException e){// Обработка исключения
            System.out.println(e);}
    }
}