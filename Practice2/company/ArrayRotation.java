package company;

import java.util.Scanner;

public class ArrayRotation 
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
		int[] result=leftRotate(arr,r);
		for(int i=0; i<n; i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	
	public static int gcd(int a, int b)
	{
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	
	public static int[] leftRotate(int[] arr, int k)
	{
		int n=arr.length;
		int p=gcd(n,k);
		for(int i=0; i<p; i++)
		{
			int j=i;
			int temp=arr[i];
			while(true)
			{
				int d=(j+n+k)%n;
				if(i==d)
					break;
				arr[j]=arr[d];
				j=d;
			}
			arr[j]=temp;
		}
		return arr;
	}
}
