package trees;

public class BinaryTreeArrays 
{
	int[] arr;
	int lastIndex;
	
	public BinaryTreeArrays(int size)
	{
		this.arr=new int[size+1];
		this.lastIndex=0;
	}
	
	boolean isTreeFull(){
		if(arr.length-1 == lastIndex) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insert(int value)
	{
		if(isTreeFull())
		{
			System.out.println("Could not insert value in the Tree as it is full !");
		}
		else
		{
			arr[lastIndex+1]=value;
			lastIndex++;
		}
	}
	
	public void inorderTraversal(int index)
	{
		if(index>lastIndex)
		{
			return;
		}
			inorderTraversal(index*2);
			System.out.print(arr[index]+" ");
			inorderTraversal(index*2+1);
	}
	
	public void preorderTraversal(int index)
	{
		if(index>lastIndex)
		{
			return;
		}
		System.out.print(arr[index]+" ");
		preorderTraversal(index*2);
		preorderTraversal(index*2+1);
	}
	
	public void postorderTraversal(int index)
	{
		if(index>lastIndex)
		{
			return;
		}
		postorderTraversal(index*2);
		postorderTraversal(index*2+1);
		System.out.print(arr[index]+" ");
	}
	
	public void levelorderTraversal()
	{
		for(int i=1; i<=lastIndex; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public void search(int value)
	{
		for(int i=1; i<=lastIndex; i++)
		{
			if(arr[i]==value)
			{
				System.out.println("Value found at :"+ i);
				return;
			}
		}
		System.out.println("Value not found");
	}
	
	public void delete(int value)
	{
		for(int i=1; i<=lastIndex; i++)
		{
			if(arr[i]==value)
			{
				arr[i]=arr[lastIndex];
				lastIndex--;
				return;
			}
		}
		System.out.println("Value not found");
	}
}
