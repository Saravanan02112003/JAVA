package first;
interface One1//interface
{
	public void printone();
	
}
interface Two2//interface
{
	public void printtwo();
}
interface Three3 extends One1,Two2{
	public void printthree();
}
class Child implements Three3 //class inherits interface using implements
{
	@Override
	public void printone() {
		System.out.println("print one from class one");
	}
	public void printtwo() {
		System.out.println("print one from class two");
	}
	public void printthree() {
		System.out.println("print one from class three");
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.printone();
		c.printtwo();
		c.printthree();
		
	}

}
