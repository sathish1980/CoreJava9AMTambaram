package Inheritance;

public class BesantTambaramInvoice extends BesantTambaram{
	
	public void GetInvoice(String courseName,String discountGiven)
	{
		String courseFees = GetCourseAmount(courseName,discountGiven);
		if (discountGiven.equalsIgnoreCase("Yes"))
		{
			getDiscount(discountGiven);
			int actualCourseFees =Integer.parseInt(courseFees);		
			double discountAmount =GetFeesAmountAfterDiscount(actualCourseFees);
			double finalAmount = actualCourseFees-discountAmount;
			System.out.println("The final amount you are suppose to pay as : "+finalAmount);
			GetGST(finalAmount);
			}
		else
		{
			System.out.println("The final amount after GST is : "+courseFees);
			GetGST(Double.parseDouble(courseFees));
		}
	}
	
	public void GetGST(double finalAmount)
	{
		BesantTax B = new BesantTax();
		double actualGst = B.GST(finalAmount);
		double feesAfterGst =finalAmount+ actualGst;
		System.out.println("The final amount after GST is : "+feesAfterGst);			
	}
	
	public double GetFeesAmountAfterDiscount(int actualCourseFees)
	{
		double actualDiscountPercentage =discountPercentageTambaram;
		double discountAmount = actualCourseFees*actualDiscountPercentage;
		System.out.println("The discount amount for this course is  : "+discountAmount);
		return discountAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantTambaramInvoice B = new BesantTambaramInvoice();
		B.GetInvoice("fullstack","Yes");
	}

}
