package classoct;

public class ManyCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Array Index Out Of Bounds Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("parent exception occurs");
		}
		
		System.out.println("rest of the code");
	}

}
