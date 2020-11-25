package langPackage;

public class EqualsContentCompar 
{
	String name;
	int rollno;
	EqualsContentCompar(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public boolean equals(Object obj)
	{
		try
		{
			EqualsContentCompar c=(EqualsContentCompar)obj;
			if(name.equals(c.name) && rollno==c.rollno)
			{
				return true;
			}
			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		EqualsContentCompar c1=new EqualsContentCompar("pavan",123);
		EqualsContentCompar c2=new EqualsContentCompar("pavan",123);
		EqualsContentCompar c3=new EqualsContentCompar("krishna",123);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}
	
	

}
