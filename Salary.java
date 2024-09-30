package first;

public class Salary extends Employee
{
	private double salary;//annual salary
	public Salary(String name,String address,int number,int salary)
	{
		super(name,address,salary);
		setSalary(salary);
	}
	public void mailCheck()
	{
		System.out.println("within mailcheck of salary class");
		System.out.println("Mailing checkto "+getName()+"with salary"+salary);
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double newSalary)
	{
		if(newSalary>=0.0)
		{
			salary=newSalary;
		}
	}
	public double computePay()
	{
		System.out.println("compting salary pay for"+getName());
		return salary/52;
	}


public static void main(String args[]) {
	Salary s=new Salary("sakthi","valasarawakkam",1234,78000);
	s.mailCheck();
	
}
}
