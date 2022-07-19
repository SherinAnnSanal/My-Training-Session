package salary.inheritance;
import java.util.*;

public class BasicPay {
	float basicPay,deduction,bonus;
	String name;
	protected void getValues()
	{
	

Scanner sc=new Scanner(System.in);
System.out.println("Enter name of the employee");
name=sc.nextLine();
System.out.println("Enter the basic pay:");
basicPay=sc.nextFloat();
System.out.println("Enter the deduction:");
deduction=sc.nextFloat();
System.out.println("Enter the bonus:");
bonus=sc.nextFloat();

	}

}
