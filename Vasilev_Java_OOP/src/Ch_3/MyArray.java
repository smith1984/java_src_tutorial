package Ch_3;

class MyArray{
    public static void main(String[] args){
// »ндексна¤ переменна¤ и размер массива:
        int i,n;
// ќбъ¤вление переменной массива:
        int[] data;
// »нициализаци¤ массива:
        data=new int[]{3,8,1,7};
// ƒлина второго массива:
        n=data.length;
// ќбъ¤вление второго массива:
        int[] nums=new int[n];
// «аполнение второго массива:
        for(i=0;i<n;i++){
            nums[i]=2*data[i]-3;
            System.out.println("nums["+i+"]="+nums[i]);}
    }
}