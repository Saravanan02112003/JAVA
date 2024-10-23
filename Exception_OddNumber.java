package classoct;

public class Exception_OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		trynumber(n);
		int g=10;
		checkEvenNumber(g);
		
	}
	public static void trynumber(int n)
	{
		try
		{
			checkEvenNumber(n);
			System.out.println(n+" is even");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("error:"+e.getMessage());
		}
	}
	
	public static void checkEvenNumber(int number)
	{
		if(number %2!=0)
		{
			throw new IllegalArgumentException(number+" is odd");
		}
	}

	
		
}
