import java.util.*;
public class MaxInArr 
{
	public static int findbig(int[] a)
	{
		int big=a[0];
		for(int i=1; i<a.length;i++)           //O(n-1)      {12,4,6,44,,23,4,55}
		{
			if(big<a[i])
			{
				big=a[i];                         //big=44
			}
		}
		return big;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("NO OF ELEMENTS IN AN ARRAY :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++ )
		{
			System.out.print("Enter the " + i +" element :");
			arr[i]=sc.nextInt();
		}
		System.out.print("Biggest element in an array: ");                     // AAAAABBAAB   //6 PRINT
		System.out.println(findbig(arr));
	}
}
