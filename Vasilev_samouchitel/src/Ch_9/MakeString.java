package Ch_9;

public class MakeString{
    public static void main(String[] args){
// Текст на основе литерала:
        String str1=new String("Текстовый литерал");
        System.out.println(str1);
// Текст на основе объекта:
        String str2=new String(str1);
        System.out.println(str2);
// Пустая строка:
        String str3=new String();
        System.out.println(str3);
// Текст на основе символьного массива:
        char[] symbs=new char[]{'М','а','с','с','и','в'};
        String str4=new String(symbs,1,4);
        System.out.println(str4);
// Текст на основе числового массива:
        byte[] nums=new byte[]{78,97,109,98,101,114,115};
        String str5=new String(nums);
        System.out.println(str5);
    }}
