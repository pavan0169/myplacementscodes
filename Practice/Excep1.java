import java.util.*;
import java.lang.Math.*;
public class Excep1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		System.out.println(calc(n,p));
	}
	public static double calc(int n,int p)
	{
		if(n==0 || p==0)
		{
			throw new ArithmeticException(" Zero invalid");
		}
		else if(n<0 || p<0)
		{
			throw new ArithmeticException(" minus numbers are invalid");
		}
		double z=Math.pow(n, p);
		return z;
	}
}
