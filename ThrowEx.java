package classoct;

public class ThrowEx {
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("access denied");
		}
		else
		{
			System.out.println("access granted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(19);

	}

}
