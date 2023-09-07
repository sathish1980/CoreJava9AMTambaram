package threadsConcepts;

class HDFC extends Thread
{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
		System.out.println("HDFC Amount");
		try {Thread.sleep(1000);} catch (InterruptedException e) {
		}
	}
	}
}

class SBI extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println(i);
		try {Thread.sleep(1000);} catch (InterruptedException e) {
		}
		}
	}
}
public class ThreadsConceptsImplementation {
	
	public void add()
	{
		System.out.println("This is addition");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadsConceptsImplementation T = new ThreadsConceptsImplementation();
		HDFC H = new HDFC();
		SBI S = new SBI();
		
		
		H.start();
		S.start();
		H.setName("HDFC Thread");
		if(H.isAlive())
		{
			System.out.println("I am still active");
			System.out.println(H.getName());
			System.out.println(H.getPriority());
		}
		H.join();
		S.join();
		if(H.isAlive())
		{
			System.out.println("I am still active");
		}
		else
		{
			System.out.println("You are not alive");
		}
		T.add();
		
	}

}
