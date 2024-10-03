package first;

import java.util.Scanner;

public class FoundThePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of elements you want in  array:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elemnts");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the k th position at whichyou want tocheck number:");
		int k=s.nextInt();
		System.out.println("number:"+a[k+1]);

	}

}
