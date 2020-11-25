import java.util.*;
public class Arrays1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of elements in array is :");
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		System.out.println("Start entry:");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Insertion Completed");
		System.out.println("List of numbers are....");
		for(int a1:a)
		{
			System.out.println(a1);
			sum+=a1;
		}
		System.out.println("The sum of the numbers are: "+ sum);
	}

}
