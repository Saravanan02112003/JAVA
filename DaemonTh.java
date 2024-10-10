package first;
class UserThread extends Thread
{
@Override
public void run()
{
for (int i=0;i<100;i++)
{
System.out.println("This is an user thread...");
}
}
}
public class DaemonTh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserThread userThread=new UserThread();
		userThread.setDaemon(true);
		}

}
