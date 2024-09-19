package first;

public class NestedIf {
	public static void main(String args[])
	{
		int age=20;
		int weight=65;
		if(age>19) 
		{
			if(weight>64) 
				System.out.println("your eligible to denote blood");
				else {
					System.out.println("your are must be more than 20");
				}
		}
		else {
			System.out.println("your not eligible to denote blood");
		}
	}

}
