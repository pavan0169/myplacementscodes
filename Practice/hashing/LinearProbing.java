package hashing;
import java.util.*;

public class LinearProbing 
{
	String[] hashtable;
	int filledcells;
	
	public LinearProbing()
	{
		this.hashtable=new String[6];
		filledcells=0;
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
	
	public double getLoadfactor()
	{
		double loadfactor=filledcells*1.0/hashtable.length;
		return loadfactor;
	}
	
	public void insert(String str)
	{
		double loadfactor=getLoadfactor();
		if(loadfactor>=0.75)
		{
			rehash(str);
		}
		else
		{
			int index=simplehashfunction(str,hashtable.length);
			for(int i=index; i<index+hashtable.length; i++)
			{
				int newindex=i%hashtable.length;
				if(hashtable[newindex]==null)
				{
					hashtable[newindex]=str;
					break;
				}
			}
		}
		filledcells++;
	}
	
	public void rehash(String str)
	{
		filledcells=0;
		ArrayList<String> in=new ArrayList<String>();
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
	
	public boolean search(String str)
	{
		int index=simplehashfunction(str,hashtable.length);
		for(int i=index; i<index+hashtable.length; i++)
		{
			int newindex=i%hashtable.length;
			if(hashtable[newindex] !=null && hashtable[newindex].contentEquals(str))
			{
				return true; 
			}
		}
		return false;
	}
	
	
	public void delete(String str)
	{
		int index=simplehashfunction(str,hashtable.length);
		for(int i=index; i<index+hashtable.length; i++)
		{
			int newindex=i%hashtable.length; 
			if(hashtable[newindex]!=null && hashtable[newindex].equals(str))
			{
				hashtable[newindex]=null;
				return;
			}
		}
	}
	
	public void displayhashtable() {
		if(hashtable == null) {
			System.out.println("\nHashTable does not exits !");
			return;
		}else {
			System.out.println("\n---------- HashTable ---------");
			for (int i = 0; i < hashtable.length; i++) {
				System.out.println("Index:" + i + ".   Key:" + hashtable[i]);
			}
		}
		System.out.println("\n");
	}
}
