package Ch_2;

class SqEquation{
    public static void main(String args[]){
// Параметры уравнения:
        double a=2,b=-3,c=1;
// Корни и дискриминант:
        double x1,x2,D;
// Вывод параметров уравнения на экран:
        System.out.println("Уравнение вида ax^2+bx+c=0. Параметры:");
        System.out.println("a="+a+"\nb="+b+"\nc="+c);
// Если a равно 0:
        if(a==0){System.out.println("Линейное уравнение!");
            // Если a равно 0 и b не равно 0:
            if(b!=0){System.out.println("Решение x="+(-c/b)+".");}
            // Если a, b, и c равны нулю:
            else{if(c==0){System.out.println("Решение - любое число.");}
            // Если a и b равны нулю, а c - нет:
            else{System.out.println("Решений нет!");}
            }
        }
// Если a не равно 0:
        else{System.out.println("Квадратное уравнение!");
            // Дискриминант (значение):
            D=b*b-4*a*c;
            // Отрицательный дискриминант:
            if(D<0){System.out.println("Действительных решений нет!");}
            // Нулевой дискриминант:
            else{if(D==0){System.out.println("Решение x="+(-b/2/a));}
            // Положительный дискриминант:
            else{x1=(-b-Math.sqrt(D))/2/a;
                x2=(-b+Math.sqrt(D))/2/a;
                System.out.println("Два решения: x="+x1+" и x="+x2+".");
            }
            }
        }
// Завершение работы программы:
        System.out.println("Работа программы завершена!");}
}