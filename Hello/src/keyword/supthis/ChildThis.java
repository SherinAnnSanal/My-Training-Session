package keyword.supthis;

public class ChildThis extends ParentSuper {
	int number;
	public void getChild(int num)
	{
		super.number=number+20;
		number=num;
		System.out.println("Child number value is "+number);
		System.out.println("Parent number value is "+super.number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildThis obj=new ChildThis();
obj.getChild(50);
//obj.getParent(20);
	}

}
