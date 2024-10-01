package first;
//passing array to the method
public class PassingArray {
	static void min(int arr[])
	{
		int min=arr[1];
		for(int i=1;i<arr.length;i++)
		if(min>arr[i])
			min=arr[i];
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {33,99,86};//decalaring & initializing an array
		min(a);//passing array to method

	}

}
