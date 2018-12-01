package Ch_1;

class CharsAndInts{
    public static void main(String args[]){
// Кодовое число:
        int number;
// Исходные буквы для кодирования:
        char symbA='А',symbB='ы';
// Буквы после декодирования:
        char SymbA,SymbB;
// Вычисление кода:
        number=((int)symbB<<16)+((int)symbA);
// Вывод исходных данных и кода:
        System.out.println("Исходные буквы: \'"+symbA+"\' и \'"+symbB+"\'.");
        System.out.println("Кодовое число: "+number);
// Декодирование:
        SymbB=(char)(number>>>16);
        SymbA=(char)(number^((int)SymbB<<16));
// Вывод результата декодирования:
        System.out.println("Обратное преобразование:");
        System.out.println("Буквы \'"+SymbA+"\' и \'"+SymbB+"\'.");}
}