import java.util.*;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int fib=0;
		for(int i=0; i<n; i++)
		{
			System.out.print( a+" ");
			if(i==n-1)
			{
				System.out.print("\n"+a);
			}
			fib=a+b;
			a=b;
			b=fib;
		}
		
	}
}
