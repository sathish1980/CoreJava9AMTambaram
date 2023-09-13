package threadsConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueqeConceptes {
	
	public void queuecon()
	{
		// Queue AL = new LinkedList<>();
		Queue AL = new PriorityQueue<>();
		AL.add("Zebra");
		AL.add("Apple");
		AL.add("Zebra");
		AL.offer("sathish");
		
		
		
		System.out.println(AL);
		System.out.println(AL.element());
		AL.poll();
		System.out.println(AL);
		//AL.clear();
		boolean existornot = AL.contains("sathish");
		System.out.println(existornot);
		Iterator it = AL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//for(String eachvalue : AL)
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueqeConceptes Q = new QueqeConceptes();
		Q.queuecon();
	}

}
