package Thread;

class A
{
	public synchronized void m1(B b)
	{
		System.out.println("A class m1 method");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{	}
		System.out.println("A class calling B.last");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("B.last");
	}
}
class B
{
	public synchronized void m2(A a)
	{
		System.out.println("A class m1 method");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{	}
		System.out.println("B class calling A.last");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("B.last");
	}
}
public class Deadlock extends Thread
{
	A a=new A();
	B b=new B();
	public void run()
	{
		b.m2(a);
	}
	public void m4()
	{
		this.start();
		a.m1(b);
	}
	public static void main(String[] args)
	{
		Deadlock d=new Deadlock();
		d.m4();
	}
}
