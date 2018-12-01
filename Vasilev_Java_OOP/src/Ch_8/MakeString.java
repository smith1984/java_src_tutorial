package Ch_8;

class MakeString{
    public static void main(String args[]){
        char symbs[]={'J','a','v','a'};
        String strA=new String(symbs);
        String strB=new String(strA);
        System.out.println(strA);
        System.out.println(strB);}
}