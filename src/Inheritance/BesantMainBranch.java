package Inheritance;

public class BesantMainBranch {
	
	String name = "Besant Technology , Bangalore";
	String[] Course = {"Python","Java","C#","Testing","Fullstack"};
	String[] Batch= {"WeekDay","WeekEnd"};
	
	public String GetCourse(String courseName)
	{
		for(String eachCourse : Course)
		{
			if(eachCourse.equalsIgnoreCase(courseName))
			{
				System.out.println("The requested course " +courseName+" is avaialble now" );
				return "Yes";
			}
		}
		return "No";
	}
	
	public void GetBatches()
	{
		for(String eachbatch : Batch)
		{
			System.out.println("The batches are available :");
			System.out.println(eachbatch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantMainBranch B = new BesantMainBranch();
		B.GetCourse("C#");
		B.GetBatches();
	}

}
