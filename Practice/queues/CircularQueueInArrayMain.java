package queues;

public class CircularQueueInArrayMain 
{
	public static void main(String[] args)
	{
		CircularQueueInArrays cqa= new CircularQueueInArrays(7);
		cqa.enqueue(10);
		cqa.enqueue(20);
		cqa.enqueue(30);
		cqa.enqueue(40);
		cqa.enqueue(50);
		cqa.enqueue(60);
		cqa.enqueue(70);
		cqa.enqueue(80);
		System.out.println();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.enqueue(90);
		cqa.enqueue(100);
		cqa.enqueue(110);
		cqa.enqueue(120);
		cqa.enqueue(120);
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		System.out.println();
		cqa.dequeue();
		
	}
}
