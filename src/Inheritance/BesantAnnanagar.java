package Inheritance;

public class BesantAnnanagar extends BesantMainBranch{
	
	String besantTambaramName = "Besant Technology , Bangalore";
	double discountPercentageTambaram = 0.18;
	String[] CourseFees = {"Python-25000","Java-35000","C#-45000","Testing-15000","Fullstack-45000"};
	
	String courseFees = null ;
	public void getDiscount(String discount)
	{
		if(discount.equalsIgnoreCase("Yes"))
		{
			System.out.println("You are eligible for discount of :"+discountPercentageTambaram);
		}
		else
		{

			System.out.println("You are not eligible for discount");		
		}
	}
	
	
	public String GetCourseAmount(String courseName,String discountGiven)
	{
		String courseAvaialble = GetCourse(courseName);
		if(courseAvaialble.equalsIgnoreCase("Yes"))
		{
			for(String eachValue : CourseFees)
			{
				String[] splitCourseAmount = eachValue.split("-");
				String crseName =splitCourseAmount[0];
				String courseFees =splitCourseAmount[1];
				if(crseName.equalsIgnoreCase(courseName))
				{
					System.out.println("You have choosen "+courseName+" and the Fees amount for this course is : "+courseFees);
					
					return courseFees;
				}
			}
		}
		else
		{
			System.out.println("The given course is not avaialbe at the moment");
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantAnnanagar B = new BesantAnnanagar();
		B.GetCourseAmount("fullstack","Yes");
	}

}
