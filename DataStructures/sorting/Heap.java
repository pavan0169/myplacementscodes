package sorting;

public class Heap 
{
	public static void sort(int[] arr)
	{
		int size=arr.length-1;
		builtHeap(arr, 0, size);
		
		while(size>0)
		{
			int temp=arr[0];
			arr[0]=arr[size];
			arr[size]=temp;
			size--;
			heapify(arr,0,size);
		}
	}
	
	static void builtHeap(int[] arr, int index, int size)
	{
		for(int i=size/2; i>=0; i--)
		{
			heapify(arr, i, size);
		}
	}
	
	static void heapify(int[] arr, int index, int size)
	{
		int left=index*2+1;
		int right=left+1;
		int max=index;
		
		if(left<=size && arr[left]>arr[max])
		{
			max=left;
		}
		if(right<=size && arr[right]>arr[max])
		{
			max=right;
		}
		if(max!=index)
		{
			int temp=arr[max];
			arr[max]=arr[index];
			arr[index]=temp;
			heapify(arr, max, size);
		}
	}
}
