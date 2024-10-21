package classoct;

import java.util.Deque;
import java.util.LinkedList;

public class QueueMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque=new LinkedList<String>();
		deque.add("kitkat");	
		System.out.println(deque+"\n");
		deque.addLast("diarymilk");
		System.out.println(deque+"\n");
		deque.addFirst("fivestar");
		System.out.println(deque+"\n");
		deque.remove("kitkat");
		System.out.println(deque+"\n");
		deque.push("milkybar");
		System.out.println(deque+"\n");
		deque.offer("munch");
		System.out.println(deque+"\n");
		deque.offerFirst("bounty");
		System.out.println(deque+"\n");

	}

}
