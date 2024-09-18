package first;

class TestAccount {
	int acc_no;
	String name;//attribute
	float amount;//initial amount
	//method  to initialize object
	void insert(int a,String n,float amt)//a,n amt-parameters
	{
		acc_no=a;
		name=n;
		amount=amt;	
	}
	//deposit method
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt+"deposited");
	}
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+"withdraw");
		}
	}
	//method to check the balance of the account
	
	void checkBalance()
	{
		System.out.println("Balance is"+amount);
			
		}
	//method to display the values of an object
	void display()
	{
		System.out.println(acc_no+""+name+""+amount);
	}
}
	//creating a test class to deposit and withdraw amount
	public class Account{
		public static void main(String[] args) {
			TestAccount a1=new TestAccount();
			a1.insert(832456, "Saravanan", 10000);
			a1.display();
			a1.checkBalance();
			a1.deposit(40000);
			a1.checkBalance();
			a1.withdraw(1000);
			a1.checkBalance();
		}
	}
