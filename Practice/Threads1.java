public class Threads1
{
	public static void main(String[] args)
	{
		Thread t=new Thread("Pavan");
		t.setPriority(3);
		System.out.println(t);
	}
}
