package salary.inheritance;

public class CalculateTotalSalary extends CalculateHraPf 
{
	double salary;
	public void displaySlip()
	{
		System.out.println("------------Salary Slip-----------");
		System.out.println("Name:"+name);
		System.out.println("Basic Pay:"+basicPay);
		System.out.println("Deduction: "+deduction);
		System.out.println("HRA:"+hra);
		System.out.println("PF:"+pf);
		System.out.println("Bonus:"+bonus);
		System.out.println("Total Salary: "+salary);
		
	}
	public void getSalary()
	{
		salary=basicPay+hra-pf-deduction+bonus;
	}


	public static void main(String[] args) {
		CalculateTotalSalary obj=new CalculateTotalSalary();
		obj.getSalary();
		
		obj.getValues();
		obj.getHra();
		obj.getPf();
		
		
		obj.displaySlip();
		
		
		

	}

}
