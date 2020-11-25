package langPackage;

public class EqualsMeth
{
	String name;
	int rollno;
	EqualsMeth(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public static void main(String[] args)
	{
		EqualsMeth c1=new EqualsMeth("pavan",123);
		EqualsMeth c2=new EqualsMeth("pavan",123);
		EqualsMeth c3=new EqualsMeth("krishna",123);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}
	
	

}
