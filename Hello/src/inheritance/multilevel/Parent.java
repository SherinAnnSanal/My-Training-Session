package inheritance.multilevel;

public class Parent {
	int number;
	public void parentMethod1(int number)
	{
		this.number=number;
		System.out.println("Parent class method1 "+number);
	}
	private void parentMethod2()
	{
		System.out.println("Private method in parent class");
		//System.out.println()
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
