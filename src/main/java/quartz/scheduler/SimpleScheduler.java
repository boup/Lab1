package quartz.scheduler;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import project.Student;
import quartz.job.Job1;
import quartz.job.JobWithMap;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class SimpleScheduler {
    public static void main(String[] args) throws InterruptedException
    {

    }
}
