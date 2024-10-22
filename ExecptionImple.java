package classoct;

public class ExecptionImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] mynum= {1,2,3};
			System.out.println(mynum[10]);
			
		
		}
		catch(Exception e)
		{
			System.out.println("something went wrong"+e);
		}
		finally
		{
			System.out.println("try catch completed");
		}

	}

}
