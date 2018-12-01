package Ch_6;

/**
 * Created by ito on 15.03.17.
 */
class Car
{
    public final static String color = "Красный" ;
    public final static String bodyType = "Купе" ;
    public static String accelerate()
    {
        String motion = "Ускоряется..." ;
        return motion ;
    }
}
class FirstObject
{
    public static void main ( String[] args ) {
        System.out.println( "Цвет " + Car.color ) ;
        System.out.println( "Тип кузова " + Car.bodyType ) ;
        System.out.println( Car.accelerate() ) ;
        Car Porsche = new Car() ;
        System.out.println( "Цвет Porsche " + Porsche.color ) ;
        System.out.println( "Тип кузова Porsche " + Porsche.bodyType );
        System.out.println( Porsche.accelerate() ) ;
    }
}