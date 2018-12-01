package Ch_3;

class MyArrayDemo2{
    public static void main(String[] args){
// Объявление массивов:
        int[] nums=new int[]{1,2,3,4,5};
        int[] data=new int[]{1,2,3,4,5};
// Комментирование следующей команды можно отменить:
// data=nums;
// Проверка совпадения ссылок:
        if(data==nums){
            System.out.println("Совпадающие массивы!");
            return;}
// Проверка размеров массивов:
        if(data.length!=nums.length){
            System.out.println("Разные массивы!");
            return;}
// Поэлементная проверка массивов:
        for(int i=0;i<data.length;i++){
            if(data[i]!=nums[i]){
                System.out.println("Несовпадающие элементы!");
                return;}}
        System.out.println("Одинаковые массивы!");
    }}
