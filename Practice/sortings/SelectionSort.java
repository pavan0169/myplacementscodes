package sortings;

public class SelectionSort 
{
	public static void main(String[] args)
	{
		int[] arr= {34,21,5,67,3,2,11,53,22,87,32};
		int min;
		for(int i=0; i<arr.length; i++)
		{
			min=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
}
