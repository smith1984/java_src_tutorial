package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class ExceptionDemo {
    private static double divide (double divedend, double divisor) throws DivisionByZeroException {
        if (divisor == 0)
            throw new DivisionByZeroException();
        return divedend/divisor;
    }

    public static void main (String[] args){
        try{
        divide(8,0);
        }
        catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
    }
}

class DivisionByZeroException extends Exception{
    public String getMessage(){
        return "Деление на ноль запрещено";
    }
}
