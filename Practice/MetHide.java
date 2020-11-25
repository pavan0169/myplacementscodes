class Parent1
{
	public static void meth()
	{
		System.out.println("Parent:m2()");
	}
}
class Child1 extends Parent1
{
	public static void meth()
	{
		System.out.println("Child---Parent:m2()");
	}
}
class Test1
{
	public static void main(String[] args)
	{
		Parent1 p3=new Child1();
		p3.meth();
	}
}