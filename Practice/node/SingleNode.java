package node;

public class SingleNode 
{
	public int data;
	public SingleNode next;
	
	public SingleNode()
	{	}
	
	public SingleNode(int data)
	{
		this.data=data;
	}
	
	public int getData() 
	{
		return data;
	}
	public void setData(int data) 
	{
		this.data = data;
	}
	public SingleNode getNext() 
	{
		return next;
	}
	public void setNext(SingleNode next) 
	{
		this.next = next;
	}
	
	public String toString()
	{
		return data+" "; 
	}
}
 