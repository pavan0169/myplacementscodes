package Thread;

class MyThread2 implements Runnable
{
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class ThreadDemo2 {
	public static void main(String[] args)
	{
		MyThread2 t2=new MyThread2();
		Thread t=new Thread(t2);
		t.start();
		for(int i=0; i<100; i++)
		{
			System.out.println("Main Thread");
		}
	}
}
