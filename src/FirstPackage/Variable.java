package FirstPackage;

class Variable {
	
	private String Gender ="Male"; // global
	public static int Age = 35;  // global
	public String Name = "Besant";
	
	private void GetName()
	{
		String Name = "Sathish"; //local variable
		System.out.println(Name);
		//System.out.println(Gender);
		
	}
	
	protected void Course()
	{
		//System.out.println(Gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
