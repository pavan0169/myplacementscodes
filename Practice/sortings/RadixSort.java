package sortings;
public class RadixSort 
{
	public static void main(String[] args)
	{
		int[] arr= {21,652,1,7,6,212,90,31,224};
		
	}
	
	public static int findlarge(int[] arr)
	{
		int max=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void radixsort(int[] arr)
	{
		int[][] buckets=new int[10][10];
	}
}
