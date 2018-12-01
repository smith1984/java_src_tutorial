package Ch_6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by ito on 21.03.17.
 */
public class DatePart {
    private Date fromDate = null;
    private SimpleDateFormat format = null;

    public DatePart(Date anyDate){
        fromDate = anyDate;
        format = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy", Locale.getDefault());
    }

    public int getDay(){
        format.applyPattern("d");
        return Integer.parseInt(format.format(fromDate));
    }

    public int getMonth(){
        format.applyPattern("M");
        return Integer.parseInt(format.format(fromDate));
    }

    public int getYear(){
        format.applyPattern("Y");
        return Integer.parseInt(format.format(fromDate));
    }

    public int getHour(){
        format.applyPattern("h");
        return Integer.parseInt(format.format(fromDate));
    }

    public int getMinute(){
        format.applyPattern("m");
        return Integer.parseInt(format.format(fromDate));
    }





}
