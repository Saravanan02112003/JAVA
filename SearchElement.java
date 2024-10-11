package first;
import java.util.*;

public class SearchElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,flag=0,i=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of elements you want in  array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elemnts");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the element you want to find:");
		x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("Elements found at position:"+(i+1));
		}
		else
		{
			System.out.println("Element not found");
		}
		

	}

}
