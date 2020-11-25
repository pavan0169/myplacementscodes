package important;
import java.util.*;
class RainWater 
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0)
		{
		    int n=sc.nextInt();
		    
		    int[] arr=new int[n];
		    for(int j=0; j<n; j++)
		    {
		        arr[j]=sc.nextInt();
		    }
		    int water=trappedWater(arr,n);
		    System.out.println(water);
		}
	}
	
	public static int trappedWater(int[] arr, int n)
	{
	    int i=0;
	    int j=n-1;
	    int leftmax=0;
	    int rightmax=0;
	    int totalwater=0;
	    while(i<=j)
	    {
	        leftmax=Math.max(leftmax, arr[i]);
	        rightmax=Math.max(rightmax, arr[j]);
	        if(leftmax<rightmax)
	        {
	            totalwater=totalwater+(leftmax-arr[i]);
	            i++;
	        }
	        else if(rightmax<=leftmax)
	        {
	            totalwater=totalwater+(rightmax-arr[j]);
	            j--;
	        }
	    }
	    return totalwater;
	}
}