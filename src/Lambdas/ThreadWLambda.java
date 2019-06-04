package Lambdas;

public class ThreadWLambda 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Runnable r = () -> {
			Thread t = Thread.currentThread();
			t.setName("Test thread");
			System.out.println(t.getPriority());
			for (int i = 0; i < 10; i++) {
				System.out.println("This is the thread from: "+t.getName());
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		};
		Thread t2 = Thread.currentThread();
		System.out.println(t2.getPriority());
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("This the main thread from: "+t2.getName());
			Thread.sleep(1000);
		}
	}
}
