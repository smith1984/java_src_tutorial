package Ch_8;

class getCharsDemo{
    public static void main(String args[]){
// Текстовая строка:
        String s="Пример текстовой строки – язык Java";
// Символьный массив:
        char buf[]=new char[9];
        s.getChars(s.length()-9,s.length(),buf,0);
        System.out.println(buf);
// Символ:
        char symbol;
        symbol=s.charAt(21);
        System.out.println(symbol);
// Разделитель:
        System.out.println("--------------------------");
// Массив чисел:
        byte nums[];
        nums=s.getBytes();
        for(int i=0;i<s.length();i++){
            System.out.print(nums[i]+" ");
            if((i+1)%6==0) System.out.println();}
// Разделитель:
        System.out.println("\n--------------------------");
        char chars[]=new char[s.length()];
        chars =s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') System.out.println("-->");
            else System.out.print(chars[i]+" * ");}
    }
}