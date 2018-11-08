package quartz.job;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import project.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class SimpleJob implements org.quartz.Job {

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap dataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        List<Student> list = (List<Student>) dataMap.get("list");

        list.sort(Comparator.comparing(Student::getCity));
        //List<Student> t= new ArrayList<>();
        Student p;
        FileWriter fw = null;
        try {
            fw = new FileWriter("p.txt", false);
            FileWriter finalFw = fw;
            list.stream().forEach(el -> {
                try {
                    finalFw.write(System.lineSeparator());
                    finalFw.write(el.getCity());
                    finalFw.write(System.lineSeparator());
                    finalFw.write(el.getName()+ " " + el.getPesel());
                    finalFw.write(System.lineSeparator());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            });
           fw.close();



//                     fw.write(System.lineSeparator());
//                     fw.write(nom + " " + str);
//            fw.write(System.lineSeparator());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
