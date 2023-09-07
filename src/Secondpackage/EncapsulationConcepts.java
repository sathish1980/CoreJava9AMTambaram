package Secondpackage;

public class EncapsulationConcepts {
	
	private int amount =1000;
	private int balance = 100;
	
	public int getAmount()
	{
		return this.amount;
	}
	
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	
	public void Amount()
	{
		int totalAmount = amount-balance;
		System.out.println(totalAmount);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationConcepts E = new EncapsulationConcepts();
		E.Amount();
	}

}
