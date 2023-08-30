package Inheritance;

public class MethodOverloading {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
				
	}
	
	public void add(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);			
	}
	
	public void add(double a, int b, int c)
	{
		double d=a+b+c;
		System.out.println(d);			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading M = new MethodOverloading();
		M.add(1.5, 2,3);
	}

}
