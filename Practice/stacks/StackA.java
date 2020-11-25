package stacks;

public class StackA 
{
	int arr[]=null;
	int topOfStack;
	
	public StackA(int size)
	{
		this.arr=new int[size];
		this.topOfStack=-1;
	}
	
	public boolean isStackFull() 
	{
		if (topOfStack == arr.length-1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean isStackEmpty()
	{
		if(topOfStack==-1)
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}

	public void push(int value)
	{
		if(isStackFull())
		{
			System.out.println("Stack is full");
		}
		else
		{
			arr[topOfStack+1]=value;
			topOfStack++;
		}
	}
	
	public void pop()
	{
		if(isStackEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(arr[topOfStack]);
			topOfStack--;
		}
	}
	public void peek()
	{
		if(isStackEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(arr[topOfStack]);
		}
	}
	
	public void deleteStack()
	{
		arr=null;
	}

}
