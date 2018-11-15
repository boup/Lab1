import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
//org.joda.time.format;

public class DateTemp {
    public static void main(String[] args)
    {
        Date t = new Date();
        System.out.println("toString(): " + t);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("m");
        System.out.println("Format 1:   " + dateFormatter.format(t));
    }
}
