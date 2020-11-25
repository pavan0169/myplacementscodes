package queues;

public class QueueInArray 
{
	int[] arr=null;
	int rear;
	int front;
	
	public QueueInArray()
	{
		
	}
	public QueueInArray(int size)
	{
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;
	}
	public boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		if(rear==arr.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void enqueue(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else if(isEmpty())
		{
			front=0;
			arr[rear+1]=value;
			rear++;
		}
		else
		{
			arr[rear+1]=value;
			rear++;
		}
	}
	
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else if(front>rear)
		{
			front=rear=-1;
		}
		else 
		{
			System.out.println(arr[front]);
			front++;
		}
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println(arr[front]);
		}
	}
}
