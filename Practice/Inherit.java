
class Parent 
{
	public void m1()
	{
		System.out.println("Parent:m1()");
	}
	public void m1(String a)
	{
		System.out.println("Parent:m1(String)");
	}
	public void m2()
	{
		System.out.println("Parent:m2()");
	}
}
class Child extends Parent
{
	public void m3()
	{
		System.out.println("Child---Parent:m3()");
	}
	public void m2()
	{
		System.out.println("Child---Parent:m2()");
	}
}
class Test
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.m1("abc");
		p.m1();
		
		
		Child c=new Child();
		c.m1("abc");
		c.m1();
		c.m2();
		c.m3();
		
		
		Parent p1=new Child();
		p1.m1("abc");    /*ide parent method kaabatti, inheritance compile time polymorphism kaabatti
							(Parent i1) is parent class reference kaabatti accepted*/
		p1.m1();         //
		p1.m2();         /*  ans: Child---Parent:m2() which is in child class, endukante ikkada manam override chestunnam
		 						override runtime polymorphism. new Child() aneedi run time ki related   */
		//i1.m3();       
		/*ide child method kaabatti, inheritance compile time polymorphism kaabatti
		(Parent i1) is parent class reference kaabatti accepted */
	}
}



