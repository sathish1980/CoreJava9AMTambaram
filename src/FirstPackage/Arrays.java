package FirstPackage;

public class Arrays {
	
	int[] age = {20,35,45,55,65};
	char[] alphabets = {'a','b','c','d'};
	
	int[] fees = new int[5];
	int[][] feestwo = new int[5][2];
	
	int[][] agetwo = {{20,35,45,55,65},
			{20,35,45,55},
			{20,35,45,55,65}
			};
	
	public void Arrayimplementation()
	{
		
		System.out.println(age[1]);
		//age[5]=95;
		fees[0]=1000;
		fees[1]=1000;
		fees[2]=1000;
		fees[3]=1000;
		fees[4]=1000;
		System.out.println(age.length);
		for (int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);	
		}
		
		for(int a : fees)
		{
			System.out.println(a);
		}
		
		
		System.out.println(agetwo[2][3]);
		for (int i=0;i<agetwo.length;i++)
		{
			for (int j=0;j<agetwo[i].length;j++)
			{
			
			System.out.print(agetwo[i][j]);	
			System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays a = new Arrays();
		a.Arrayimplementation();
	}

}
