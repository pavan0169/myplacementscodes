package basic;
import java.util.*;

public class DecimalToBinary 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem;
		int res[]=new int[32];
		int i=0;
		while(n>0)
		{
			rem=n%2;
			res[i]=rem;
			n=n/2;
			i++;
		}
		for(int j=i-1; j>=0; j--)
		{
			System.out.print(res[j]); 
		}
	}
}
