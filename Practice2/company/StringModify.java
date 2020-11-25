package company;
import java.util.*;

public class StringModify 
{
	public static void main(String[] arge)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String out1=modify(s);
		String out=captilize(out1);
		System.out.println(out);
	}
	
	public static String modify(String s)
	{
		String out="";
		int k=1;
		for(int i=0; i<s.length(); i++)
		{
			int ch=s.charAt(i);
			int dup=k;
			if(ch+k>122)
			{
				k=k-(122-ch);
				k=k%26;
				out=out+(char)(96+k);
			}
			else
			{
				out=out+(char)(ch+k);
			}
			k=dup;
		}
		return out;
	}
	
	public static String captilize(String s)
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
}
 