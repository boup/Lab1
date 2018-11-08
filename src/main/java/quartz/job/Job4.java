package quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class Job4 implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {

        System.out.println("Job4 --->>> Hello Time is " + new Date());

    }
}
