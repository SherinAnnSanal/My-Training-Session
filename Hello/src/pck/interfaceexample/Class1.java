package pck.interfaceexample;

public class Class1 implements Interface1,Interface2 {

	public void operations(int n)
	{
		float area=n*n;
		System.out.println("Area of square is"+area);
	}
	public void display()
	{
		System.out.println("Method implementation of Interface 1");
	}
	public void printHi()
	{
		System.out.println("Hi from Interface 2");
		System.out.println("Constant value is"+MAX);
	}


	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.display();
		obj.printHi();
		obj.operations(3);
		

	}

}
