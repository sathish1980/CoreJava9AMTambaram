package FirstPackage;

public class Conditions 
{
	
	public void conditionsimplementations(String signalColor,String Vehicle,String Occupancy)
	{
		if(signalColor.equals("Red"))
		{
			if(!(Vehicle.equals("Ambulance") && Occupancy.equals("Yes")))
				{
				System.out.println("You are good to go Now");
				}

			else
			{
			System.out.println("You have to stop");
			System.out.println("Dont blow horn");
			}
		}
		else if (signalColor.equals("Green"))
		{
			System.out.println("You are good to go Now");
		}
		else if (signalColor.equals("Orange"))
		{
			System.out.println("Get Ready to go");
		}
		else
		{
			System.out.println("Please enter a valid color");
		}
	}
	
	public void Gender(String Gen)
	{
		switch(Gen.toUpperCase())
		{
		case "M":
			System.out.println("You are male");
			break;
		case "F":
			System.out.println("You are Female");
			break;
		case "T":
			System.out.println("You are TransGender");
			break;
		default:
			System.out.println("Please provide the correct gender code");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditions c = new Conditions();
		c.conditionsimplementations("Red","Ambulance","");
		c.Gender("m");
	}

}
