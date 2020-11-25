package company;
import java.util.*;
public class tcsswayamwar 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String bride=sc.nextLine();
		String groom=sc.nextLine();
		char[] b=bride.toCharArray();
		char[] g=groom.toCharArray();
		int pairs=caliculatePairs(n,b,g);
		System.out.println(pairs);
	}
	
	public static int caliculatePairs(int n, char[] b, char[] g)
	{
		int i=0;
		int j=0;
		while(i<n)
		{
			if(b[i]==g[j])
			{
				b[i]='0';
				g[j]='0';
				i++;
				j++;
				j=j%n;
			}
			else
			{
				int count=0;
				while(b[i]!=g[j] && count<n)
				{
					j++;
					j=j%n;
					count++;
				}
				if(count==n)
				{
					break;
				}
				b[i]='0';
				g[j]='0';
				i++;
				j++;
				j=j%n;
			}
		}
		int bc=0;
		int gc=0;
		for(int k=0; k<n; k++)
		{
			if(b[k]!='0')
			{
				bc++;
			}
			if(g[k]!='0')
			{
				gc++;
			}
		}
		return Math.min(gc, bc);
	}
}
