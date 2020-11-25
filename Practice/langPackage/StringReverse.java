package langPackage;

public class StringReverse {
	public static void main(String[] args)
	{
		String s1="(A+B)+C*D";
		StringBuffer s2=new StringBuffer(s1);
		s2.reverse();
		System.out.println(s2);
	}
}
