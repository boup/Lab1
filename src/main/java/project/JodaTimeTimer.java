package project;

import org.joda.time.DateTime;

import java.util.Timer;
import java.util.TimerTask;

public class JodaTimeTimer extends TimerTask {

        public  static  void main(String[] args)
        {
            Timer time =new Timer();
            time.schedule(new JodaTimeTimer(), 0,1*1000);
        }
        @Override
        public void run()
        {
            DateTime date=new DateTime();
            int minute=date.getMinuteOfHour();
            System.out.println(String.format("%d", minute)+ "its actually");
        }

}
