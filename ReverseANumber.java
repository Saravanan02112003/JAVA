package first;
import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int number=scan.nextInt();
		int rev=0;
		while(number!=0)
		{
			int rem=number%10;//reminder will be stord in rem
			rev=rev*10+rem;//add the remider with rev
			number=number/10;//again div the number by 10
		}
		System.out.println(rev);

	}

}
