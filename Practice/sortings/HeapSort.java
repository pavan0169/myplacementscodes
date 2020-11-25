package sortings;

public class HeapSort 
{
	int[] arr;
	int sizeOfTree;
	
	public HeapSort(int size)
	{
		this.arr=new int[size+1];
		this.sizeOfTree=0;
	}
	
	public void heapifyBottemToTop(int index)
	{
		int parent=index/2;
		if(index<=1)
		{
			return;
		}
		if(arr[index]<arr[parent])
		{
			int temp=arr[index];
			arr[index]=arr[parent];
			arr[parent]=temp;
		}
		heapifyBottemToTop(parent); 
	}
	
	public void heapifyTopToBottem(int index)
	{
		int left=index*2;
		int right=index*2+1;
		int min=0;
		if(sizeOfTree<left)
		{
			return;
		}
		else if(sizeOfTree==left)
		{
			if(arr[index]>arr[left])
			{
				int temp=arr[index];
				arr[index]=arr[left];
				arr[left]=temp;
			}
			return;
		}
		else
		{
			if(arr[left]>arr[right])
			{
				min=right;
			}
			else
			{
				min=left;
			}
			
			if(arr[index]>arr[min])
			{
				int tmp=arr[index];
				arr[index]=arr[min];
				arr[min]=tmp;
			}
		}
		heapifyTopToBottem(min);
	}
	
	public void insertIntoHeap(int value)
	{
		arr[sizeOfTree+1] = value;
		sizeOfTree++;
		heapifyBottemToTop(sizeOfTree);
	}
	
	public void extractTop()
	{
		int top=arr[1];
		arr[1]=arr[sizeOfTree];
		sizeOfTree--;
		System.out.print(top);
		heapifyTopToBottem(1);
	}
}
