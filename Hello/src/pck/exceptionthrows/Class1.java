package pck.exceptionthrows;

import java.io.IOException;

public class Class1 {

	public void operations(int n1,int n2)throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int arr[]=new int[5];
		try
		{
			int result=n1/n2;
			System.out.println("Result is "+result);
			if(result>2)
			{
				throw new IOException();
				
			}
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(i);
		}
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Division by zero not possible");
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index exceed");
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured");
		}
		
	}
	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.operations(100, 2);

	}

}
