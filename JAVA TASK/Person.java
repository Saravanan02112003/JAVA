package task;
//  Write a java program to create a class called "person" with a name and age attribute.create two instances of 
//the "person"class,set their attributes using the constructor,and print their name and age.

public class Person {
	private String name;
	private int age;
	private Person(String name,int age) {
		this.name=name;
		this.age=age;
		}
	public static Person human(String name,int age)
	{
		return new Person(name,age);
	}
	

	public static void main(String[] args) {
		Person human1=Person.human("Saravanan", 22);
		Person human2=Person.human("Palraj", 29);
		System.out.println("Name:"+human1.name+",Age:"+human1.age);
		System.out.println("Name:"+human2.name+",Age:"+human2.age);
		

	}

}
