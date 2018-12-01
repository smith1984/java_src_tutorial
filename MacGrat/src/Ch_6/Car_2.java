package Ch_6;

/**
 * Created by ito on 15.03.17.
 */
public class Car_2 {
    private String maker ;
    private String color ;
    private String bodyType ;

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

class SafeInstance
{
    public static void main ( String[] args) {
        Car_2 Porsche = new Car_2() ;
        Porsche.setCar( "Porsche" , "Красный" , "Купе" ) ;
        Porsche.getCar();

        Car_2 Bentley = new Car_2() ;
        Bentley.setCar( "Bentley" , "Зеленый" , "Седан" ) ;
        Bentley.getCar() ;
    }
}
