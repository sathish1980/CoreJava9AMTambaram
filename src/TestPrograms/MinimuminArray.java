package TestPrograms;

public class MinimuminArray {
	
	int[] a= {5,7,3,9};
	int[] b= {1,10,45};
	
	public void GetMinimumValue()
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			for(int j=0;j<b.length;j++)
			{
				if(a[j]<b[i])
				{
					temp=a[i];
				}
			}
			System.out.println(temp);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimuminArray M = new MinimuminArray();
		M.GetMinimumValue();
	}

}
