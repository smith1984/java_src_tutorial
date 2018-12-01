package Ch_7;

import javax.swing.*;
// Класс со статическим полем и статическим методом:
class MyMath{
    // Статическая константа:
    final static double PI=3.14159265;
    // Статический метод для вычисления синуса:
    static double sin(double x,int n){
// Локальные переменные:
        double s=0,q=x;
        int i;
// Оператор цикла для вычисления ряда Тейлора для синуса:
        for(i=1;i<=n;i++){
            s+=q;
            q*=(-1)*x*x/(2*i)/(2*i+1);}
// Результат:
        return s+q;}
}
// Класс с главным методом:
class StatMethDemo{
    public static void main(String[] args){
// Текст для отображения в окне сообщения:
        String text="Значения ряда Тейлора для синуса.";
// Оператор цикла для вычисления синуса (несколько значений):
        for(int k=0;k<5;k++){
            text+="\nСлагаемых "+(k+1)+":  ";
            text+="sin(pi/4)="+MyMath.sin(MyMath.PI/4,k);}
// Отображение окна сообщения:
        JOptionPane.showMessageDialog(null,text);}
}
