package important;
import java.util.*;
public class MaximumSumSubArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] out=maxSubArray(arr);
		for(int i=0; i<out.length; i++)
		{
			System.out.print(out[i]+" ");
		}
	}
	
	public static int[] maxSubArray(int[] arr)
	{
		int c_max=0;
		int max=Integer.MIN_VALUE;
		int left=0;
		int right=0;
		for(int i=0; i<arr.length; i++)
		{
			c_max=c_max+arr[i];
			if(c_max<arr[i])
			{
				left=i;
				c_max=arr[i];
			}
			if(max<c_max)
			{
				right=i;
				max=c_max;
			}
		}
		System.out.println(max);
		int[] out=new int[right-left+1];
		for(int i=0; i<out.length; i++)
		{
			out[i]=arr[left+i];
		}
		return out;
	}
}
