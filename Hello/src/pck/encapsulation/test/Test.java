package pck.encapsulation.test;


public class Test {
	public void displayAgeAfter()
	{
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student objSt=new Student();
		//objSt.setName("Sherin");
		String  name=objSt.getName();
		System.out.println("Hi.. "+name+".How are you??");
		Test objTest=new Test();
		objTest.displayAgeAfter();
		

	}
}