package task;

public class ArrayEvenOrOdd {
	

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		
		int even=0, odd=0;
		for(int i:arr) {
		if(i%2==0)
		{
			
			even++;
		}
		else {

			odd++;
			
		}
		}
		System.out.println("this is even number"+even);
		System.out.println("this is odd number"+odd);
	}

}
