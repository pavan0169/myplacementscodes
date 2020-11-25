package important;
import java.util.*;

public class BinarySearch 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int s=sc.nextInt();
		Arrays.sort(arr);
		int index=binarySearch(arr,s);
		System.out.println(index);
	}
	
	public static int binarySearch(int[] arr, int s)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==s)
			{
				return mid;
			}
			else if(arr[mid]>s)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;
	}
}
