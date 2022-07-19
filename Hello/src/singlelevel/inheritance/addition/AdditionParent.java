package singlelevel.inheritance.addition;
import java.util.*;
public class AdditionParent 
{
	Scanner sc=new Scanner(System.in);
	int firstNum,secNum,result;
	public int getResult()
	{
		System.out.println("Enter 1st number: ");
		firstNum=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		secNum=sc.nextInt();
		result=firstNum+secNum;
		return result;
	}

}
