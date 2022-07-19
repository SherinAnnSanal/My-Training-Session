package pck.polymorphism;

public class ChildPolymorphism extends ParentPolymorphism
{
	public int getResult(int n1,int n2)
	{
		int sub=n1-n2;
		System.out.println("Result of subtraction is "+sub);
		super.display();
		return sub;
	}
	public void print()
	{
		System.out.println("Child class method");
	}

	public static void main(String[] args) 
	{
		ChildPolymorphism obj1=new ChildPolymorphism();
		obj1.getResult(30,20);
		//ParentPolymorphism obj2=new ParentPolymorphism();
		//obj2.getResult(30, 20);
		ParentPolymorphism obj3=new ChildPolymorphism();
		obj3.getResult(50, 10);
		obj1.print();
		obj3.display();

	}

}
