package Thread;
class A1
{
	public static synchronized void m1(B1 b)
	{
		System.out.println("A1 class m1 method");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{	}
		System.out.println("A1 class calling B.last");
		b.last();
	}
	public static synchronized void last()
	{
		System.out.println("B1.last");
	}
}
class B1
{
	public static synchronized void m2(A1 a)
	{
		System.out.println("A1 class m1 method");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{	}
		System.out.println("B1 class calling A.last");
		a.last();
	}
	public static synchronized void last()
	{
		System.out.println("B1.last");
	}
}
public class Deadlock2 extends Thread
{
	static A1 a=new A1();
	static B1 b=new B1();
	public void run()
	{
		b.m2(a);
	}
	public static void main(String[] args)
	{
		Deadlock2 d=new Deadlock2();
		d.start();
		a.m1(b);
	}
}
