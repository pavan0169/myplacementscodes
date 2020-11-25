package Thread;

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			System.out.println("Child-Thread");
		}
	}
}

public class ThreadDemo1 {
	public static void main(String[] args)
	{
		MyThread1 t1=new MyThread1();
		t1.start();
		for(int i=0; i<100; i++)
		{
			System.out.println("Main-Thread");
		}
	}
}
