package basic;
import java.util.*;

public class BinaryToDecimal 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int bin=sc.nextInt();
		int rem;
		double dec=0;
		for(int i=0; bin>0; i++)
		{
			rem=bin%10;
			dec=dec+rem*Math.pow(2, i);
			bin=bin/10;
		}
		System.out.println((int)dec);
	}
}
