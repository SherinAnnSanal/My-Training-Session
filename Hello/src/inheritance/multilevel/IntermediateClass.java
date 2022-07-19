package inheritance.multilevel;

public class IntermediateClass extends Parent {
	public void intermediateClassMethod1()
	{
	System.out.println("Intermediate class method");
	
	}

	public static void main(String[] args) {
		IntermediateClass obj2=new IntermediateClass();
		obj2.parentMethod1(30);
		obj2.intermediateClassMethod1();

	}

}
