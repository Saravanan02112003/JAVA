package first;

import java.util.Scanner;

//153=1+125+27=153
public class ArmStrong {
	static boolean isArmStrong(int n)
	{
		int temp;
		int digits=0,last=0;
		double sum=0;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp=n;
		while(temp>0)
		{
			//determines the last digit from the number
			last=temp%10;
			sum=+(Math.pow(last, digits));
			//removes the last digits
			temp=temp/10;
			
		}
		//comares the sum with n
		if(n==sum)
		{
			//returns falseif sum and n are equals
			return true;
		}
		else return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		//read the limit
		num=sc.nextInt();
		System.out.println("Armstrong"+num+"are:");
		for(int i=0;i<num;i++)
		{
			if(isArmStrong(i))
			{
				System.out.println(i+" ");
			}
		}
		
	}

}
