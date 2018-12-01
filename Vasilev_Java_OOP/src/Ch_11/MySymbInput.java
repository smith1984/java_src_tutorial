package Ch_11;

// Подключение пакета:
import java.io.*;
class MySymbInput{
    public static void main(String args[]) throws IOException{
// Символьная переменная для записи считываемого значения:
        char symb;
// Буферизованный поток ввода:
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
// Вывод начального сообщения на экран:
        System.out.println("Введите несколько символов и нажмите <Enter>:");
        do{
// Считывание символа (с явным преобразованием типа):
            symb=(char)br.read();
// Вывод считанного символа на экран:
            System.out.println("Вы ввели: "+symb);
        }while(symb!='Ы');
    }}
