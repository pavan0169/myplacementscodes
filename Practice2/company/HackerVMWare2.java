package company;
import java.util.*;

public class HackerVMWare2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		System.out.println("NO.OF ELEMENTS :");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("LIST-1 STRINGS :");
		for(int i=0; i<n; i++)
		{
			list1.add(sc.nextLine());
		}
		System.out.println("LIST-2 STRINGS :");
		for(int i=0; i<n; i++)
		{
			list2.add(sc.nextLine());
		}
		sc.close();
		List<Integer> out=anagram(list1,list2);
		for(int j=0; j<out.size(); j++)
		{
			System.out.println(out.get(j));
		}
	}
	
	public static List<Integer> anagram(List<String> a,List<String> b)
	{
		String a1="";
		String b1="";
		List<Integer> out=new ArrayList<>();
		for(int i=0; i<a.size(); i++)
		{
			a1=a.get(i);
			b1=b.get(i);
			
			if(a1.length()!=b1.length())
			{
				out.add(-1);
			}
			else
			{
				char[] ch1=a1.toCharArray();
				char[] ch2=b1.toCharArray();
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				int count=0;
				for(int j=0; j<ch1.length; j++)
				{
					if(ch1[j]==ch2[j])
					{
						continue;
					}
					else
					{
						count++;
					}
				}
				out.add(count);
			}
		}
		return out;
	}
}
