package pck.exceptionhandling;

public class Class1 {

	
	public void operations(int num1, int num2)
	{
		int arr[]=new int[5];
		try
		{
			int result=num1/num2;
			System.out.println("Result is "+result);
		
		for(int i=0;i<=arr.length;i++)
		{
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
		}
		catch(ArithmeticException ex) {
			System.out.println("Division by zero is not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index exceeds the limit");
		}
		catch(Exception x)
		{
			System.out.println("Exception occured");
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		System.out.println("Can you see me");
	}
	public static void main(String[] args) {
		
		Class1 obj=new Class1();
		obj.operations(100, 0);
	}

}
