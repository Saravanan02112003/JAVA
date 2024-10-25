package classoct;

public class NumberFormatEx {
	public static void main(String[]args)
	{
		try
		{
			int num=Integer.parseInt("hai");
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("number format exception ");
		}
	}


}
