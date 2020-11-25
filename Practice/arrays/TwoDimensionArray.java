package arrays;

public class TwoDimensionArray 
{
	int[][] arr=null;
	
	public TwoDimensionArray(int rows, int col)
	{
		arr=new int[rows][col];
		for(int i=0; i<rows; i++)
			for(int j=0; j<col; j++)
			{
				arr[i][j]=-1;
			}
	}
	
	
	public void traverse()
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println();
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	
	public void insert(int row, int col, int value)
	{
		try {
			if(arr[row][col]==-1)
			{
				arr[row][col]=value;
				System.out.println("Successfully inserted " + value + " in the array.");
			}
			else
			{
				System.out.println("Value Already there");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong entry");
		}
	}
	
	public void search(int value)
	{
		for(int i=0; i<arr.length; i++)
			for(int j=0; j<arr[0].length; j++)
			{
				if(arr[i][j]==value)
				{
					System.out.print("Value is founud at location Row:" + i + " & Col:" + j + "\n\n");
					return;
				}
			}
		System.out.print("Value is not found in Array\n");
	}
	
	
	public void delete(int row, int col)
	{
		System.out.println("Deleting value from Row#" + row + " & Col#" + col + "...");
		try {
			System.out.println("Successfully deleted: " + arr[row][col]);
			arr[row][col] = -1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Cant delete the value as cell# provided is not in the range of array !");
			// e.printStackTrace();
		}
	}
}
