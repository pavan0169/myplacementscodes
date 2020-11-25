public class LargeNoInArray 
{
	public static void main(String[] args)
	{
		int[] a= {12,16,13,9,2,77,11,95,2};
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i]; 
			}
		}
		System.out.println(max);
	}
}
