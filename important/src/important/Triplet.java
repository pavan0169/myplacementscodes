package important;

import java.util.*;

public class Triplet 
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
		int sum=sc.nextInt();
		sc.close();
		List<List<Integer>> out=triplets(arr, sum);
		for(List<Integer> list: out)
		{
			System.out.println(list);
		}
	}
	
	public static List<List<Integer>> triplets(int arr[], int targetsum)
	{
		Arrays.sort(arr);
		
		List<List<Integer>> trpls=new ArrayList<>();
		for(int i=0; i<arr.length-2; i++)
		{
			int sum=targetsum-arr[i];
			
			int start=i+1;
			int end=arr.length-1;
			
			while(start<end)
			{
				int t=arr[start]+arr[end];
				if(t==sum)
				{
					trpls.add(Arrays.asList(arr[start],arr[end],arr[i]));
					start++;
					end--;
				}
				else if(t<sum)
				{
					start++;
				}
				else
				{
					end--;
				}
			}
		}
		return trpls;
	}
}
