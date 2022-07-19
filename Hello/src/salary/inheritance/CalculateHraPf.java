package salary.inheritance;

public class CalculateHraPf extends BasicPay
{
	double hra,pf;
	protected void getHra()
	{
		hra=basicPay*0.05;
		
	}
	protected void getPf()
	{
		pf=basicPay*0.2;
		
	}
}
