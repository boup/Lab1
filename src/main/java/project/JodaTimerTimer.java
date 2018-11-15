package project;

import org.joda.time.DateTime;

import java.util.TimerTask;

public class JodaTimerTimer extends TimerTask
{
    public static void main(String [] args)
    {}
    @Override
    public void run()
    {
        DateTime date=new DateTime();
        int minute = date.getMinuteOfDay();
        System.out.println(String.format("%d" , minute));
    }
}
