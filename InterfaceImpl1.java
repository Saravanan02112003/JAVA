package classoct;
interface In1
{
	final int a=0;
	static void display()
	{
		System.out.println("i am static method ");
	}
}

public class InterfaceImpl1 implements In1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		In1.display();

	}

}
