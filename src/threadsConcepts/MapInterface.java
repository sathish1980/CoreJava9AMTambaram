package threadsConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	
	public void mapconcepts()
	{
		//HashMap<Integer,String> HM = new HashMap<>();
		//LinkedHashMap<Integer,String> HM = new LinkedHashMap<>();
		TreeMap<Integer,String> HM = new TreeMap<>();
		
		HM.put(5, "sathish");
		HM.put(4, "");
		HM.put(2, "sathish");
		HM.put(1, "b.tech");
		HM.put(5, "R");
		
		System.out.println(HM);
		HM.remove(1);
		System.out.println(HM);
		// HM.clear();
		
		String value =HM.get(5);
		System.out.println(value);
		System.out.println(HM.keySet());
		System.out.println(HM.values());
		for(int a :HM.keySet())
		{
			System.out.println(HM.get(a));
		}
		
		for(Map.Entry m :HM.entrySet())
		{
			System.out.print(m.getKey() + " + ");
			System.out.println(m.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapInterface M = new MapInterface();
		M.mapconcepts();
	}

}
