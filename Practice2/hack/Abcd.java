package hack;
import java.util.*;

public class Abcd 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gcd=gcd(n1,n2);
		sc.close();
		System.out.println(gcd);
	}
	public static int gcd(int n1, int n2)
	{
		int gcd=0;
		for(int i=1; i<=n1 && i<=n2; i++)
		{
			if((n1%i==0) && (n2%i==0))
			{
				gcd=i;
			}
		}
		return gcd;
	}
}
