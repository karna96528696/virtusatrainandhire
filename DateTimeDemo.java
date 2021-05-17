package DateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTimeDemo {
	public static void main(String[] ar)
	{
		// check the current day and the day of the given month & year.
		LocalDate today = LocalDate.now();  
	    LocalDate dob=LocalDate.of(2021,4, 20);
	    int day=today.getDayOfMonth();
	   
	    if(day==(dob.getDayOfMonth()))
	    {
	    	System.out.println("It's time to pay the bill");
	    }
	    else
	    {
	    	System.out.println("there is still time to pay the bill");
	    }
	    
	    
	    // To check how any months between today and given date.
	 	LocalDate day1=LocalDate.of(2021,3,20);
	 	Period pd=Period.between(day1,today);
	 	System.out.println("months between given day and today "+pd.getMonths());
	 		
	 	// To format given date in particular format.
		String str="Jan 10 2020";
		LocalDate formatter=LocalDate.parse(str,DateTimeFormatter.ofPattern("MMM dd yyyy"));
		System.out.println("parsed date is "+ formatter);
	}
}
