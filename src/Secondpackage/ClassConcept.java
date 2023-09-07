package Secondpackage;

class outerclass
{
	public void test()
	{
		System.out.println("This is outer class test method");
	}


class innerclass
{
	public void test()
	{
		System.out.println("This is inner class test method");
	}
}
}
public class ClassConcept {
	
	

	public void test()
	{
		System.out.println("This is inner class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass c = new outerclass();
		outerclass.innerclass c1 = c.new innerclass();
		c1.test();
	}

}
