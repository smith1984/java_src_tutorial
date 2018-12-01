package Ch_3;

class MyArrayDemo{
    public static void main(String[] args){
        int i;
        int[] nums=new int[10];
        int[] data=new int[20];
        for(i=0;i<10;i++){
            nums[i]=2*i+1;
            data[i]=2*i;
            data[i+10]=2*(i+10);}
        data=nums;
        for(i=0;i<data.length;i++)
            System.out.print(data[i]+" ");}
}
