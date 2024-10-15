package first;

public class ThreadTwice extends Thread{
	public void run() {
		System.out.println("Thread is running");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTwice t1=new ThreadTwice();
		//t1.start();//invokes run()method
		//t1.start();//throw illegalThreadState Exection 
		t1.run();//runs fine but its does not start as a seperate stack
		

	}

}
