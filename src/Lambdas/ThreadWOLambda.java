package Lambdas;

class ThreadClass implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("This is from custom ThreadClass");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadWOLambda
{
	public static void main(String[] args) throws InterruptedException 
	{
		Runnable r = new ThreadClass();
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("This is from main thread");
			Thread.sleep(1000);
		}	
	}
}

class TestClass{
	
	public void testMethod()
	{
		System.out.println("This is a test context");
	}
}

