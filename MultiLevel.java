package first;
class One//base class
{
	public void printone()
	{
		System.out.println("print one");
	}
}
//Intermediatory class
//child class two inherits class one
class Two extends One{
	public void printtwo()
	{
		System.out.println("print two");
	}
}
//child class three inherits from class two
//derived class
class Three extends Two{
	public void printthree() {
	System.out.println("print three");
}
}

public class MultiLevel {

	public static void main(String[] args) {
		Three t=new Three();
		t.printone();
		t.printtwo();
		t.printthree();
		
	}

}
