package important;

import java.util.Scanner;

public class ArrayRightRotate 
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
		int r=sc.nextInt();
		sc.close();
		int[] result=rightRotate(arr,r);
		for(int i=0; i<n; i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	
	public static int[] rightRotate(int[] arr, int r)
	{
		int[] result=new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			result[(r+i)%arr.length]=arr[i];
		}
		return result;
	}
}
