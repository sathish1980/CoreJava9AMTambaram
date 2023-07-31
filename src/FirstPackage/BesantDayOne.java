package FirstPackage;

public class BesantDayOne {
	
	public BesantDayOne()
	{
		System.out.println("With out parameter");
	}
	
	public BesantDayOne(String username)
	{
		if(username.equals("sathish"))
		{
			System.out.println("Hi Sathish");
		}
		else
		{
			throw new ArithmeticException("You are not sathish");
		}
	}
	
	// Method with out Return type and with out parameter
	public void Add()
	{
		int a=10;
		int b=20;
		int c=a + b;
		System.out.println(c);
	}
	
	// Method with out Return type and with out parameter
		public void AddWithParamter(int a, int b)
		{
			int c=a + b;
			System.out.println(c);
		}
		// Method with  Return type and with  parameter
			
		public int AddWithParamterwithReturnType(int a, int b)
		{
			int c=a + b;
			
			System.out.println(c);
			return c;
			
		}

		public void subWithParamter(int a, int b)
		{
			int c=a + b;
			System.out.println(c);
		}
		
		
	public void getDataFromVariable()
	{
		Variable v = new Variable();
		System.out.println(v.Name);
	}
	public static void main(String[] a) 
	{
		// TODO Auto-generated method stub
		System.out.print("sathish kumar r \n B.Tech");
		System.out.println("Besant");
		BesantDayOne besant = new BesantDayOne();
		BesantDayOne besant1 = new BesantDayOne("sathish");
		besant.Add();
		besant.AddWithParamter(100,60);
	}

}
