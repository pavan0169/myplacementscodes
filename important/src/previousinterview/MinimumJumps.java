package previousinterview;

import java.util.*;

/*
 Given an array of integers where each element represents the max number of steps that can be made forward from that element. 
 Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). 
 If an element is 0, then we cannot move through that element.

Examples:

Input:  arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3 (1-> 3 -> 8 -> 9)
Explanation: Jump from 1st element to 
2nd element as there is only 1 step, 
now there are three options 5, 8 or 9. 
If 8 or 9 is chosen then the end node 9 
can be reached. So 3 jumps are made.

Input:  arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
Output: 10
Explanation: In every step a jump is 
needed so the count of jumps is 10.
 */
public class MinimumJumps 
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
		int ans=minimumJumps(arr);
		System.out.println(ans);
	}
	
	public static int minimumJumps(int[] arr)
	{
		int n=arr.length;
		if(n==0)
		{
			return 0;
		}
		if(arr[0]==0)
		{
			return 0;
		}
		int jumps=1;
		int maxreach=arr[0];
		int steps=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(i==n-1)
				return jumps;
			maxreach=Math.max(maxreach, arr[i]+i);
			steps--;
			if(steps==0)
			{
				jumps++;
				if(i>=maxreach)
					return -1;
				steps=maxreach-i;
			}
		}
		return -1;
	}
}
