package sorting;

public class Quick 
{
	public static void sort(int[] arr)
	{
		quickSort(arr, 0, arr.length-1);
	}
	
	static void quickSort(int[] arr, int first, int last)
	{
		if(first<last)
		{
			int pIndex=partition(arr, first, last);
			quickSort(arr, first, pIndex-1);
			quickSort(arr, pIndex+1, last);
		}
	}
	
	static int partition(int[] arr, int first, int last)
	{
		int index=first;
		int pivot=arr[last];
		for(int i=first; i<last; i++)
		{
			if(arr[i]<pivot)
			{
				int temp=arr[index];
				arr[index]=arr[i];
				arr[i]=temp;
				index++;
			}
		}
		int temp=arr[last];
		arr[last]=arr[index];
		arr[index]=temp;
		return index;
	}
}
