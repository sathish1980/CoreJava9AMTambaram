package threadsConcepts;

import threadsConcepts.subclass.innersubClass;

class subclass
{
	public void interestRate()
	{
		System.out.println("interest Rate is 10 %");
	}

class innersubClass
{
	public void Rate()
	{
		System.out.println(" Rate is 100");
	}
}
	
}
public class ClassConcepts
{
	public void interestRate()
	{
		System.out.println("interest Rate is 12 %");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassConcepts C = new ClassConcepts();
		subclass S = new subclass();
		C.interestRate();
		S.interestRate();
		subclass.innersubClass I = S.new innersubClass();
		I.Rate();
		
	}
}
