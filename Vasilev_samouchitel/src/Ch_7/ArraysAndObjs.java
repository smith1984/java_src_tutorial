package Ch_7;

// Первый класс с полем - целочисленным массивом:
class First{
    // Поле класса - переменная массива:
    int[] nums;
    // Конструктор класса:
    First(int n){
// Создание массива и связывание его
// с полем - переменной массива:
        nums=new int[n];
// Первый и второй элементы массива:
        nums[0]=1;
        nums[1]=1;
// Заполнение массива числами Фибоначчи:
        for(int i=2;i<n;i++){
            nums[i]=nums[i-1]+nums[i-2];}
    }
    // Метод для отображения содержимого массива:
    void show(){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");}
        System.out.println();}
}
// Второй класс:
class Second{
    // Поле - объектная переменная класса First:
    First obj;
    // Конструктор класса:
    Second(int n){
// Создание объекта и связывание его
// с полем - объектной переменной:
        obj=new First(n);
// Отображение содержимого поля - объекта:
        obj.show();}
}
public class ArraysAndObjs{
    public static void main(String[] args){
// Количество элементов в массиве объектов:
        int count=5;
// Создание массива объектных переменных:
        Second[] ObjAr=new Second[count];
// Связывание объектных переменных - элементов массива
// с создаваемыми объектами класса Second:
        for(int i=0;i<ObjAr.length;i++){
            ObjAr[i]=new Second(3*i+4);}}
}
