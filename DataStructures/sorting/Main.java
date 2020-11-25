package sorting;

public class Main 
{
	public static void main(String[] args)
	{
		int[] arr= {0,12,67,100,200,23,98,65,23,6,44,61,1,400};
		Insertion.sort(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
