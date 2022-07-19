
package hello.hello1;
import java.time.LocalDate;
//import java.time.LocalTime;
import java.time.Month;

public class DisplayDate {
	public static void main(String args[])
	{
		LocalDate currentdate=LocalDate.now();
		System.out.println("Current date is "+currentdate);
		int currentDay=currentdate.getDayOfMonth();
		Month currentMonth=currentdate.getMonth();
		System.out.println("Month is "+currentMonth);
		int currentYear=currentdate.getYear();
		System.out.println("Year is "+currentYear);
		
		
	}

}





/*import java.time.LocalDate;
import java.time.Month;
public class LocalDateJava8 {
   public static void main(String args[]) {
      //Getting the current date value
      LocalDate currentdate = LocalDate.now();
      System.out.println("Current date: "+currentdate);
      //Getting the current day
      int currentDay = currentdate.getDayOfMonth();
      System.out.println("Current day: "+currentDay);
      //Getting the current month
      Month currentMonth = currentdate.getMonth();
      System.out.println("Current month: "+currentMonth);
      //getting the current year
      int currentYear = currentdate.getYear();
      System.out.println("Current month: "+currentYear);
   }
}*/