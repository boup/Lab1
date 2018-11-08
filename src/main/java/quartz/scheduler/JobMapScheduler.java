package quartz.scheduler;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import quartz.job.JobWithMap;
import org.quartz.JobDetail;
import org.quartz.Trigger;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;


public class JobMapScheduler {
    public static void main(String[] args) throws InterruptedException
    {
        try{
            //Grab the Scheduler instance from the factory

            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            //define the job and tie it to our JobWithMap class
            JobDetail job = newJob(JobWithMap.class)
                    .withIdentity("myJob","group1")
                    .usingJobData("ville","your course will finish soon")
                    .build();

            //Trigger the job to run now and then repeat every 10 seconds
            Trigger trigger =newTrigger()
                    .withIdentity("trigger","group1")
                    .startNow()
                    .withSchedule(simpleSchedule()
                         .withIntervalInSeconds(10)
                         .repeatForever())
                    .build();

            //tell quartz to schedule the job using our trigger
            scheduler.scheduleJob(job,trigger);
            //and start if off
            scheduler.start();
            Thread.sleep(6000);
            scheduler.shutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }
}
