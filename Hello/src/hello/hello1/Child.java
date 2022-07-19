package hello.hello1;

public class Child extends Parent {

	public void message()
	{
		System.out.println("Hi ..I am from Child class");
	}
	public static void main(String[] args) {
		Child ch=new Child();
		ch.display();
		ch.message();
		

	}

}
