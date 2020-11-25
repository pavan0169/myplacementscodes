package company;
import java.util.*;
public class HackerVMWare 
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
		sc.close();
		int out=balancedArray(arr);
		System.out.println(out);
	}
	
	public static int balancedArray(int[] arr)
	{
		int first=0,pivot=1,last=arr.length-1; 

		for(int i=0; i<arr.length; i++)  
		{
			int sum1=0,sum2=0;
			while(first<pivot)
			{
				sum1=sum1+arr[first]; 
				first++;
			}
			while(pivot<last) 
			{
				sum2=sum2+arr[last];
				last--;
			}
			if(sum1==sum2)
			{
			}
			pivot++;
			first=0;
			last=arr.length-1;
		}
		return -1;
	}
}
