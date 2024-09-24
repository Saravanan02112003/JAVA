package first;

public class ConstructorOverLoading {
	int id;
	String name;
	int age;	
	ConstructorOverLoading(int i , String n )
	
	{
		id=i;
		name=n;
		
	}
	ConstructorOverLoading(int i , String n,int a )
	
	{
		id=i;
		name=n;
		age=a;
		
	}
	void display()
	{
		System.out.println(id+""+name+""+age);
		
		
	}

	public static void main(String[] args) {
		
		ConstructorOverLoading col1=new ConstructorOverLoading(111,"saravanan");
		ConstructorOverLoading col2= new ConstructorOverLoading(223,"roman",63);
		col1.display();
		col2.display();
		
		

	}

}
