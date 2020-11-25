import java.util.*;
public class PriorityQ 
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(2);
		pq.add(3);
		pq.add(1);
		pq.add(6);
		pq.add(1);
		pq.add(9);
		pq.add(5);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
	}
}
