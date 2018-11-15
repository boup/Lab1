import java.time.LocalDateTime;
import java.time.LocalDate;

public class CheckTime {
    public static  void main(String[] args)
    {
        CheckTime dataTimeChecker=new CheckTime();
        dataTimeChecker.DataTime();
    }
    public void DataTime()
    {
        LocalDateTime currentTime= LocalDateTime.now();
        System.out.println("Current DateTime: "+ currentTime);
    }
}
