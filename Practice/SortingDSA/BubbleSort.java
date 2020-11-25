package SortingDSA;
public class BubbleSort 
{
	public static void bubbleSort(int[] arr)
	{
		int l=arr.length;
		int temp=0;
		for(int i=0; i<l-1; i++)
		{
			for(int j=0; j<l-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr= {90,43,2,3,4,54,1,56,22};
		System.out.println("Elements before bubble sorting:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("Elements after bubble sorting:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
