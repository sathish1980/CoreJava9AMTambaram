package FirstPackage;

public class Loopconcpets {
	
	
	public void forloop()
	{
		int i;
		for(i=5;i<=20;)
		{
			System.out.println(i);
			i=i+1;
		}
	}
	
	public void whileloop()
	{
		int i =21;
		while(i<20)
		{
			System.out.println(i);
			i=i+2;
		}
	}
	
	public void dowhileloop()
	{
		int i =21;
		do
		{
			System.out.println(i);
			i=i+2;
		}while(i<20);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loopconcpets l = new Loopconcpets();
		l.dowhileloop();
	}

}
