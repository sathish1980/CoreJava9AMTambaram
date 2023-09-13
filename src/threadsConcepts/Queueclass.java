package threadsConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queueclass {
	
	public void queue()
	{
		//Queue<String> q = new LinkedList<>();
		Queue<String> q = new PriorityQueue<>();
		q.add("sathish");
		q.add("Kumar");
		q.add("B.tech");
		q.add("last");
		
		System.out.println(q);
		System.out.println(q.element()); // get the head
		System.out.println(q.peek());
		q.remove();// delete the head 
		System.out.println("after the head delete"+q);
		Iterator it = q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		q.offer("last after 1");
		q.offer("last after 2");
		System.out.println(q);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queueclass Q = new Queueclass();
		Q.queue();
	}

}
