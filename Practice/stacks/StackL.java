package stacks;
import node.SingleNode;
public class StackL 
{
	public SingleNode top;
	public int size;
	
	public StackL()
	{
		this.top=null;
		size=-1;
	}
	
	public boolean isStackEmpty() 
	{
		if(top==null)
			return true;
		else
			return false;
	}
	public void push(int value)
	{
		SingleNode node=new SingleNode();
		node.data=value;
		node.next=top;
		top=node;
		size++;
	}
	
	public void pop()
	{
		if(isStackEmpty())
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			System.out.println(top);
			top=top.next;
		}
		size--;
	}
	public void peek()
	{
		if(isStackEmpty())
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			System.out.println(top);
		}
	}
	public void deleteStack()
	{
		top=null;
	}
	
}
