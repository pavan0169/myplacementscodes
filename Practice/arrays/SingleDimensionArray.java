package arrays;

public class SingleDimensionArray 
{
	int[] arr=null;
	
	public SingleDimensionArray(int size)
	{
		arr=new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=-1;
		}
	}
	
	public void traverse()
	{
		try {
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}catch(Exception e)
		{
			System.out.println("Array Not Exist");
		}
		
	}
	
	public void insert(int loc, int value)
	{
		try{
			if(arr[loc]==-1) 
			{
				arr[loc]=value;
				System.out.println("Successfully inserted "+value+" at "+loc);
			}
			else
			{
				System.out.println("Value is already exists");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is out of memory");
		}

	}
	
	public void getElementAt(int loc)
	{
		try {
			System.out.println("The element of that "+loc+" position is :"+arr[loc]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Size is Invalid");
		}
	}
	
	public void search(int ele)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("The Element is at :"+i);
				return;
			}
		}
		System.out.println("The Element is not in range");
	}
	
	public void deleteAt(int loc)
	{
		try {
			arr[loc]=-1;
			System.out.println("Successfully Deleted at :"+loc);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index not in range");
		}
	}
	
	public void deleteArray()
	{
		arr=null;
		System.out.println("Array sucessfully Deleted");
	}
}
