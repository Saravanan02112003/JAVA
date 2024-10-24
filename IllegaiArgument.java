package classoct;

public class IllegaiArgument {

	public static void print(int a)
	{
		if(a>=18)
		{
			System.out.println("eligible to vote");	
			}
		else
		{
			throw new IllegalArgumentException("not eligible for voiting");
		}
	}
		public static void main(String[] args) {
			IllegaiArgument.print(19);
		}

	}


