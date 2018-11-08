package project;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import quartz.job.JobWithMap;
import quartz.job.SimpleJob;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

public class Student {
    private String name;
    private String city;
    private String pesel;

    public Student(String city, String name, String pesel) throws IOException {
        this.city = city;
        this.name = name;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void print() {
        System.out.println(city);
        System.out.println(name + " " + pesel);
    }

    //    public  boolean equals(project.Student p)
//    {
//        if(p.name==name)
//            return false;
//    }
    public static void main(String[] args) throws IOException, SchedulerException {
        List<Student> t = new ArrayList<Student>();
        try {

            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            //define the job and tie it to our JobWithMap class
            JobDetail job = newJob(SimpleJob.class)
                    .withIdentity("myJob", "group1")
                    // .usingJobData("ville","H")
                    .build();
            job.getJobDataMap().put("list", t);

            //Trigger the job to run now and then repeat every 10 seconds
            Trigger trigger = newTrigger()
                    .withIdentity("trigger", "group1")
                    .startNow()
                    .withSchedule((simpleSchedule())
                            .withIntervalInSeconds(10)
                            .repeatForever())
                    .build();

            //tell quartz to schedule the job using our trigger
            scheduler.scheduleJob(job, trigger);
            //and start if off
            scheduler.start();

        } catch (
                SchedulerException  se) {
            se.printStackTrace();
        }

        while (true) {
            //List<project.Student> liste =new ArrayList<project.Student>();
            Student p;

//    List rir= new ArrayList();
//    HashBagMultimap<project.Student,getCity>=new HashBagMultimap<project.Student, getCity>();
            String ville;
            String nom;
            String str;
            Scanner sc = new Scanner(System.in);
            System.out.println("give the city");
            ville = sc.nextLine();
            System.out.println("give the name");
            nom = sc.nextLine();
            System.out.println("the project.pesel correct is 11 digit");
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);
            str = stdin.readLine();
            int dl = str.length();
            if (dl != 11)
                System.out.println("number of character incorrect= " + dl + "number correct is 11");
            else {
                Student s = new Student(ville, nom, str);
                s.print();


//
                t.add(s);


//            }
//              try{
//                  BufferedWriter bw =new BufferedWriter(new FileWriter(b + "" ,true));
//                    bw.write(texte.getText());
//                    texte.setText("");
//                    bw.close();
//              }
//              catch (IOException e)
//              {annonce.setText("Erreur d'ecriture dans le fichier");}
//
//            FileWriter fw = new FileWriter("p.txt", true);
//            fw.write(System.lineSeparator());
//            fw.write(s.getCity());
//            fw.write(System.lineSeparator());
//            fw.write(s.getName()+ " " + s.getPesel());
////            fw.write(System.lineSeparator());
//            fw.close();

//             List<String> liste =File.line(path.get("b.txt"))
//              .map(ligne->ligne.split(\\s+)).flatMap(Array::Stream)
//                     .map(String::valueOf)
//                     .collect(collectors.tolist());
            }
        }


    }
}
