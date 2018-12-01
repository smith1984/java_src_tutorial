package Ch_3;

class Bubble{
    public static void main(String args[]){
// Индексны переменные и размер массива:
        int m,k,s,n=15;
// Создание массива:
        int[] nums=new int[n];
        System.out.println("Исходный массив:");
// Заполнение массива и вывод на экран:
        for(k=0;k<n;k++){
// Элементы - случайные числа:
            nums[k]=(int)(5*n*Math.random());
            System.out.print(nums[k]+" ");}
// Сортировка массива:
        for(m=1;m<n;m++){
            for(k=0;k<n-m;k++){
                if(nums[k]>nums[k+1]){
                    s=nums[k];
                    nums[k]=nums[k+1];
                    nums[k+1]=s;}
            }}
// Результат:
        System.out.println("\nМассив после сортировки:");
        for(k=0;k<n;k++){
            System.out.print(nums[k]+" ");}
    }}
