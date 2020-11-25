
public class StaticVar1 {
	int a;
	static int b;
	public void show()
	{
		System.out.println(a+"..."+b);
	}
	public static void main(String[] args)
	{
		StaticVar1 s1=new StaticVar1();
		s1.a=10;
		
		StaticVar1 s2=new StaticVar1();
		s2.a=22;
		StaticVar1 s3=new StaticVar1();
		s3.a=11;
		
		
		
		b=30;
		s1.show();
		s2.show();
		s3.show();
	}

}
