package company;
import java.util.*;

public class StringCount 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] strs=new String[n];
		for(int i=0; i<strs.length; i++)
		{
			strs[i]=sc.next();
		}
		countStrings(strs);
	}
	
	public static void countStrings(String[] strs)
	{
		HashMap<String,Integer> hash=new HashMap<>();
		for(String s: strs)
		{
			hash.put(s, hash.getOrDefault(s, 0)+1);
			if(hash.get(s)>1)
			{
				System.out.print(s+hash.get(s)+" ");
			}
			else
			{
				System.out.print(s+" ");
			}
		}
		
	}
}
