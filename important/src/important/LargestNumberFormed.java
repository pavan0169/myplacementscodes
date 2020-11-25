package important;


import java.util.*;


public class LargestNumberFormed {
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
		    String num=largestNumber(arr);
		    System.out.println(num);
		}
	}
	
	public static String largestNumber(int[] arr)
	{
	    for(int i=0; i<arr.length; i++)
	    {
	        for(int j=i+1; j<arr.length; j++)
	        {
	            String s1=""+arr[i]+arr[j];
	            String s2=""+arr[j]+arr[i];
	            int a1=Integer.valueOf(s1);
	            int a2=Integer.valueOf(s2);
	            if(a1<a2)
	            {
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	    String out="";
	    for(int i=0; i<arr.length; i++)
	    {
	        out=out+arr[i];
	    }
	    return out;
	}
}