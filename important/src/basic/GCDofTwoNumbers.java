package basic;
import java.util.*;
public class GCDofTwoNumbers 
{
	public static int gcdOfTwoN(int a, int b)
	{
		if(b==0)
			return a;
		return gcdOfTwoN(b , a%b);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcdOfTwoN(a,b));
	}
} 
