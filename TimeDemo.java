package DateTime;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
public class TimeDemo {
		public static void main(String[] ar)
		{
			LocalDate today=LocalDate.now();
			LocalTime time = LocalTime.now();  
			LocalTime extra = time.plusHours(2);
			LocalDate next = today.minus(1,ChronoUnit.YEARS); 
		 
			 Clock cl=Clock.systemUTC();
		   System.out.println(cl);
		   System.out.println(next);
		   System.out.println(extra);
		   System.out.println(time);
			
			YearMonth year=YearMonth.now();
			 System.out.println(year);
		  
		}

}
