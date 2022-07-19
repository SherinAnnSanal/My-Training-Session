package pck.abstraction.salary;
import java.util.*;

public class Contractor extends Employee{
	Scanner scan=new Scanner(System.in);
	float salary;
	

	public void calculateSalary(float pay) {
		
		System.out.println("Enter number of hours worked");
		int workHour=scan.nextInt();
		salary=workHour*pay;
	}
	
	@Override
	public void display() {
		System.out.println("**************Salary Slip*******");
		System.out.println("Name: "+name);
		System.out.println("Company ID:"+compId);
		System.out.println("Designation: "+designation);
		System.out.println("Employee type:Contract");
		System.out.println("Salary: "+salary);
		
		
	}
	public static void main(String[] args) {
		Contractor objContractor=new Contractor();
		//Employee emp=new Employee("Sherin",2001,"Testing Engineer")
		Scanner sc=new Scanner(System.in);
		objContractor.getDetails();
		System.out.println("Enter payement for hour: ");
		float payment=sc.nextFloat();
	
		objContractor.calculateSalary(payment);
		objContractor.display();
	}
	

	
		
	}
