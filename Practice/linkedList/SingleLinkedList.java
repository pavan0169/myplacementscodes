package linkedList;
import node.SingleNode;
public class SingleLinkedList 
{
	public SingleNode head;
	public SingleNode tail;
	public int size;
	
	
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
	
	public boolean existsLinkedList() {
		return head != null;
	}
	
	public int getSize() {
		return size;
	}

	public SingleNode createSLL(int nodeValue)
	{
		SingleNode node=new SingleNode();
		node.data=nodeValue;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return node;
	}
	
	public void insert(int nodeValue, int location)
	{
		SingleNode node=new SingleNode();
		node.data=nodeValue;
		if(!existsLinkedList())
		{
			System.out.println("LinkedList doesnt exist");
			return;
		}
		else if(location==0) //insertion at beginning
		{
			node.setNext(head);
			head=node;
		}
		else if(location>=size)// at end
		{
			tail.next=node;
			node.next=null;
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
	
	public void traversal()
	{
		if(!existsLinkedList())
		{
			System.out.println("LinkedList doesnt exist");
			return;
		}
		else
		{
			SingleNode tempNode = head;
			for (int i = 0; i < getSize(); i++) {
				System.out.print(tempNode);
				if (i != getSize() - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
			System.out.println();
		}
	}
	
	public void search(int nodeValue)
	{
		SingleNode tmp=head;
		for(int i=0; i<getSize(); i++)
		{
			if(tmp.data==nodeValue)
			{
				System.out.println("The value is at :"+i);
			}
			tmp=tmp.next;
		}
	}
	
	public void delete(int location)
	{
		if(location==0)
		{
			head=head.next;
			if(getSize()==0)
			{
				tail=null;
			}
		}
		else if(location>=size)
		{
			SingleNode tmp=head;
			for(int i=0; i<getSize()-1; i++)
			{
				tmp=tmp.next;
			}
			tmp.next=null;
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
	
	public void deleteLinkedList()
	{
		head=null;
		tail=null;
	}
	
}
