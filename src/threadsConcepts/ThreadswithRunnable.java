package threadsConcepts;

class tables implements Runnable
{

	public synchronized void run() {
		
		int a= 5;
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+" * "+ i +" = "+a*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadswithRunnable {

	public void today()
	{
		System.out.println("Today is Tuesday");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable T = new tables();
		Thread TT = new Thread(T);
		TT.start();
		TT.run();
		Thread T1 = new Thread(T);
		T1.start();
		T1.run();
	
	}

}
