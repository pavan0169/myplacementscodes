package hack;
import java.util.Scanner;

public class Coprimes 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		boolean coprime=isCoprime(n1,n2);
		System.out.println(coprime);
	}
	
	public static boolean isCoprime(int n1,int n2)
	{
		boolean coprime=true;
		for(int i=2; i<n1 && i<n2; i++)
		{
			if((n1%i==0) && (n2%i==0))
			{
				coprime=false;
				break;
			}
		}
		return coprime;
	}
}
