package classoct;

public class CustomExceptionExample extends Exception
{
	private static int accno[]= {1001,1002,1003,1004,1005};
	private static String name[]= {"saravanan","sakthi","palraj","sanjay","suresh"};
	private static double balanec[]= {1000.00,100038.00,999,6759.00,2278,00};
	public CustomExceptionExample() {
	}
	public CustomExceptionExample(String str)
	{
		super(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("ACCNO"+"\t"+"name"+"\t"+"balance");
			for(int i=0;i<10;i++)
			{
				System.out.println(accno[i]+"\t"+name[i]+"\t"+balanec[i]);
			if(balanec[i]<1000)
			{
				CustomExceptionExample me=new CustomExceptionExample("balance is less than 1000");
				throw me;
			}
		}
		}
		catch(CustomExceptionExample e)
		{
			e.printStackTrace();
		}
		
	}

}
