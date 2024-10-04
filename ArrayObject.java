package first;
class Student
{
	public int id;
	public String name;
	Student (int id ,String name)
	{
		this.id=id;
		this.name=name;
		
	}
}
public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr;
		arr=new Student[3];
		arr[0]=new Student(100,"saravanan");
		arr[1]=new Student(160,"roman");
		arr[2]=new Student(1098,"sakthi");

	}

}
