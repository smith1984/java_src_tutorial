package Ch_3;

class ArrayDemo{
    public static void main(String[] args){
// Индексные переменные и размер массива:
        int i,j,n;
// Создание массива (второй размер не указан):
        int[][] nums=new int[5][];
// Определение первого размера массива:
        n=nums.length;
// Цикл для создания треугольного массива:
        for(i=0;i<n;i++){
            nums[i]=new int[i+1];}
// Вложенные циклы для заполнения элементов массива:
        for(i=0;i<n;i++){
            for(j=0;j<nums[i].length;j++){
// Присваивание значения элементу массива:
                nums[i][j]=10*(i+1)+j+1;
// Вывод значения на экран:
                System.out.print(nums[i][j]+" ");}
// Переход на новую строку:
            System.out.println();}
    }
}
