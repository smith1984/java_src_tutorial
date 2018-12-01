package Ch_4;

class Bernoulli{
    // Количество опытов (испытаний) в схеме:
    private int n;
    // Вероятность успеха:
    private double p;
    // Результат испытаний:
    private boolean[] test;
    // Метод для определения параметров схемы:
    public void setAll(int n,double p){
        if(n>=0) this.n=n;
        else n=0;
        if(p>=0&&p<=1) this.p=p;
        else this.p=0;
        test=new boolean[n];
        for(int i=0;i<n;i++){
            if(Math.random()<=p) test[i]=true;
            else test[i]=false;}
    }
    // Подсчет количества успехов:
    private int getVal(){
        int count,i;
        for(i=0,count=0;i<n;i++) if(test[i]) count++;
        return count;}
    // Отображение основных характеристик:
    public void show(){
        System.out.println("СТАТИСТИКА ДЛЯ СХЕМЫ БЕРНУЛЛИ");
        System.out.println("Испытаний: "+n);
        System.out.println("Вероятность успеха: "+p);
        System.out.println("Успехов: "+getVal());
        System.out.println("Неудач: "+(n-getVal()));
        System.out.println("Мат. ожидание: "+n*p);
        System.out.println("Станд. отклонение: "+Math.sqrt(n*p*(1-p)));}
}
class BernoulliTest{
    public static void main(String args[]){
// Создание объекта:
        Bernoulli obj=new Bernoulli();
// Определение количества испытаний и вероятности успеха:
        obj.setAll(10000,0.36);
// Отображение результата:
        obj.show();
    }}