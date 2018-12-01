package Ch_2;

class UsingIf2{
    public static void main(String[] args){
        int x=3,y=6,z;
// Условная инструкция:
        if(x!=0){
            z=y/x;
            System.out.println("Значение z="+z);
// Завершение программы:
            return;}
        System.out.println("Деление на нуль!");
    }
}