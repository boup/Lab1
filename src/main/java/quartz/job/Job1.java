package quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import java.util.Date;

public class Job1 implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {

        System.out.println("Job1 --->>> Hello! Time is " + new Date());

    }

}

