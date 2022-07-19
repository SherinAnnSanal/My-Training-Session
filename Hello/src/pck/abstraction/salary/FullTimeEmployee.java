package pck.abstraction.salary;

import java.util.Scanner;

public class FullTimeEmployee extends Employee
{
	float salary;


	public void calculateSalary(float pay) {
		final int DUR=8;
		salary=pay*DUR*30;
		
		
	}
	public void display() {
		System.out.println("**************Salary Slip*******");
		System.out.println("Name: "+name);
		System.out.println("Company ID:"+compId);
		System.out.println("Designation"+designation);
		System.out.println("Employee type:Full time");
		System.out.println("Salary: "+salary);
	}
	 static void main(String args[])
{
	FullTimeEmployee objFullTime=new FullTimeEmployee();
	Scanner sc=new Scanner(System.in);
	
	objFullTime.getDetails();
	System.out.println("Enter basic pay : ");
	float payment=sc.nextFloat();
	objFullTime.calculateSalary(payment);
	objFullTime.display();
}


}

