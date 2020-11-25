package hashing;
import java.util.LinkedList;
public class DirectChaining 
{
	LinkedList<String>[] hashtable;
	
	public DirectChaining()
	{
		this.hashtable=new LinkedList[13];
	}
	
	public int hashfunction(String str, int m)
	{
		char[] ch=str.toCharArray();
		int sum=0;
		for(int x:ch)
		{
			sum+=x;
		}
		return sum%m;
	}
	
	public void insert(String str)
	{
		int hash=hashfunction(str,hashtable.length);
		if(hashtable[hash]==null)
		{
			hashtable[hash]=new LinkedList<String>();
			hashtable[hash].add(str);
			System.out.println("String "+str+" inserted");
		}
		else
		{
			hashtable[hash].add(str);
			System.out.println("String "+str+" inserted");
		}
	}
	
	public boolean search(String str)
	{
		int hash=hashfunction(str,hashtable.length);
		if(hashtable[hash]!=null && hashtable[hash].contains(str))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void delete(String str)
	{
		int hash=hashfunction(str,hashtable.length);
		if(hashtable[hash]!=null && hashtable[hash].contains(str))
		{
			System.out.println("String "+str+" Deleted");
			hashtable[hash].remove(str);
		}
		else
		{
			System.out.println("String not found");
		}
	}
}
