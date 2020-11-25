package queues;

public class QueueInArrayMain {
	public static void main(String[] args)
	{
		QueueInArray qa=new QueueInArray(10);
		qa.enqueue(10);
		qa.enqueue(30);
		qa.enqueue(42);
		qa.enqueue(14);
		qa.enqueue(23);
		qa.enqueue(63);
		qa.enqueue(21);
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		System.out.println();
		qa.peek();
		qa.enqueue(140);
		qa.enqueue(230);
		qa.enqueue(630);
		qa.enqueue(210);
		qa.enqueue(110);
		qa.enqueue(310);
		qa.enqueue(421);
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
	}

}
