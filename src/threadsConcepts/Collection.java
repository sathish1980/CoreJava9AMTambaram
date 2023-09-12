package threadsConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection 
{
	
	public void ArrayList()
	{
	//ArrayList<Integer> al = new ArrayList<>();
	LinkedList<Integer> al = new LinkedList<>();
	Object a2 = new LinkedList<>();
	al.add(2);
	al.add(3);
	al.add(5);
	al.add(2);
	al.add(7);
	a2=al.clone();
	
	for(int b:al)
	{
		System.out.println(b);
	}
	//or
	
	Iterator it = al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	//remove
	al.remove(3);
	//update
	al.set(3, 70);
	al.clear();
	
	System.out.println(al);
	System.out.println(a2);
	
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	
	LinkedList employee = new LinkedList();
	employee.add("Sathish");
	employee.add("kumar");
	employee.add("R");
	employee.add("B.tech");
	
	employee.remove(2);
	for(Object b:employee)
	{
		System.out.println(b);
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection C = new Collection();
		C.ArrayList();
	}

}
