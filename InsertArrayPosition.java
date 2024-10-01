package first;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArrayPosition {
	public static int[] insertElement(int n,int arr[],int ele,int pos)
	{
		int i;
		int newarr[]=new int[n+1];
	//insert the elements from old array to new array
	for(i=0;i<n+1;i++)
	{
		if(i<pos-1)
		{
			newarr[i]=arr[i];
		}else if(i==pos-1)
			newarr[i]=ele;//add element to the new position
		else
			newarr[i]=arr[i-1];
	}
	return newarr;
}
//driver method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;//array size declarion
		System.out.println("enter the number of elements:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of an array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element where u want to insert");
		int ele=sc.nextInt();
		System.out.println("enter the position where u want to insert");
		int pos=sc.nextInt();
		arr=insertElement(n,arr,ele,pos);
		System.out.println("array with "+ele +" "+"inserted at position "+pos+":\n"+Arrays.toString(arr));
		

	}

}
