package FirstPackage;

import utilities.EnumData;
import utilities.EnumData.Dates;

public class EnumImplementatio {

	String season = "winter,sprint,summer,fall";
	public enum Season { WINTER, SPRING, SUMMER, FALL }  
	
	public void GetEnum()
	{
		for (Season s : Season.values())
		{  
			System.out.println(s);  
		}  
	
	System.out.println("Value of WINTER is: "+Season.values());  
	System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
	System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
	System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  

	
	
	for ( Dates s : EnumData.Dates.values())
	{  
		System.out.println(s);  
	}  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumImplementatio E = new EnumImplementatio();
		E.GetEnum();
	}

}
