package basic;
import java.util.*;

public class PerfectSqure 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean p=isPsqrt(a);
		boolean q=isPsqrt2(a);
		System.out.println(p);
		System.out.println(q);
	}
	static boolean isPsqrt(int a)
	{
		int l=1;
		while(a>0)
		{
			a-=l;
			l+=2;
		}
		return a==0;
	}
	static boolean isPsqrt2(int a)
	{
		double m=Math.sqrt(a);
		if(m==(int)m)
		{
			return true;
		}
		return false;
	}
}
