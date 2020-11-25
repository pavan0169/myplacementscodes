package sortings;

public class Sort 
{
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
}
