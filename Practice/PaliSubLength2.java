import java.util.*;
public class PaliSubLength2 
{
	static Scanner sc=new Scanner(System.in);
	static String s=sc.nextLine();
	static int l=s.length();
	public static void main(String[] args)
	{
		if(isPalindrome(s))
		{
			if(l%2==0)
				System.out.println(l/2);
			else
				System.out.println((l/2)+1);
		}
		else
			System.out.println("Not at all a pali");
	}
	public static Boolean isPalindrome(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		String s1=new String(sb.reverse());
		if(s1.equals(s))
			return true;
		else
			return false;
	}

}
