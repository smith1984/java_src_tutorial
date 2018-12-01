package Ch_11;

// Подключение пакета:
import java.io.*;
class WriteToFile{
    public static void main(String args[]) throws IOException{
// Целочисленное поле:
        int a;
        try{
// Поток файлового вывода:
            FileOutputStream fout=new FileOutputStream("Files/mydata.txt");
// Поток файлового ввода:
            FileInputStream fin=new FileInputStream("Files/base.txt");
// Считывание из файла:
            a=fin.read();
            while(a!=-1){
// Замена пробелов символами подчеркивания:
                if(a==(int)' ') a=(int)'_';
// Запись в файл:
                fout.write(a);
// Считывание из файла:
                a=fin.read();}
// Закрыт поток вывода:
            fout.close();
// Закрыт поток ввода:
            fin.close();
        }catch(FileNotFoundException e){ // Обработка исключения "файл не найден":
            System.out.println("Нет доступа к файлу: "+e);}
// Сообщение программы:
        System.out.println("Работа программы завершена!");}
}
