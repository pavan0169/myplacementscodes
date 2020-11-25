
public class InstanceVariables {
	int a;
	int b;
	InstanceVariables(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public void show()
	{
		System.out.println(a+"..."+b);
	}
	public static void main(String[] args)
	{
		InstanceVariables s1=new InstanceVariables(4,5);
		InstanceVariables s2=new InstanceVariables(6,8);
		InstanceVariables s3=new InstanceVariables(9,2);
		
		s1.show();
		s2.show();
		s3.show();
	}

}
