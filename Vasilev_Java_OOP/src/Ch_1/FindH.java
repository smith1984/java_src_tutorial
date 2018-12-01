package Ch_1;

class FindH{
    public static void main(String args[]){
// Гравитационная постоянная (Нм^2/кг^2):
        double G=6.672E-11;
// Масса Земли (кг):
        double M=5.96e24;
// Радиус Земли:
        double R=6.37E6;
// Период обращения спутника (часы):
        double T=1.5;
// Высота над поверхностью:
        double H;
// Перевод в секунды:
        T*=3600;
// Высота в метрах:
        H=Math.pow(G*M*T*T/4/Math.PI/Math.PI,(double)1/3)-R;
// Высота в километрах с точностью до тысячных:
        H=(double)(Math.round(H))/1000;
// Вывод результата на экран:
        System.out.println("Высота орбиты спутника: "+H+" км");}
}
