
public class BSort 
{
	public static void bubbleSort(int[] arr) 
	{  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         {
        	 for(int j=1; j < (n-i); j++)
        	 {
        		 if(arr[j-1] > arr[j])
        		 {
        			 temp = arr[j-1];
                     arr[j-1] = arr[j];  
                     arr[j] = temp; 
        		 }
        	 }  
         }
	}
	public static void main(String[] args)
	{
		int[] a= {100,70,90,50,60,10,20,30};
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		bubbleSort(a);
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	
	
}
