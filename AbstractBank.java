package first;
abstract class Bank
{
	abstract double getRateofInterest();
}
class SBI extends Bank
{
	double getRateofInterest()
	{
		return 7;
	}
}
class HDFC extends Bank
{
	double getRateofInterest()
	{return 8;
	}
}
public class AbstractBank {
	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("rate of the interest"+b.getRateofInterest()+"%");
		b=new HDFC();
		System.out.println("rate of the interest"+b.getRateofInterest()+"%");

	}}

