package SortingDSA;

public class SelectionSorting 
{
	public static void selectionSort(int[] a)
	{
		int l=a.length;
		int min;
		int temp=0;
		for(int i=0; i<l;i++)
		{
			min=i;
			for(int j=i+1; j<l;j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr= {90,43,2,3,4,54,1,56,22};
		System.out.println("Elements before selection sorting:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		selectionSort(arr);
		System.out.println("Elements after selection sorting:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
