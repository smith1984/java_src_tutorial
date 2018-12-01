package Ch_8;

class StringReplace{
    public static void main(String args[]){
        String str="Мы программируем на С++";
        String s,s1,s2,s3,s4;
// Извлечение подстроки:
        s=str.substring(3,21);
        System.out.println(s);
// Объединение строк:
        s1=str.concat(" и Java");
        System.out.println(s1);
// Замена символов:
        s2=s1.replace(' ','_');
        System.out.println(s2);
// Перевод в нижний регистр:
        s3=s1.toLowerCase();
        System.out.println(s3);
// Перевод в верхний регистр:
        s4=s1.toUpperCase();
        System.out.println(s4);
    }}