package Inheritance;

public class RBI {
	
	public double GetInterestRate()
	{
		return 13.5;
	}

	public void LoanCalculation(int durationOfMonth,int LoanAmount , double interestRate)
	{
		
		double actualLoanAmountAfterIR =LoanAmount*interestRate;
		System.out.println(actualLoanAmountAfterIR);
		double actualEMIamount = actualLoanAmountAfterIR/durationOfMonth;
		System.out.println(actualEMIamount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI R = new RBI();
		R.LoanCalculation(24, 15000,R.GetInterestRate());
	}

}
