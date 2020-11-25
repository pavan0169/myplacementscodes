package sortings;

public class QuickSort 
{
	public static void main(String[] args)
	{
		int[] arr= {12,64,14,76,24,54,2,3,34};
		QuickSort q=new QuickSort();
		q.quickSort(arr,0,arr.length-1);
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
	
	public void quickSort(int[] arr, int first, int last)
	{
		int pivot=partition(arr,first,last);
		if(first<pivot-1)
		{
			quickSort(arr,first,pivot-1);
		}
		if(pivot<last)
		{
			quickSort(arr,pivot,last);
		} 
	}
	
	public int partition(int[] arr, int first, int last)
	{
		int mid=(first+last)/2;
		int temp=0;
		while(first<=last)
		{
			while(arr[first]<arr[mid])
			{
				first++;
			}
			while(arr[mid]<arr[last])
			{
				last--;
			}
			if(first<=last)
			{
				temp=arr[first];
				arr[first]=arr[last];
				arr[last]=temp;
				first++;
				last--;
			}
		}
		return first; 
	}
}
