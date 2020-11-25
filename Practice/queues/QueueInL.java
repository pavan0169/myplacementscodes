package queues;
import node.SingleNode;
public class QueueInL 
{
	SingleNode front;
	SingleNode rear;
	
	public QueueInL()
	{
		SingleNode node=null;
		this.front=this.rear=node;
	}
	public boolean isEmpty()
	{
		if(front==null && rear==null)
			return true;
		else 
			return false;
	}
	
	public void enqueue(int value)
	{
		SingleNode node=new SingleNode();
		node.data=value;
		if(front==null)
		{
			node.next=node;
			front=node;
			rear=node;
		}
		else
		{
			node.next=front;
			rear.next=node;
			rear=node;
		}
	}
	
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else if(front==rear)
		{
			System.out.println(front);
			front=rear=null;
		}
		else
		{
			System.out.println(front);
			front=front.next;
			rear.next=front;
		}
	}
}
