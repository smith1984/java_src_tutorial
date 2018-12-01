package Ch_2;

class UsingSwitch2{
    public static void main(String[] args){
        char s='п';
        System.out.print("Фамилия пользователя: ");
// Инструкция вывода:
        switch(s){
            case 'И':
            case 'и':
                System.out.println("Иванов");
                break;
            case 'П':
            case 'п':
                System.out.println("Петров");
                break;
            case 'С':
            case 'с':
                System.out.println("Сидоров");
                break;
            default:
                System.out.println("Не определена");
        }
        System.out.println("Программа завершила работу!");
    }
}
