package Ch_6;

/**
 * Created by ito on 15.03.17.
 */
public class Car_3 {
    private String maker ;
    private String color ;
    private String bodyType ;

    public Car_3()
    {
        maker = "Porsche" ;
        color = "Серебристый" ;
        bodyType = "Купе" ;
    }

    private String accelerate()
    {
        String motion = "Ускоряется..." ;
        return motion ;
    }

    public void setCar( String brand , String paint , String style )
    {
        maker = brand ;
        color = paint ;
        bodyType = style ;
    }
    public void getCar(){
        System.out.println( maker + " цвет " + color ) ;
        System.out.println( maker + " тип кузова " + bodyType ) ;
        System.out.println( maker + " " + accelerate() + "\n" ) ;
    }

}

class Constructor
{
    public static void main ( String[] args ) {
        Car_3 Porsche = new Car_3() ;
        Porsche.getCar() ;

        Car_3 Ferrari = new Car_3() ;
        Ferrari.setCar( "Ferrari" , "Красный" , "Спортивный" ) ;
        Ferrari.getCar() ;
    }
}
