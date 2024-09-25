package first;
/* private constructor
 *     private constructor are not generally used.
 * 
 *  The class must be used for singleton design patterns,where you want to ensure that only one instance of a class exists throughout the application.
 */

//Factory method---object created using constructor


public class SingleTonDesignPattern {
	
	//declare private data field
	private String name;
	private int age;
	private String department;
	//Used this for accessing current object
	private SingleTonDesignPattern(String name ,int age,String department)
	{
		this.name=name;
		this.age=age;
		this.department=department;
	}
	//Factory method to create Employee objects
	public static  SingleTonDesignPattern createEmployee(String name ,int age,String department)
	{
		return new SingleTonDesignPattern(name,age,department);
	}
	//Getters and setters (omitted for brevity)
	
	
	public static void main(String[] args) {
		//create Employee objects using the factors method
		SingleTonDesignPattern employee1=SingleTonDesignPattern.createEmployee("Saravanan", 22, "Backend");
		SingleTonDesignPattern employee2=SingleTonDesignPattern.createEmployee("Sanjay", 23, "fontend");
		SingleTonDesignPattern employee3=SingleTonDesignPattern.createEmployee("Palraj", 24, "Onnu theriyathu");
		//access and print employee information
		System.out.println("Employee 1-Name:"+employee1.name+",Age:"+employee1.age+",Department:"+employee1.department+".");
		System.out.println("Employee 2-Name:"+employee2.name+",Age:"+employee2.age+",Department:"+employee2.department+".");
		System.out.println("Employee 3-Name:"+employee3.name+",Age:"+employee3.age+",Department:"+employee3.department+".");
		

	}

}
