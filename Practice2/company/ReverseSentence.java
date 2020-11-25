package company;

import java.util.Scanner;

public class ReverseSentence 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String b=reverseSentence(s1);
		System.out.println(b);
	}
	
	public static String reverseSentence(String s)
	{
		String out="";
		String[] strarr=s.split(" ");
		for(int i=strarr.length-1; i>=0; i--)
		{
			out=out+strarr[i];
			if(i>0)
				out=out+" ";
		}
		return out;
	}
}
