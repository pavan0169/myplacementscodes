package company;
import java.util.*;

public class Anagram 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean b=anagram(s1,s2);
		System.out.println(b);
	}
	
	public static boolean anagram(String s1, String s2)
	{
		int[] hash=new int[26];
		for(int i=0; i<s1.length(); i++)
		{
			int c=s1.charAt(i)-'a';
			hash[c]++;
		}
		for(int i=0; i<s2.length(); i++)
		{
			int c=s2.charAt(i)-'a';
			hash[c]--;
		}
		int count=0;
		for(int i=0; i<26; i++)
		{
			if(hash[i]!=0)
			{
				count=count+hash[i];
			}
		}
		System.out.println(Math.abs(count));
		return count==0;
	}
}
