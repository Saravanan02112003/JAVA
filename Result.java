package first;

class One1// Base class or parent class or super class
{
	public void printone()
	{
		System.out.println("print one");
		}
	
}
class Two2 extends One1 //Derived class or child class or sub class
{
	public void printtwo() {
		System.out.println("print two");
		
	}
}

public class Result {

	public static void main(String[] args) {
		Two2 t=new Two2();
		t.printone();
		t.printtwo();

	}

}
