public class Time {
   private int hour,minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public Time()
    {
        hour=0;
        minute=0;
    }
    public Time(int m)
    {
        hour=m/60;
        minute=m%60;
    }

    public Time addMinute(int m)
    {
        int totalmin=(60*hour+minute+m)%(24*60);
        if(totalmin<0)
            totalmin=totalmin+24*60;
        return new Time(totalmin/60,totalmin%60);
    }
    public boolean priorTo(Time t)
    {
        return ((hour<t.hour)|| ((hour==t.hour)&&(minute<t.minute)));
    }
    public boolean after(Time t2)
    {
        return t2.priorTo(this);
    }
    public void printTime()
    {
        if((hour==12)&&(minute==0))
            System.out.println("not classe ");
        else if ((hour==18)&&(minute==45))
        {
            System.out.println("end of class");
        }
        else
        {
            if(hour==0)
                System.out.println(12);
            else if (hour>12)
            {
                System.out.println(hour-1);
            }
            else

                System.out.println(hour);

            if(minute<10)
            {
                System.out.println(":0"+minute);
            }
            else
            {
                System.out.println(":"+minute);
            }
            if(hour>12)
                System.out.println("AM");
            else
            {
                System.out.println("PM");
            }
        }
    }
}
