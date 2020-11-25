package linkedList;
import node.DoubleNode;
public class CircularDoublyLinkedList 
{
	DoubleNode head;
	DoubleNode tail;
	int size;
	
	public DoubleNode getHead() {
		return head;
	}

	public void setHead(DoubleNode head) {
		this.head = head;
	}

	public DoubleNode getTail() {
		return tail;
	}

	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean isDoubleLinkedList()
	{
		return head!=null;
	}
	
	public DoubleNode createDoubleLinkedList(int nodeValue)
	{
		DoubleNode node=new DoubleNode();
		node.value=nodeValue;
		node.prev=node;
		node.next=node;
		head=node;
		tail=node;
		size=1;
		return node;
	}
	
	public void insert(int nodeValue, int location)
	{
		DoubleNode node=new DoubleNode();
		node.value=nodeValue;
		if(!isDoubleLinkedList())
		{
			System.out.println("Not Exist");
		}
		else if(location==0)
		{
			node.prev=tail;
			node.next=head;
			head.prev=node;
			tail.next=head;
			head=node;
		}
		else if(location>=size)
		{
			node.next=head;
			node.prev=tail;
			tail.next=node;
			head.prev=node;
			tail=node;
		}
		else
		{
			DoubleNode tmp=head;
			int index=0;
			while(index<location-1)
			{
				tmp=tmp.next;
				index++;
			}
			node.prev=tmp;
			node.next=tmp.next;
			tmp.next=node;
			node.next.prev=node;
		}
		size=size+1;
	}
	
	
	public void traversal()
	{
		if(!isDoubleLinkedList())
		{
			System.out.println("Not Exist");
		}
		else
		{
			DoubleNode tmp=head;
			for(int i=0; i<getSize(); i++)
			{
				System.out.print(tmp);
				if(i!=getSize()-1)
				{
					System.out.print("-> ");
				}
				tmp=tmp.next;
			}
			System.out.println();
		}
	}
	
	public void traversal(int nodes)
	{
		if(!isDoubleLinkedList())
		{
			System.out.println("Not Exist");
		}
		else
		{
			DoubleNode tmp=head;
			for(int i=0; i<nodes; i++)
			{
				System.out.print(tmp);
				if(i!=nodes-1)
				{
					System.out.print("-> ");
				}
				tmp=tmp.next;
			}
			System.out.println();
		}
	}
	public void ReverseTraversal()
	{
		if(!isDoubleLinkedList())
		{
			System.out.println("Not Exist");
		}
		else
		{
			DoubleNode tmp=tail;
			for(int i=0; i<getSize(); i++)
			{
				System.out.print(tmp);
				if(i!=getSize()-1)
				{
					System.out.print(" <-");
				}
				tmp=tmp.prev;
			}
			System.out.println();
		}
	}

	public void ReverseTraversal(int nodes)
	{
		if(!isDoubleLinkedList())
		{
			System.out.println("Not Exist");
		}
		else
		{
			DoubleNode tmp=tail;
			for(int i=0; i<nodes; i++)
			{
				System.out.print(tmp);
				if(i!=nodes-1)
				{
					System.out.print(" <-");
				}
				tmp=tmp.prev;
			}
			System.out.println();
		}
	}
	
	public void delete(int location)
	{
		if(!isDoubleLinkedList())
		{
			System.out.println("Not Exist");
		}
		else if(location==0)
		{
			head=head.next;
			head.prev=tail;
			tail.next=head;
		}
		else if(location>=getSize())
		{
			tail=tail.prev;
			tail.next=head;
			head.prev=tail;
		}
		else
		{
			DoubleNode tmp=head;
			int index=0;
			while(index<location-1)
			{
				tmp=tmp.next;
				index++;
			}
			tmp.next=tmp.next.next;
			tmp.next.prev=tmp;
		}
		size=size-1;
	}
	
	public void deleteEntireDLL()
	{
		DoubleNode tmp=head;
		for(int i=0; i<getSize(); i++)
		{
			tmp.prev=null;
			tmp=tmp.next;
		}
		head=null;
		tail=null;
	}
	
}
