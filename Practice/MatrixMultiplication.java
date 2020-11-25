import java.util.*;

public class MatrixMultiplication 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of Rows and columns of matrix 1 :");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int[][] mat1=new int [r1][c1];
		for(int i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat1[i].length; j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		
		System.out.print("Enter no. of Rows and columns of matrix 2 :");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int[][] mat2=new int [r2][c2];
		for(int i=0; i<mat2.length; i++)
		{
			for(int j=0; j<mat2[i].length; j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		
		
		sc.close();
		int[][] result=new int[r1][c2];
		
		int sum=0;
		if(c1!=r2)
		{
			System.out.println("Multiplication can't done");
		}
		else
		{
			for(int i=0; i<mat1.length; i++)
			{
				for(int j=0; j<mat2[i].length; j++)
				{
					for(int k=0; k<mat1.length; k++)
					{
						sum=sum+mat1[i][k]*mat2[k][j];
					}
					result[i][j]=sum;
					sum=0;
				}
			}
		}
		
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<result[i].length; j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
