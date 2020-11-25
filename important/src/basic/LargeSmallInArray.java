package basic;

import java.util.Scanner;

public class LargeSmallInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(max+" "+min);
	}
}
