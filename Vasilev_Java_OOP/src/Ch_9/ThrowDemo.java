package Ch_9;

class ThrowDemo{
    static void demoproc(){
        try{
// Создание объекта исключения:
            NullPointerException ExObj=new NullPointerException("Ошибка!");
            throw ExObj;  // выбрасывание исключения
        }catch(NullPointerException e){
            System.out.println("Перехват исключения в методе demoproc!");
            throw e;                    // повторное выбрасывание исключения
        }}
    public static void main(String args[]){
        try{
            demoproc();
        }catch(NullPointerException e){
            System.out.println("Повторный перехват: "+e);}
        System.out.println("Работа программы завершена!");}
}
