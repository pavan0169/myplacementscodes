package important;

import java.util.Scanner;

public class EquilibriumPoint 
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
		int ans=equil(arr);
		System.out.println(ans);
	}
	
	public static int equil(int[] arr)
	{
		int[] sum=new int[arr.length];
		int tot=0;
		
		for(int i=0; i<sum.length; i++)
		{
			tot=tot+arr[i];
			sum[i]=tot;
		}
		for(int i=0; i<arr.length; i++)
		{
			int leftsum=sum[i]-arr[i];//System.out.println(leftsum);
			int rightsum=tot-sum[i];//System.out.println(rightsum);
			if(leftsum==rightsum)
			{
				return i;
			}
		}
		return -1;
	}
}
