package hack;

public class CircularQueue 
{
	int[] arr;
	int rear;
	int front;
	public CircularQueue(int size)
	{
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;
	}
	
	public boolean isFull()
	{
		if(front==0 && rear==arr.length-1)
		{
			return true;
		}
		else if(rear+1==front)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1)
		{
			return true;
		}
		return false;
	}
	
	public void enqueue(int value)
	{
		if(isFull())
		{
			System.out.println("Is full");
		}
		else
		{
			rear=(rear+1)%(arr.length-1);
			arr[rear]=value;
		}
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Is Empty");
		}
		else
		{
			System.out.println(arr[front]);
		}
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Is Empty");
		}
		else
		{
			
			System.out.println(arr[front]);
		}
	}
	
	public static void main(String[] args)
	{
		CircularQueue q=new CircularQueue(10);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(16);
		q.enqueue(14);
		q.enqueue(54);
		q.enqueue(64);
		q.enqueue(96);
		q.enqueue(44);
		q.enqueue(10);
		q.enqueue(44);
		q.peek();
	}
}
