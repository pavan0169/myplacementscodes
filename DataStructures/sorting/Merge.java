package sorting;

public class Merge 
{
	public static void sort(int[] arr)
	{
		mergeSort(arr, 0, arr.length-1);
	}
	
	static void mergeSort(int[] arr, int first, int last)
	{
		if(first<last)
		{
			int mid=(first+last)/2;
			mergeSort(arr, first, mid);
			mergeSort(arr, mid+1,last);
			merger(arr,first,mid,last);
		}
	}
	
	static void merger(int[] arr, int first, int mid, int last)
	{
		int l=mid-first+1;
		int r=last-mid;
		int[] left=new int[l];
		int[] right=new int[r];
		for(int i=0; i<l; i++)
		{
			left[i]=arr[first+i];
		}
		for(int j=0; j<r; j++)
		{
			right[j]=arr[mid+j+1];
		}
		
		int i=0;
		int j=0;
		int k=first;
		while(i<l && j<r)
		{
			if(left[i]>right[j])
			{
				arr[k]=right[j];
				j++;
			}
			else
			{
				arr[k]=left[i];
				i++;
			}
			k++;
		}
		while(i<l)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<r)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
	}
}
