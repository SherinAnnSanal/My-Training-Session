package pck.demo.aggregaation;

public class Class2 {

	public void display()
	{
		System.out.println("From child class");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj=new Class1();
		float areaSquare=obj.square(3);
		System.out.println("Area is "+areaSquare);
		

	}

}
