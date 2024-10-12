package first;

import java.util.Scanner;

public class SwappingUsingTwovaribles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		System.out.println("enter the values of x anf y");
		Scanner swap=new Scanner(System.in);
		x=swap.nextInt();
		y=swap.nextInt();
		System.out.println("the value before swapping is"+x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("the value after swapping is"+x+" "+y);

	}

}
