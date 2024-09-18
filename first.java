package first;

import java.util.Scanner;

public class first {
	public static void main(String args[])
	{
//	int a=10;
//		int b=26;
//		System.out.println(a);	

		try (Scanner saravanan = new Scanner(System.in)) {
			int a=saravanan.nextInt();
			int b=saravanan.nextInt();
			System.out.println(a);
			System.out.println(b);
		}
		
		}

}
