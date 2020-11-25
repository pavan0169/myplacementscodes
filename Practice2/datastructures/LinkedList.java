package datastructures;

class SingleNode
{
	int value;
	SingleNode next;
	SingleNode(){}
	SingleNode(int value)
	{
		this.value=value;
	}
	public String toString()
	{
		return value+" ";
	}
}

public class LinkedList 
{
	SingleNode head;
	SingleNode tail;
	int size;
	
	public SingleNode createNode(int value)
	{
		SingleNode node=new SingleNode();
		node.value=value;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return node;
	}
	
	public void insert(int value, int location)
	{
		SingleNode node=new SingleNode();
		node.value=value;
		if(location==0)
		{
			node.next=head;
			head=node; 
		}
		else if(location>=size)
		{
			node.next=null;
			tail.next=node;
			tail=node;
		}
		else
		{
			SingleNode temp=head;
			for(int i=0; i<location-1; i++)
			{
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
		}
		size=size+1;
	}
	
	public void delete(int location)
	{
		if(location==0)
		{
			head=head.next;
			if(size==0)
			{
				tail=null;
			}
		}
		else if(location>=size)
		{
			SingleNode temp=head;
			for(int i=0; i<size-1; i++)
			{
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
		}
		else
		{
			SingleNode temp=head;
			for(int i=0; i<location-1; i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		size=size-1;
	}
	
	public void reverseLL()
	{
		SingleNode pre=null;
		SingleNode post=null;
		for(int i=0; i<size; i++)
		{
			post=head.next;
			head.next=pre;
			pre=head;
			head=post;
		}
		head=pre;
	}
	public void traversal()
	{
		SingleNode node=head;
		for(int i=0; i<size; i++)
		{
			System.out.print(node);
			node=node.next;
		}
	}
}


