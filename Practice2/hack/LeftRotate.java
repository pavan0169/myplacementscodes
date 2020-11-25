package hack;
import java.util.*;
public class LeftRotate 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] out=leftrotate(arr);
		for(int i=0; i<n; i++)
		{
			System.out.print(out[i]);
		}
	}
	
	public static int[] leftrotate(int[] arr)
	{
		int n=arr.length;
		int rotate=arr[0];
		int x = rotate % n;
		
		int[] out=new int[n];
		
		for(int i=0; i<n; i++)
		{
			out[i]=arr[(i + x) % n];
		}
		
		return out;
	}
	
}
