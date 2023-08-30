package Inheritance;

public class HDFC extends RBI {

	// method overriding
	public double GetInterestRate()
	{
		return 11.5;
	}
	public double GetInterestRate(int a)
	{
		return 11.5;
	}
	
	public void LoanAmount(int durationOfMonth,int LoanAmount ,double interestRate) {
		double value = super.GetInterestRate();
		System.out.println(value);
		double value1 = this.GetInterestRate();
		System.out.println(value1);
		LoanCalculation(durationOfMonth,LoanAmount, interestRate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC H = new HDFC();
		H.LoanAmount(24, 15000, H.GetInterestRate());
	}

}
