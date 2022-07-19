package inheritance.multilevel;

public class DerivedClass extends Parent  
{
public void derivedClassMethod()
{
	System.out.println("Deived class Method");
	System.out.println(number+=10);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DerivedClass obj=new DerivedClass();

obj.parentMethod1(20);
obj.derivedClassMethod();

	}

}
