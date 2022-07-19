package pck.interfac.assignment;

import java.util.Scanner;

public class HDFC implements RBI
{
	double A;
	float p;
	int n;
	


	public void recurringDeposit(float amount, int duration) {
		// TODO Auto-generated method stub
	
				A=p*n+p*n*(n+1)/2*R/100*1/12.0;
				System.out.println("Matured Amount: "+A);
	}
	
	public void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		p=sc.nextFloat();
		System.out.println("Enter timrperiod(in months): ");
		n=sc.nextInt();
	}
	public static void main(String args[])
	{
	HDFC obj=new HDFC();
		obj.getDetails();
		obj.recurringDeposit(obj.p,obj.n);
		
	}
}
