package problems;
import java.util.*;

public class IncrementEveryChar 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String vow=capitalVowel(s);
		String os=incrementEveryChar(vow);
		System.out.println(os);
	}
	
	public static String capitalVowel(String s)
	{
		String out="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				ch=Character.toUpperCase(ch);
			}
			out=out+ch;
		}
		return out;
	}
	
	public static String incrementEveryChar(String s)
	{
		String out="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				ch++;
				out=out+ch;
			}
			else
			{
				out=out+ch;
			}
		}
		return out;
	}
}
