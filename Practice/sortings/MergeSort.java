package sortings;
public class MergeSort 
{
	public static void main(String[] args)
	{
		int[] arr= {10,4,19,4,19,55,82,14};
		MergeSort ms=new MergeSort();
		ms.sort(arr, 0, arr.length-1);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public void sort(int[] arr, int lower, int higher)
	{
		if(lower<higher)
		{
			int mid=(lower+higher)/2; 
			sort(arr, lower, mid);
			sort(arr, mid+1, higher);
			merge(arr, lower, mid, higher);
		}
	}
	
	public void merge(int[] arr, int lower, int middle, int higher)
	{
		int l=middle-lower+1;
		int r=higher-middle;
		//create temp array
		int[] left=new int[l];
		int[] right=new int[r];
		//add all the elements into temp arrays
		for(int i=0; i<l; i++)
		{
			left[i]=arr[lower+i];
		}
		for(int j=0; j<r; j++)
		{
			right[j]=arr[middle+1+j];
		}
		
		int i=0; 
		int j=0;
		int k=lower;
		
		 while (i < l && j < r) 
		 {
			 if (left[i] <= right[j])
			 {
				 arr[k] = left[i];
				 i++; 	 
			 } 
			 else
			 {
				 arr[k] = right[j]; 
	             j++; 
	         }
			 k++;
		 }
		 while (i < l)
		 {
			 arr[k] = left[i]; 
	         i++; 
	         k++;
		 }
		 while(j<r)
		 {
			 arr[k] = right[j]; 
	         j++; 
	         k++;
		 }
		 
	}
}
