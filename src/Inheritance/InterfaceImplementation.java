package Inheritance;

public class InterfaceImplementation implements Interface1 {
	
	public void test()
	{
		System.out.println("This is for test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 I = new InterfaceImplementation();
		Interface1 I1 = new InterfaceImplementation();
		
		//I.test();
		I.fees();
		I.amount();
		I1.fees();
		I1.amount();
	}

	@Override
	public void fees() {
		// TODO Auto-generated method stub
		System.out.println("this is fees");
	}
	

	@Override
	public void amount() {
		// TODO Auto-generated method stub
	System.out.println("This is amount");	
	}

}
