package linkedList;

public class CircularDoublyLinkedListMain 
{
	public static void main(String[] args)
	{
		CircularDoublyLinkedList cdl=new CircularDoublyLinkedList();
		cdl.createDoubleLinkedList(10);
		cdl.insert(20, 1);
		cdl.insert(43, 2);
		cdl.insert(24, 3);
		cdl.insert(72, 4);
		cdl.insert(61, 5);
		cdl.insert(58, 6);
		cdl.insert(21, 7);
		cdl.traversal();
		cdl.insert(12, 0);
		cdl.traversal();
		cdl.insert(34, 111);
		cdl.traversal();
		cdl.insert(78, 5);
		cdl.traversal();
		cdl.ReverseTraversal();
		System.out.println();
		cdl.traversal(15);
		cdl.ReverseTraversal(15);
		System.out.println();
		cdl.delete(0);
		cdl.traversal();
		System.out.println();
		cdl.delete(13);
		cdl.traversal();
		System.out.println();
		cdl.delete(4);
		cdl.traversal();
	}
}
