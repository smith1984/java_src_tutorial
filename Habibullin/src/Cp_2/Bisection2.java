package Cp_2;

class Bisection2{
    private static final double EPS = 1e-8; // Константа класса.
    private double a = 0.0, b = 1.5, root; // Закрытые поля экземпляра.
    public double getRoot(){return root;} // Метод доступа к полю root.
    private double f(double x){
        return x*x*x - 3*x*x + 3; // Можно вернуть и что-нибудь другое.
    }
    private void bisect(){ // Параметров у метода нет —
// метод работает с полями экземпляра.
        double y = 0.0; // Локальная переменная — не поле.
        do{
            root = 0.5 *(a + b);
            y = f(root);
            if (Math.abs(y) < EPS) break;
// Корень найден. Выходим из цикла.
// Если на концах отрезка [a; root] функция имеет разные знаки:
            if (f(a) * y < 0.0) b = root;
// значит, корень здесь, и мы переносим точку b в точку root.
// В противном случае:
            else a = root;
// переносим точку a в точку root
// Продолжаем до тех пор, пока [a; b] не станет мал.
        } while(Math.abs(b-a) >= EPS);
    }
    public static void main(String[] args){
        Bisection2 b2 = new Bisection2();
        b2.bisect();
        System.out.println("x = " +
                b2.getRoot() + // Обращаемся к корню через метод доступа.
                ", f() = " +b2.f(b2.getRoot()));
    }
}