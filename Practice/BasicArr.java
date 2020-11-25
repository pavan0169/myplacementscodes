
public class BasicArr {
	public static void main(String[] args)
	{
		int[] arr= {30,10,20,30,40,50};
		int n=arr.length;
		int temp=0;
		System.out.println(n);
		for(int i=0; i<n; i++)// how many time should loop should be run
		{
			for(int j=1; j<(n-i); j++) // to compare the elements in an array
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;
				}	
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
