package first;

public class ThreadPrirority {

	public static void main(String[] args) {
		Thread e1=new Thread("demo");
		Thread e2=new Thread("demo2");
		e1.start();
		e2.start();
		System.out.println("Thread name are as follows");
		System.out.println(e1.getName());
		System.out.println(e2.getName());

	}
	public void run() {
		
	}

}
