package classoct;

import java.util.Comparator;
import java.util.TreeMap;

class Student{
	int rollno;
	String name,address;
	
	public Student(int rollno,String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
}


class SortBy implements Comparator<Student>{

	@Override
	//sort the rollnumber 1.....
	public int compare(Student o1, Student o2) {
		return o1.rollno - o2.rollno;
	}
	
}

public class TreeMapComparitorExample {
	
	public static void sample() {
		TreeMap<Student, Integer> treemap = new TreeMap<>(new SortBy());
		
		treemap.put(new Student(1,"Roman","usa"), 8);
		treemap.put(new Student(12,"saravanan","Chennai"), 1);
		treemap.put(new Student(14,"Suriya"+ "","Madurai"), 3);
		treemap.put(new Student(15,"Sakthi","Tiruvannamalai"), 5);
		treemap.put(new Student(2,"Palraj","Coimbature"), 8);
		treemap.put(new Student(5,"Sanjay","Coimbature"), 8);
		
		System.out.println("The Printed map: "+treemap);
	}
	public static void main(String[] args) {

		sample();	
		
		
	}

}
