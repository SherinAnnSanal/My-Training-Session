package polymorphism.methodoverriding;
import java.util.*;
import java.time.LocalDate;
import java.time.Month;


public class ChildOffSeason extends ParentOnSeason
{
	Scanner sc=new Scanner(System.in);
	public void getDiscount(double price,int qty)
	{   
		totalPrice=price;
		disc=price*0.4;
		price-=disc;
		//return price;
		System.out.println("Congrats!!!!You got a discount of 40%.");
		System.out.println("No: of dress purchased: "+qty);
		System.out.println("Total price is "+totalPrice);
		System.out.println("Discount is "+disc);
		System.out.println("Price after discount "+price);
	}
	
	
	public double display()
	{
		System.out.println("Enter number of dress purchased:");
		
		qty=sc.nextInt();
		for(int i=0;i<qty;i++)
		{
			System.out.println("Enter the price of dress:");
			price=sc.nextFloat();
			totalPrice+=price;
		}
		return totalPrice;
		
	}
	
	
	public static void main(String args[])
	{
		double totPrice;
			ChildOffSeason obj1=new ChildOffSeason();
			ParentOnSeason obj2=new ParentOnSeason();
			
			LocalDate currentdate=LocalDate.now();
			Month currentmonth=currentdate.getMonth();
			String strCurrentMonth=currentmonth.toString();
				System.out.println("Current month is "+strCurrentMonth);
			double tot=obj1.display();
			if(strCurrentMonth=="December")
			obj1.getDiscount(tot,obj1.qty);
	
			else
			obj2.getDiscount(tot,obj2.qty);
			
			//System.out.println("Total price is "+totPrice);
	}
	
	
}
