package linkedList;
import node.SingleNode;
public class CircularLinkedList 
{
	SingleNode head;
	SingleNode tail;
	int size;
	public SingleNode getHead() {
		return head;
	}
	public void setHead(SingleNode head) {
		this.head = head;
	}
	public SingleNode getTail() {
		return tail;
	}
	public void setTail(SingleNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean existsIsLinkedList() {
		return head != null;
	}
	
	public SingleNode createCLL(int nodeValue)
	{
		SingleNode node=new SingleNode();
		node.data=nodeValue;
		node.next=node;
		head=node;
		tail=node;
		size=1;
		return node;
	}
	
	public void insert(int nodeValue, int location)
	{
		SingleNode node=new SingleNode();
		node.data=nodeValue;
		if(!existsIsLinkedList())
		{
			System.out.println("LinkedList doesnt exist");
			return;
		}
		else if(location==0) //insertion at beginning
		{
			node.next=head;
			tail.next=node;
			head=node;
			
		} 
		else if(location>=size)// at end
		{
			tail.next=node;
			node.next=head;
			tail=node;
		}
		else                     //at middle
		{
			SingleNode tmp=head;
			int index=0;
			while(index<location-1) 
			{
				tmp=tmp.next;
				index++;
			}
			node.next=tmp.next;
			tmp.next=node;
		}
		size=size+1;
	}
	
	public void traversal(int nodes)
	{
		if(!existsIsLinkedList())
		{
			System.out.println("LinkedList doesnt exist");
			return;
		}
		else
		{
			SingleNode tempNode = head;
			for (int i = 0; i < nodes; i++) {
				System.out.print(tempNode);
				if (i != nodes - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
			System.out.println();
		}
	}
	
	public void traversal()
	{
		if(!existsIsLinkedList())
		{
			System.out.println("LinkedList doesnt exist");
			return;
		}
		else
		{
			SingleNode tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode);
				if (i != getSize() - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
			System.out.println();
		}
	}
	
	public void delete(int location)
	{
		if(!existsIsLinkedList())
		{
			System.out.println("LinkedList doesnt exist");
			return;
		}
		else if(location==0)
		{
			head=head.next;
			tail.next=head;
		}
		else if(location>=size)
		{
			SingleNode tmp=head;
			for(int i=0;i<size-1; i++ )
			{
				tmp=tmp.next;
			}
			tmp.next=head;
			tail=tmp;
		}
		else
		{
			SingleNode tmp=head;
			for(int i=0; i<location-1; i++)
			{
				tmp=tmp.next;
			}
			tmp.next=tmp.next.next;
		}
		
		size=size-1;
	}
	
	public void reverseCLL()
	{
		SingleNode pre=tail;
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
	
}
