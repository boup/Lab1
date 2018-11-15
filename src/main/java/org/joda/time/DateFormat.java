package org.joda.time;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateFormat {
    DateTime dt = new DateTime();
    DateTimeFormatter fmt = DateTimeFormat.forPattern("MMMM");
    String str;

    public DateFormat() {
        str = fmt.print(dt);
    }
}
