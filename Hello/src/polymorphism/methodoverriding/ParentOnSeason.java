package polymorphism.methodoverriding;
import java.util.*;
import java.time.*;

public class ParentOnSeason 
{
	int qty;
	double disc,price;
	double totalPrice=0;
	
	
public void getDiscount(double total,int qty)
{
	
	totalPrice=total;
		disc=total*0.15;
		total-=disc;
		//return total;
		System.out.println("Congrats!!!!You got a discount of 15%.");
		System.out.println("No: of dress purchased: "+qty);
		System.out.println("Total price is "+totalPrice);
		System.out.println("Discount is "+disc);
		System.out.println("Price after discount "+total);
		
	
}
}

