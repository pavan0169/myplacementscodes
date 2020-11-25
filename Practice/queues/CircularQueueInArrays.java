package queues;

public class CircularQueueInArrays 
{
	int[] arr;
	int front;
	int rear;
	int size;
	
	public CircularQueueInArrays(int size)
	{
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;
		this.size=size;
	}
	public boolean isFull()
	{
		if(front==0 && rear==size-1)
			return true;
		else if(rear+1==front)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1)
			return true;
		else
			return false;
					
	}
	
	public void enqueue(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else if(rear==size-1 && front!=0)
		{
			rear=0;
			arr[rear]=value;
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
		else if(front==rear)
		{
			System.out.println(arr[front]);
			rear=front=-1;	
		}
		else if(front==arr.length-1)
		{
			System.out.println(arr[front]);
			front=0;
		}
		else
		{
			System.out.println(arr[front]);
			front++;
		}
	}
}
