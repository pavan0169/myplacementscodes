package sortings;

import java.util.Scanner;

public class Quick 
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
		int[] a=quickSort(arr);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static int[] quickSort(int[] arr)
	{
		return quickSort(arr,0,arr.length-1);
	}
	
	public static int[] quickSort(int[] arr, int start, int end)
	{
		if(start<end)
		{
			int pindex=partition(arr,start,end);
			quickSort(arr,start,pindex-1);
			quickSort(arr,pindex+1,end);
		}
		return arr;
	}
	
	public static int partition(int[] arr, int start, int end)
	{
		int index=start;
		int pivot=arr[end];
		for(int i=start; i<end; i++)
		{
			if(arr[i]<pivot)
			{
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		int temp=arr[index];
		arr[index]=arr[end];
		arr[end]=temp;
		return index;
	}
}
