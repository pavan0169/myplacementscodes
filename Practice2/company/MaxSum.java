package company;

import java.util.*;
public class MaxSum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		int d=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		maxsum(n,w,d,arr);
	}
	
	public static void maxsum(int n, int w, int d, int[] arr)
	{
		int max_of_a=maxwindow(arr,w);
		int max_of_b=maxwindow(arr,w+d);
		//System.out.println(max_of_a+" "+max_of_b);
		int ans=Math.abs(max_of_b-max_of_a);
		if(max_of_a>max_of_b)
		{
			System.out.println("Wrong "+ans);
		}
		else if(max_of_a<max_of_b)
		{
			System.out.println("Right "+ans);
		}
		else
		{
			System.out.println("Tie "+ans);
		}
	}
	
	public static int maxwindow(int[] arr, int w)
	{
		int[] sums=new int[arr.length];
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
			sums[i]=sum;
		}
		int max=Integer.MIN_VALUE;
		int diff=0;
		for(int i=w-1,j=0; i<arr.length; i++,j++)
		{
			max=Math.max(max, sums[i]-diff);
			diff=sums[j];
		}
		return max;
	}
}
