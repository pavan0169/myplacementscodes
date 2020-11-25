package sorting;

public class Insertion 
{
	public static void sort(int[] arr)
	{
		for(int i=1; i<arr.length; i++)
		{
			int index=i;
			int value=arr[i];
			while(index>0 &&  arr[index-1]>value)
			{
				arr[index]=arr[index-1];
				index--;
			}
			arr[index]=value;
		}
	}
}
