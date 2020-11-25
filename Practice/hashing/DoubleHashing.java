package hashing;
import java.util.*;
public class DoubleHashing
{
	String[] hashtable;
	int cellsfilled;
	
	public DoubleHashing()
	{
		this.hashtable=new String[13];
		this.cellsfilled=0;
	}
	
	public int simplehashfunction(String str, int m)
	{
		char[] ch=str.toCharArray();
		int sum=0;
		for(int x:ch)
		{
			sum+=x;
		}
		return sum%m;
	}
	
	public int secondhashing(String str, int m)
	{
		char[] ch=str.toCharArray();
		int num=0;
		for(int x:ch)
		{
			num+=x;
		}
		int n=0;
		int sum=0;
		while(num>0)
		{
			n=num%10;
			sum=sum+n;
			num=num/10;
		}
		return sum%m; 
	}
	
	public double getLoadfactor()
	{
		double loadfactor=cellsfilled*1.0/hashtable.length;
		return loadfactor;
	}
	
	public void rehash(String str)
	{
		cellsfilled=0;
		ArrayList<String> in=new ArrayList<>();
		for(String s:hashtable)
		{
			if(s!=null)
			{
				in.add(s);
			}
		}
		in.add(str);
		hashtable=new String[hashtable.length*2];
		for(String s:in)
		{
			insert(s);
		}
	}
	
	public void insert(String str)
	{
		int index1=simplehashfunction(str, hashtable.length);
		int index2=secondhashing(str,hashtable.length);
		double loadfactor=getLoadfactor();
		if(loadfactor>=0.75)
		{
			rehash(str);
		}
		else
		{
			for(int i=index1; i<index1+hashtable.length; i++)
			{
				int newindex=(index1+(index2*i))%hashtable.length;
				if(hashtable[newindex]==null)
				{
					hashtable[newindex]=str;
					break;
				}
			}
		}
		cellsfilled++;
	}
	
	public boolean search(String str)
	{
		int index=simplehashfunction(str,hashtable.length);
		for(int i=index; i<index+hashtable.length; i++)
		{
			int newindex=i%hashtable.length;
			if(hashtable[newindex]!=null && hashtable[newindex].contentEquals(str))
			{
				return true;
			}
		}
		return false;
	}
	
	public void delete(String str)
	{
		int index=simplehashfunction(str, hashtable.length);
		for(int i=index; i<index+hashtable.length; i++)
		{
			int newindex=i%hashtable.length;
			if(hashtable[newindex]!=null && hashtable[newindex].contentEquals(str))
			{
				hashtable[newindex]=null;
				return;
			}
		}
	}
	
	public void displayHashTable()
	{
		System.out.println("-----------------HASHTABLE---------------");
		for(int i=0; i<hashtable.length; i++)
		{
			System.out.println("Index:"+i +".    Key:"+hashtable[i]);
		}
	}
}
