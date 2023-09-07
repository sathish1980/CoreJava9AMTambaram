package Secondpackage;

class anotherclass extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

class runType extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("This is sathish");
		}
	}
}
public class Threadsconcepts  {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		anotherclass a = new anotherclass();
		runType T = new runType();
		System.out.println(a.getPriority());
		
		a.start();
		T.start();
		if(a.isAlive())
		{
			System.out.println("Still execution");
		}
		a.join(); // wait for complete
		T.join();
		System.out.println( "bye...");
	}

}
