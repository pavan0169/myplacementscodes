package important;

import java.util.Arrays;
import java.util.Scanner;

public class CountLeftRotate 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int s=sc.nextInt();
		Arrays.sort(arr);
		int[] rotate=rightRotate(arr,s);
		int out=countRightRotations(rotate);
		System.out.println(out);
	}
	
	public static int[] rightRotate(int[] arr, int x)
	{
		int len=arr.length;
		int[] out=new int[len];
		for(int i=0; i<len; i++)
		{
			out[(x+i)%len]=arr[i];
		}
		return out;
	}
	
	public static int countRightRotations(int[] arr)
	{
		int n=arr.length;
		int first=0;
		int last=arr.length-1;
		while(first<=last)
		{
			if(arr[first]<=arr[last])
			{
				return first;
			}
			int mid=(first+last)/2;
			int next=(mid+1)%n;
			int prev=(mid+n-1)%n;
			if(arr[mid]<=arr[next] && arr[mid]<=arr[prev])
			{
				return mid;
			}
			else if(arr[mid]<=arr[last])
			{
				last=mid-1;
			}
			else if(arr[mid]>=arr[first])
			{
				first=mid+1;
			}
		}
		return -1;
	}
}
