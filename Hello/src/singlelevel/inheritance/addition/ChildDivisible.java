package singlelevel.inheritance.addition;

public class ChildDivisible extends AdditionParent
{
	int num, result;
	
public int getRes( )
{
	int num=super.getResult();
	result=num%10;
	if(result==0)
		{System.out.println(super.result+" is divisible by 0");
	return 0;}
	else
	{	System.out.println(super.result+" is not divisible by 0");
	return 0;}
}
	public static void main(String[] args) {
		ChildDivisible obj=new ChildDivisible();
		obj.getRes();
		

	}

}
