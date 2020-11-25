package trees;

public class BinaryHeap 
{
	int[] arr;
	int sizeOfTree;
	 
	public BinaryHeap(int size)
	{
		this.sizeOfTree=0;
		this.arr=new int[size+1];
		
	}
	
	//helper methods 2===>   1) HeapifyBottemToTop 2)HeapifyTopToBottem
	public void heapifyBottemToTop(int index)
	{
		int parent=index/2;
		if(index<=1)       //we at at the root so no more heapify
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
		int minvalue=0;
		if(sizeOfTree<left)
		{
			return;
		}
		else if(sizeOfTree==left)    //left is the only node in the tree so compare it
		{
			if(arr[index]>arr[left])
			{
				int tmp=arr[index];
				arr[index]=arr[left];
				arr[left]=tmp;
			}
			return;
		}
		else                     //both childs are present then
		{
			if(arr[left]>arr[right])
			{
				minvalue=right;
			}
			else
			{
				minvalue=left;
			}
			
			if(arr[minvalue]<arr[index])
			{
				int temp=arr[minvalue];
				arr[minvalue]=arr[index];
				arr[index]=temp;
			}
		}
		heapifyTopToBottem(minvalue);
	}
	
	public void insertIntoHeap(int value)
	{
		arr[sizeOfTree+1] = value;
		sizeOfTree++;
		heapifyBottemToTop(sizeOfTree);
	}
	
	public void extractTop()
	{
		int topvalue=arr[1];
		arr[1]=arr[sizeOfTree];
		sizeOfTree--;
		System.out.print(topvalue);
		heapifyTopToBottem(1);
	}
	
	public void traversal()
	{
		for(int i=1; i<=sizeOfTree; i++)
		{
			System.out.print(arr[i]+" "); 
		}
	}
	
}
