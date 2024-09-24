package task;
//1. write a program to print employee details using constructor(empid,empname,empsal,empage,empdistioga);
public class EmployeeDetails {
	int empid;
	String empname;
	double empsal;
	int empage;
	String designation;
	
	EmployeeDetails(int i,String n,double sal,int age,String d){
		empid = i;
		empname = n;
		empsal = sal;
		empage = age;
		designation = d;
	}
	
	void display() {
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Name: "+empname);
		System.out.println("Employee Salary: "+empsal);
		System.out.println("Employee Age: "+empage);
		System.out.println("Employee Designation: "+designation);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails(01,"Roman",20000,2,"SDE-1");
		EmployeeDetails e2 = new EmployeeDetails(02,"Saravanan",200000,3,"SDE-3");
		e1.display();
		e2.display();
	}

}