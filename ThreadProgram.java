package first;

public class ThreadProgram extends Thread {
	public static void main(String args[])
	{
		ThreadProgram tp=new ThreadProgram();
		tp.start();//thread start
		System.out.println("The code is outside the thread");
		
		
	}
	public void run() //once thread started enter into run()
	{
		System.out.println("The code is running in the thread");
	}
	

}
