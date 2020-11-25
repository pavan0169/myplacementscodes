package hack;
import java.util.*;

public class PrintMat 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int initial=1;
		int[][] arr=new int[3][a];
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<a; j++)
			{
				if(i==0)
				{
					arr[i][j]=initial;
				}
				else if(i%2==0)
				{
					arr[i][j]=a-initial;
				}
				else
				{
					arr[i][j]=a+initial;
				}
				initial++;
			}
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<a; j++)
			{
				System.out.print(arr[i][j]+" ");
				if(j<a-1)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
