/*
java Time and Date examples
*/


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeDemo {
    public static void TodayInFormat() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
        String dateString = format.format(new Date());
        System.out.println(dateString);
    }

    public static void AddDaysToDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
        Date currentDate = new Date();
        System.out.println(format.format(currentDate));
        LocalDateTime ldt = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime ldtm3 = ldt.minusDays(3);       
        Date currentMinus3 = Date.from(ldtm3.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(format.format(currentMinus3));
        LocalDateTime ldtp3 = ldt.plusDays(3);       
        Date currentPlus3 = Date.from(ldtp3.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(format.format(currentPlus3));
    }

    public static void main(String args[]) {
        TodayInFormat();
        AddDaysToDate();
    }
}