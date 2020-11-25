package important;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchLastOccurance 
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
		int index=binarySearchLastOccurance(arr,s);
		System.out.println(index);
	}
	
	public static int binarySearchLastOccurance(int[] arr, int s)
	{
		int first=0;
		int last=arr.length-1;
		int result=-1;
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(arr[mid]==s)
			{
				result=mid;
				first=mid+1;
			}
			else if(arr[mid]>s)
			{
				last=mid-1;
			}
			else
			{
				first=mid+1;
			}
		}
		return result;
	}
}
