package queues;

public class QueueInLMain 
{
	public static void main(String[] args)
	{
		QueueInL qil=new QueueInL();
		qil.enqueue(10);
		qil.enqueue(20);
		qil.enqueue(30);
		qil.enqueue(40);
		qil.enqueue(50);
		qil.enqueue(60);
		qil.dequeue();
		qil.dequeue();
		qil.dequeue();
		qil.dequeue();
		qil.dequeue();
		qil.dequeue();
		qil.dequeue();
		qil.dequeue();
		System.out.println();
		qil.enqueue(10);
		qil.enqueue(20);
		qil.enqueue(30);
		qil.enqueue(40);
		qil.enqueue(50);
		qil.dequeue();
		qil.dequeue();
		qil.enqueue(60);
		qil.enqueue(70);
		qil.dequeue();
		qil.dequeue();
		qil.enqueue(80);
		qil.enqueue(90);
		qil.dequeue();
		qil.dequeue();
		qil.dequeue();
		qil.dequeue();
	}
}
