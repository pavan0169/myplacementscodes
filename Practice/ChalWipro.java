import java.util.*;
public class ChalWipro 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int w=sc.nextInt();
		int[] arr=new int[s];
		for(int i=0; i<s; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<s; )
		{
			System.out.print("0 ");
			if(arr[i]>=0)
			{
				for(int j=i; j<w; j++)
				{
					if(arr[j]<0)
					{
						System.out.print(arr[j]+" "); 
					}
				}
				i=i+w;
				System.out.print("0 ");
			}
			else if(arr[i]<0)
			{
				System.out.print(arr[i]+" ");
				i++;
			}
		}
		sc.close();
	}
}
