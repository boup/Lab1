package project;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.tz.CachedDateTimeZone;


import static java.lang.System.out;

public class JodaTime {
    //DateTimeZone timeZone = DateTimeZone.forID("Poland/poznan");
    public static void main(String [] args) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
        //.withZone(timeZone);
        DateTime dateTimeStart = formatter.parseDateTime("01:28:00");
        DateTime dateTimeEnd = formatter.parseDateTime("02:00:00");
        Period period = new Period(dateTimeStart, dateTimeEnd);
        PeriodFormatter periodFormatter = PeriodFormat.getDefault();
        String t = periodFormatter.print(period);

        System.out.print(t +  " for the end");
    }



}
