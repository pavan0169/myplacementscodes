package DataStructures;
import java.util.*;
public class BinarySearch 
{
	public static int binarySearch(int[] a,int first, int last, int key)
	{
		if(first<=last)
		{
			int mid=first+(last-first)/2;
			if(a[mid]==key)
			{
				return mid;
			}
			if(a[mid]>key)
			{
				return binarySearch(a,first,mid-1,key);
			}
			else
			{
				return binarySearch(a,mid+1,last,key);
			}
		}
		return-1;
	}
	public static void main(String[] args)
	{
		int[] a= {10,29,16,35,13,20,34,21,11};
		Arrays.sort(a);
		int last=a.length-1;
		int key=35;
		int d=binarySearch(a,0,last,key);
		if(d==-1)
			System.out.println("nothhere");
		else
			System.out.println(d);
	}
}
