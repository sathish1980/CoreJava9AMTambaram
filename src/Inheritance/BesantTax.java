package Inheritance;

public class BesantTax {
	
	double GSTPercentage = 0.17;
	public double GST(double amount)
	{
		double GSTAmount = amount*GSTPercentage;
		return GSTAmount;
	}

}
