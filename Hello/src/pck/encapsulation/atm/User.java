
package pck.encapsulation.atm;
import java.util.*;
public class User {
	
	public void checkValidity(int atm)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your PIN");
		int pin=sc.nextInt();
	if(pin==atm)
	{
	System.out.println("Validated..You are authorized user");
	}
	else
	{
		System.out.println("Sorry..Enter correct pin");
	}
	}

public static void main(String args[])
{
	
	Bank obj1=new Bank();
	User objUser=new User();
	obj1.setPin(1001);
	obj1.setPin(1212);
	obj1.setPin(1234);
	int atmPin=obj1.getPin();
	objUser.checkValidity(atmPin);
	
	
	}
	
}
	

