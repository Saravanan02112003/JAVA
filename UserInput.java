package first;

import java.util.Scanner;

public class UserInput {
	public static void main(String args[])
	{
		Scanner myobj=new Scanner(System.in);
		String a1=myobj.nextLine();
		System.out.println("the string is:"+a1);
		System.out.println("enter the number a");
		int a=myobj.nextInt();
		System.out.println("the number is"+a);
	}

}
