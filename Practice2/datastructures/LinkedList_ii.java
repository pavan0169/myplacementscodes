package datastructures;

class Node_1
{
	int value;
	Node_1 next;
	
	public String toString()
	{
		return value+" ";
	}
}

public class LinkedList_ii 
{
	Node_1 head;
	Node_1 tail;
	int size;
	
	public Node_1 CreationOfNode(int value)
	{
		Node_1 node=new Node_1();
		node.value=value;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return node;
	}
	public void insertNode(int value, int location)       //insertNode(22,4);
	{
		Node_1 node=new Node_1();
		node.value=value;
		if(head==null)                  //when there is no element in linkedlist
		{
			node.next=null;
			head=node;
			tail=node;
		}
		else if(location==0)
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
			Node_1 temp=head;
			for(int i=0; i<location-1; i++)
			{
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
		}
		size=size+1;
	}
	
	public void tarversal()
	{
		Node_1 temp=head;
		for(int i=0; i<size; i++)
		{
			System.out.print(temp);
			temp=temp.next;
		}
	}
	public void Delete(int node,int location)

	{}
}
