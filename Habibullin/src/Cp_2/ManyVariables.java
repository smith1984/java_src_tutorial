package Cp_2;

class ManyVariables{
    static int x = 9, y; // Статические переменные — поля класса.
    // Они известны во всех методах и блоках класса.
// Поле y получает значение 0.
    static{ // Блок инициализации статических переменных.
// Выполняется один раз при первой загрузке класса
// после инициализаций в объявлениях переменных.
        x = 99; // Этот оператор выполняется в блоке вне всякого метода!
    }
    int a = 1, p; // Нестатические переменные — поля экземпляра.
    // Известны во всех методах и блоках класса,
// в которых они не перекрыты другими переменными
// с тем же именем.
// Поле p получает значение 0.
    { // Блок инициализации экземпляра.
// Выполняется при создании каждого экземпляра
// после инициализаций при объявлениях переменных.
        p = 999; // Этот оператор выполняется в блоке вне всякого метода!
    }
    static void f(int b){ // Параметр метода b — локальная переменная,
// известная только внутри метода.
        int a = 2; // Это вторая переменная с тем же именем "a".
// Она известна только внутри метода f()
// и здесь перекрывает первую "a".
        int c; // Локальная переменная, известна только в методе f().
        // Не получает никакого начального значения
// и должна быть определена перед применением.
        { //int c = 555; // Ошибка! Попытка повторного объявления.
            int x = 333; // Локальная переменная, известна только в этом блоке.
        }
// Здесь переменная x уже неизвестна.
        for (int d = 0; d < 10; d++){
// Переменная цикла d известна только в цикле.
            //int a = 4; // Ошибка!
            int e = 5; // Локальная переменная, известна только в цикле for.
            e++; // Инициализируется при каждом выполнении цикла.
            System.out.println("e = " + e); // Выводится всегда "e = 6".
        }
// Здесь переменные d и e неизвестны.
    }
    public static void main(String[] args){
        int a = 9999; // Локальная переменная, известна только внутри
// метода main().
        f(a);
    }
}