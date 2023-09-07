package Secondpackage;

public class EncapsulationanotherClass {

	EncapsulationConcepts e = new EncapsulationConcepts();
	
	int Amount1 = e.getAmount();
	public void calc()
	{
		System.out.println("the original amount is : "+ Amount1);
		e.setBalance(500);
		e.Amount();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationanotherClass E = new EncapsulationanotherClass();
		E.calc();
	}
	

}
