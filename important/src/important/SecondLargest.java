package important;

import java.util.Scanner;

public class SecondLargest 
{
	public static void main(String[] arhs)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int out=secondLarge(arr);
		System.out.println(out);
	}
	
	public static int secondLarge(int[] arr)
	{
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(first<arr[i])
			{
				second=first;
				first=arr[i];
			}
			else if(second<arr[i] && arr[i]!=first)
			{
				second=arr[i];
			}
		}
		
		return second;
		
	}
}
