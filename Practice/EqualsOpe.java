
public class EqualsOpe {
	public static void main(String[] args)
	{
		String s1="Pavan";
		String s2="Pavan";
		
		String s3=new String("Pavan");
		String s4=new String("Pavan");
		
		StringBuffer s5=new StringBuffer("Pavan");
		StringBuffer s6=new StringBuffer("Pavan");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s5==s6);
		System.out.println(".....");
		System.out.println("s1.equals(s2) :"+s1.equals(s2));
		System.out.println("s3.equals(s4) :"+s3.equals(s4));
		System.out.println("s1.equals(s4) :"+s1.equals(s4));
		System.out.println("s5.equals(s6) :"+s5.equals(s6));
		




	}

}
