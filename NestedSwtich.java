package first;

public class NestedSwtich {
	public static void main(String args[])
	{
		char branch='p';
		int collegeyear=4;
		switch(collegeyear)
		{
		case 1:
		{
			System.out.println("English,maths,science");
			break;
		}
			
		case 2:
			switch(branch)
			{
			case 'c':

				System.out.println("operating system,java,data structure");
				break;
	
			case 'E':
				System.out.println("Microprocesser,logic switching");
				break;
			case 'M':
				System.out.println("Mancfacuring machine");
				break;
			}
			break;
			
		case 3:
			switch(branch)
			{
			case '0':

				System.out.println("Computer organtization");
				break;
				
			case 'T':
				System.out.println("Electronic&embedded enginerring");
				break;
				
			case 'D':
				System.out.println("Mechanical department");
				break;
			}
			break;
				
		
		case 4:
			switch(branch)
			{
			case 'p':

				System.out.println("Computer organtization");
				break;
				
			case 'h':
				System.out.println("Electronic&embedded enginerring");
				break;
				
			case 'v':
				System.out.println("Mechanical department");
				break;
			}
			break;
		}
	}
	
			}