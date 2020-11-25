package sortings;

public class InsertionSort 
{
	public static void main(String[] args)
	{
		int[] arr= {34,21,5,67,3,2,11,53,22,87,32};
		int temp;
		int j;
		for(int i=1; i<arr.length; i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
}
