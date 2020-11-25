package datastructures;

public class LinkedListMain 
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.createNode(33);
		l.insert(54, 1);
		l.insert(32, 2);
		l.insert(76, 3);
		l.insert(21, 4);
		l.insert(12, 5);
		l.insert(19, 6);
		l.insert(52, 7);
		l.insert(11, 8);
		l.traversal();
		l.reverseLL();
		System.out.println();
		l.traversal();
	}
}
