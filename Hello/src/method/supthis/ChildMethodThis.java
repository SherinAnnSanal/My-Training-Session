package method.supthis;

public class ChildMethodThis extends ParentMethodSuper {
int number;

	public ChildMethodThis(int num) {
		super(100);
		number=num;
		
		System.out.println("Invoked Child class Constructor "+number);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildMethodThis obj=new ChildMethodThis(20);
		

	}

}
