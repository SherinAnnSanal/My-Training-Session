package pck.abstraction.salary;
import java.util.*;

public abstract class Employee {
	String name,designation;
	int compId;
	Scanner sc=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter designation");
		designation=sc.nextLine();
		System.out.println("Enter Company Id");
		compId=sc.nextInt();
		
		
	}
	public abstract void calculateSalary(float payment);
	public abstract void display();
	

}
