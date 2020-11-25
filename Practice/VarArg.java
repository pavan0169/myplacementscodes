
public class VarArg {
	static int sum;
	public static void main(String[] args)
	{
		m1(1,2,3);
		m1(1,3,4,5);
		m1(8,6,1);
		m1(55,2,4,23,6);
	}
	public static void m1(int... x)
	{
		for(int x1:x)
		{
			sum=sum+x1;
		}
		System.out.println(sum);
	}

}
