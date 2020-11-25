import java.util.*;
public class StringValue 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] cha=s.toCharArray();
		int sum=0;
		for(int x1:cha)
		{
			sum+=x1;
		}
		System.out.println(sum);
		sc.close();
	}
}
