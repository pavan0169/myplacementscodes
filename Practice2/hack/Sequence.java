package hack;
import java.util.*;

public class Sequence 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for(int i=0; i<q; i++)
		{
			double a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			
			for(int j = 0; j < n; j++)
			{
                a = a + Math.pow(2,j)*b;
                System.out.print(a + " ");
			}
			System.out.println("");
		}
	}
}
