package MyFirstProject;

/**
 * Created by ito on 09.03.17.
 */
public class TemperatureConverter {
    public static String convertTemp (double temperature, char convertTo){
        String str = null;
        if (convertTo =='C')
            str = temperature + " по Фаренгейту это " + (temperature - 32)*5/9 + " по Цельсию";
        if (convertTo =='F')
            str = temperature + " по Цельсию это " + (temperature*9/5 + 32) + " по Фаренгейту";
        return str;
    }
}
