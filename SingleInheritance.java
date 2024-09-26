package first;
class Single//base class
{
	float salary=60000;//base class data variables
}
//class Program extends Single//derived class data variables
//{
//	int bonus=30000;
//}

public class SingleInheritance extends Single//derived class data variables
{
	int bonus=30000;
	public static void main(String[] args) {
		
		SingleInheritance si=new SingleInheritance();
		System.out.println(+si.salary);
		System.out.println(+si.bonus);
		

	}

}
