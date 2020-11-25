package linkedList;

public class CircularLinkedListMain {
	public static void main(String[] args)
	{
		CircularLinkedList cl=new CircularLinkedList();
		cl.createCLL(32);
		cl.insert(21, 1);
		cl.insert(61, 2);
		cl.insert(34, 3);
		cl.insert(27, 4);
		cl.insert(88, 5);
		cl.insert(12, 6);
		cl.insert(34, 7);
		cl.traversal();
		cl.reverseCLL();
		System.out.println();
		cl.traversal();
	}

}
