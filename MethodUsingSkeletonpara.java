package first;

public class MethodUsingSkeletonpara {
	public int subNumbers(int x,int y)
	{
		int subtract=x-y;
		return subtract;
	}

	public static void main(String[] args) {
		int num1=50,num2=30;
		MethodUsingSkeletonpara obj=new MethodUsingSkeletonpara();//calling the method
		int outcome=obj.subNumbers(num1, num2);//arguments
		System.out.println("The result is "+outcome);
		
		

	}

}
