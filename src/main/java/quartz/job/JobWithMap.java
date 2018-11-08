package quartz.job;
import org.quartz.*;
import java.util.Date;

public class JobWithMap implements org.quartz.Job {
    @Override
    public void execute(JobExecutionContext context) {
        JobKey key =context.getJobDetail().getKey();
        //Job values Map
        JobDataMap dataMap =context.getJobDetail().getJobDataMap();
        //System.out.println("Job2 --->>> Hello geeks! Time is " + new Date());
        //read values
        String city= dataMap.getString("ville");
        String name= dataMap.getString("nom");
        String pesel= dataMap.getString("pesel");
        //String city= dataMap.getString("city");

        //int counter =0;
//        if(dataMap.containsKey("counter"))
//        {
//            counter=dataMap.getInt("counter");
//        }
        System.err.println("instance " + key + " of says " + city + " and the name "
                + name +  " the project.pesel is " + pesel + "number " );
        //counter++;
        //dataMap.put("counter",counter);
    }
}
