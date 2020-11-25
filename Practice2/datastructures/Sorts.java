package datastructures;
import java.util.*;

public class Sorts 
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
		int[] out=mergeSort(arr);
		for(int i=0; i<n; i++)
		{
			System.out.print(out[i]+" ");
		}
	}
	
	public static int[] bubbleSort(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] insertionSort(int[] arr)
	{
		for(int i=1; i<arr.length; i++)
		{
			int value=arr[i];
			int index=i;
			while(index>0 && arr[index-1]>value)
			{
				arr[index]=arr[index-1];
				index--;
			}
			arr[index]=value;
		}
		return arr;
	}
	
	public static int[] selectionSort(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] quickSort(int[] arr)
	{
		return quickSort(arr, 0, arr.length-1);
	}
	
	public static int[] quickSort(int[] arr, int first, int last)
	{
		if(first<last)
		{
			int pindex=partition(arr,first,last);
			quickSort(arr,first,pindex-1);
			quickSort(arr,pindex+1,last);
		}
		return arr;
	}
	
	public static int partition(int[] arr, int first,int last)
	{
		int index=first;
		int pivot=arr[last];
		for(int i=first; i<last; i++)
		{
			if(arr[i]<pivot)
			{
				int value=arr[i];
				arr[i]=arr[index];
				arr[index]=value;
				index++;
			}
		}
		int value=arr[index];
		arr[index]=arr[last];
		arr[last]=value;
		return index;
	}
	
	public static int[] mergeSort(int[] arr)
	{
		mergeSort(arr, 0, arr.length-1);
		return arr;
	}
	
	static void mergeSort(int[] arr, int first, int last)
	{
		if(first<last)
		{
			int mid=(first+last)/2;
			mergeSort(arr, first, mid);
			mergeSort(arr, mid+1, last);
			merger(arr,first,mid,last);
		}
	}
	
	
	public static void merger(int[] arr, int lower, int middle, int higher)
	{
		int l=middle-lower+1;
		int r=higher-middle;
		//create temp array
		int[] left=new int[l];
		int[] right=new int[r];
		//add all the elements into temp arrays
		for(int i=0; i<l; i++)
		{
			left[i]=arr[lower+i];
		}
		for(int j=0; j<r; j++)
		{
			right[j]=arr[middle+1+j];
		}
		
		int i=0; 
		int j=0;
		int k=lower;
		
		 while (i < l && j < r) 
		 {
			 if (left[i] <= right[j])
			 {
				 arr[k] = left[i];
				 i++;
			 } 
			 else
			 {
				 arr[k] = right[j]; 
	             j++; 
	         }
			 k++;
		 }
		 while (i < l)
		 {
			 arr[k] = left[i]; 
	         i++; 
	         k++;
		 }
		 while(j<r)
		 {
			 arr[k] = right[j]; 
	         j++; 
	         k++;
		 }
		 
	}
}

























