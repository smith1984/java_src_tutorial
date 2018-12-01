package Ch_11;

// Подключение пакетов:
import java.io.*;
import javax.swing.*;
class FindFellow{
    public static void main(String args[]) throws IOException{
// Текстовое поле (имя файла):
        String fileName;
// Текстовое поле (фамилия сотрудника):
        String name;
// Текстовое поле (для считывания текста):
        String s;
// Считывание имени файла:
        fileName=JOptionPane.showInputDialog("Укажите имя файла:");
        try{
// Создание файлового потока ввода:
            FileInputStream fin=new FileInputStream("Files/"+fileName);
// Создание буферизованного символьного потока (из файла):
            BufferedReader br=new BufferedReader(new InputStreamReader(fin));
// Считывание фамилии сотрудника:
            name=JOptionPane.showInputDialog("Укажите фамилию сотрудника:");
// Формально "бесконечный" цикл:
            while(true){
// Считывание строки из файла:
                s=br.readLine();
                try{
                    if(s.equalsIgnoreCase(name)){// Вывод "послужного списка"
                        System.out.println("Фамилия   : "+name);
                        System.out.println("Имя       : "+br.readLine());
                        System.out.println("Отчество  : "+br.readLine());
                        System.out.println("Возраст   : "+br.readLine());
                        System.out.println("Тел.      : "+br.readLine());
                        break;}
                }catch(NullPointerException e){// Обработка исключения
                    System.out.println("Такого сотрудника нет!");
// Выход из цикла:
                    break;}
            }
// Закрываем файловый поток:
            fin.close();
        }catch(FileNotFoundException e){// Обработка исключения
            System.out.println("Ошибка доступа к файлу: "+e);}
// Завершение всех потоков:
        System.exit(0);}}
