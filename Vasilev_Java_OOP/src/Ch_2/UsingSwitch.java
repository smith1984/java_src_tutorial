package Ch_2;

class UsingSwitch{
    public static void main(String[] args){
        char s='П';
        System.out.print("Фамилия пользователя: ");
// Инструкция выбора:
        switch(s){
            case 'И':
                System.out.println("Иванов");
                break;
            case 'П':
                System.out.println("Петров");
                break;
            case 'С':
                System.out.println("Сидоров");
                break;
            default:
                System.out.println("Не определена");
        }
        System.out.println("Программа завершила работу!");
    }
}