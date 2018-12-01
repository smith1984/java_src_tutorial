package Ch_8;

class StringBufferDemo{
    public static void main(String args[]){
// Базовая строка - объект класса StringBuffer:
        StringBuffer str=new StringBuffer("Мы программируем на С++");
// Длина строки:
        System.out.println(str.length());
// Размер строки (максимальная длина в символах):
        System.out.println(str.capacity());
// Вставка подстроки:
        str.insert(20,"Java и ");
// Вывод строки на экран:
        System.out.println(str);
// Замена подстроки:
        str.replace(27,30,"Pascal");
// Вывод подстроки на экран:
        System.out.println(str);
// Инверсия строки:
        str.reverse();
// Вывод строки на экран:
        System.out.println(str);}
}