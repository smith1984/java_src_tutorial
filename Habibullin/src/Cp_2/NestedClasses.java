package Cp_2;

class Nested{
    static private int pr; // Переменная pr объявлена статической,
    // чтобы к ней был доступ из статических классов A и AB.
    String s = "Member of Nested";
    // Вкладываем статический класс.
    static class A{ // Полное имя этого класса — Nested.A
        private int a = pr;
       static String s = "Member of A";
        // Во вложенный класс A вкладываем еще один статический класс.
        static class AB{ // Полное имя класса — Nested.A.AB
            private int ab = pr;
            static String s = "Member of AB";
        }
    }
    // В класс Nested вкладываем нестатический класс.
    class B{ // Полное имя этого класса — Nested.B
        private int b = pr;
        String s = "Member of B";
        // В класс B вкладываем еще один класс.
        class BC{ // Полное имя класса — Nested.B.BC
            private int bc = pr;
            String s = "Member of BC";
        }
        void f(final int i){ // Без слова final переменные i и j
// нельзя использовать в локальном классе D.
            final int j = 99;
            class D{ // Локальный класс D известен только внутри f().
                private int d = pr;
                String s = "Member of D";
                void pr(){
// Обратите внимание на то, как различаются
// переменные с одним и тем же именем "s".
                    System.out.println(s + (i+j)); // "s" эквивалентно "this.s".
                    System.out.println(B.this.s);
                    System.out.println(Nested.this.s);
                    System.out.println(Nested.A.AB.s); // Нет доступа.
                    System.out.println(A.s); // Нет доступа.
                }
            }
            D d = new D(); // Объект определяется тут же, в методе f().
            d.pr(); // Объект известен только в методе f().
        }
    }
    void m(){
        new Object(){ // Создается объект безымянного класса,
        // указывается конструктор его суперкласса.
        private int e = pr;
            void g(){
                System.out.println("From g()");
            }
        }.g(); // Тут же выполняется метод только что созданного объекта.
    }
}
public class NestedClasses{
    public static void main(String[] args){
        Nested nest = new Nested(); // Последовательно раскрываются
// три матрешки.
        Nested.A theA = new Nested.A(); // Полное имя класса и уточненная
// операция new. Но конструктор только вложенного класса.
        Nested.A.AB theAB = new Nested.A.AB(); // Те же правила.
// Операция new уточняется только одним именем.
        Nested.B theB = nest.new B(); // Еще одна матрешка.
        Nested.B.BC theBC = theB.new BC();
        theB.f(999); // Методы вызываются обычным образом.
        nest.m();
    }
}