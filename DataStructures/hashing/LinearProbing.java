package hashing;

public class LinearProbing 
{
	static int size=16;
	static int[] arr=new int[size];
	
	public LinearProbing()
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	public void insert(int value)
	{
		int key=value%size;
		int index=key;
		while(arr[index]!=Integer.MIN_VALUE)
		{
			index=(index+1)%size;
			if(index==key)
			{
				repair(value);
			}
		}
		arr[index]=value;
	}
	
	 void repair(int value)
	{
		int[] temp=new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(" - ");
			temp[i]=arr[i];
		}
		size=size*2;
		arr=new int[size];
		for(int i=0; i<temp.length; i++)
		{
			insert(temp[i]);
		}
		insert(value);
	}
	
	public void search(int value)
	{
		int key=value%size;
		int index=key;
		while(arr[index]!=value)
		{
			index=(index+1)%size;
			if(key==index)
			{
				System.out.println("not exist");
			}
		}
		System.out.println(value+" - "+index);
	}
}
