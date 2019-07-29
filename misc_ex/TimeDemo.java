/*
java string example

Here is excellent tutorial: https://www.tutorialspoint.com/java/java_strings.htm

The String class has 11 constructors that allow you to provide the initial value 
of the string using different sources, such as an array of characters.
*/
import java.text.SimpleDateFormat;
import java.util.*;

public class TimeDemo {
    public static void TodayInFormat() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
        String dateString = format.format(new Date());
        System.out.println(dateString);
    }

    public static void main(String args[]) {
        TodayInFormat();
    }
}