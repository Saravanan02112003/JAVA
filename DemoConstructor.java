package first;

public class DemoConstructor {
	int value1;
	int value2;
	DemoConstructor(){
		value1=10;
		value2=20;
		System.out.println("inside constructor");
	}
	public void diplay()
	{
		System.out.println("value1 === "+value1);
		System.out.println("value2 === "+value2);
	}

	public static void main(String[] args) {
		DemoConstructor d1=new DemoConstructor();
		d1.diplay();
		

	}

}
