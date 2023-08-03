package FirstPackage;

import java.io.IOException;

public class ExceptionHandling {
	
	public void div(int a, int b)
	{
		try
		{
			if(b>0)
			{
			int c= a/b;
			System.out.println(c);
			}
		}
		catch(ArithmeticException obj)
		{
			System.out.println("You have entered zero value . Please provide valid value and try again");
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		finally
		{
			//throw new NullPointerException("Hi this is sathish");
			System.out.println("Finally block");
		}
		
	}

	public void sum() throws IOException,NullPointerException
	{
		System.out.println("sum method executed");
	}
	public static void main(String[] args) throws NullPointerException, IOException {
		// TODO Auto-generated method stub
		ExceptionHandling E = new ExceptionHandling();
		E.div(10, 0);
		E.sum();
	}

}
