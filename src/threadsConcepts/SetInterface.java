package threadsConcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	
	public void setinter()
	{
		//HashSet<String> Hs = new HashSet<>();
		//LinkedHashSet<String> Hs = new LinkedHashSet<>();
		TreeSet<String> Hs = new TreeSet<>();
		Hs.add("sathish");
		Hs.add("kumar");
		Hs.add("sathish");
		Hs.add("python");
		Hs.add("b.tech");
		System.out.println(Hs);
		
		Hs.remove("python");
		System.out.println(Hs);
		Iterator it = Hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetInterface S = new SetInterface();
		S.setinter();
	}

}
