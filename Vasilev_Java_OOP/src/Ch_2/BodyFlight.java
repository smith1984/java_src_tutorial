package Ch_2;

class BodyFlight{
    public static void main(String args[]){
// Ускорение свободного падения (м/с^2):
        double g=9.8;
// Масса (кг):
        double m=0.1;
// Начальная скорость (м/с):
        double V=100;
// Угол в градусах:
        double alpha=60;
// Уровни воздушных зон (м):
        double H1=100,H2=300;
// Коэффициенты силы сопротивления (Нс/м и Hc^2/м^2):
        double gamma1=0.0001,gamma2=0.0001;
// Интервал времени (сек):
        double dt=1E-6;
// Координаты и скорость (м и м/с)
        double Xn=0,Yn=0,Vn,Un;
// Проекция силы сопротивления (Н):
        double Fx,Fy;
// Время полета (сек), дальность (м) и высота (м):
        double Tmax,Smax,Hmax=0;
// Индикатор высоты (номер зоны):
        int height;
// Перевод угла в радианы:
        alpha=Math.toRadians(alpha);
// Проекции начальной скорости:
        Vn=V*Math.cos(alpha);
        Un=V*Math.sin(alpha);
        for(int n=1;true;n++){
// Координата по вертикали:
            Yn+=Un*dt;
// Критерий завершения вычислений и расчетные параметры:
            if(Yn<0){
                Tmax=Math.round((n-1)*dt*100)/100.0;
                Smax=Math.round(Xn*100)/100.0;
                Hmax=Math.round(Hmax*100)/100.0;
                break;}
// Координата по горизонтали:
            Xn+=Vn*dt;
// Максимальная высота:
            if(Yn>Hmax) Hmax=Yn;
// Вычисление номера зоны:
            height=Yn<H1?1:Yn<H2?2:3;
// Сила сопротивления:
            switch(height){
                // Первая зона:
                case 1:
                    Fx=gamma1*Vn*Math.sqrt(Vn*Vn+Un*Un);
                    Fy=gamma1*Un*Math.sqrt(Vn*Vn+Un*Un);
                    break;
                // Вторая зона:
                case 2:
                    Fx=gamma2*Vn;
                    Fy=gamma2*Un;
                    break;
                // Третья зона:
                default:
                    Fx=0;
                    Fy=0;
            }
// Проекция скорости по горизонтали:
            Vn+=-Fx*dt/m;
// Проекция скорости по вертикали:
            Un+=-g*dt-Fy*dt/m;}
// Вывод на экран результатов:
        System.out.println("Время полета тела Tmax="+Tmax+" секунд.");
        System.out.println("Дальность полета тела Smax="+Smax+" метров.");
        System.out.println("Максимальная высота подъема тела Hmax="+Hmax+" метров.");}
}