package Ch_11;

// Импорт пакета:
import javax.swing.*;
class MyOptionPane{
    public static void main(String args[]){
// Тексовое поле (имя):
        String name;
// Числовое поле (возраст):
        int age;
// Вопрос:
        System.out.println("Как Вас зовут?");
// Открываем диалоговое окно:
        name=JOptionPane.showInputDialog("Укажите Ваше имя");
// Выводим резльтат считывания:
        System.out.println("Считано имя: "+name);
// Приветствие:
        System.out.println("Добрый день, "+name+"!");
// Вопрос:
        System.out.println("Сколько Вам лет?");
// Открываем диалоговое окно:
        age=Integer.parseInt(JOptionPane.showInputDialog("Укажите Ваш возраст"));
// Выводим результат считывания:
        System.out.println("Считан возраст: "+age+" лет.");
// Сообщение:
        System.out.println(name+", Вам "+age+" лет!");
// Завершение всех потоков:
        System.exit(0);}
}
