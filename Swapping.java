package first;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,temp;
		System.out.println("enter the values of x anf y");
		Scanner swap=new Scanner(System.in);
		x=swap.nextInt();
		y=swap.nextInt();
		System.out.println("the value before swapping is"+x+" "+y);
		//swapping process
		temp=x;
		x=y;
		y=temp;
		System.out.println("the value before swapping is"+x+" "+y);
	}

}
