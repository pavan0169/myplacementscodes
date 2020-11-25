package important;

/*package whatever //do not write package name here */

import java.util.*;


public class PythagoreanTriplet {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0)
		{
		    int n=sc.nextInt();
		    
		    HashSet<Integer> arr=new HashSet<>();
		    for(int j=0; j<n; j++)
		    {
		        arr.add(sc.nextInt());
		    }
		    triplet(arr);
		    //System.out.println(trp);
		}
	}
	
	public static void triplet(HashSet<Integer> arr)
	{
	    for(int a: arr)
	    {
	        if(a%2==0)
	        {
	            double d=Math.pow(a/2, 2);
	            int x=(int)(d-1);
	            int y=(int)(d+1);
	            if(arr.contains(x) && arr.contains(y))
	            {
	                System.out.println("Yes");
	                return;
	            }
	        }
	        else if(a%2==1)
	        {
	            double d=Math.pow(a, 2);
	            int x=(int) Math.floor(d/2);
	            int y=(int) Math.ceil(d/2);
	            if(arr.contains(x) && arr.contains(y))
	            {
	                System.out.println("Yes");
	                return;
	            }
	        }
	    }
	    System.out.println("No");
	}
}