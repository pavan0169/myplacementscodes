package linkedList;

public class DoublyLinkedListMain 
{
	public static void main(String[] arge)
	{
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.createDoubleLinkedList(0);
		
		dl.insert(5, 1);
		dl.insert(10, 2);
		dl.insert(15, 3);
		dl.insert(25, 4);
		dl.insert(35, 5);
		dl.insert(29, 6);
		dl.insert(40, 7);
		dl.insert(45, 8);
		dl.traversal();
		dl.insert(20, 4);
		dl.traversal();
		dl.insert(30, 6);
		dl.traversal();
		dl.delete(8);
		dl.delete(55);
		dl.traversal();
		dl.ReverseTraversal();
		System.out.println(dl.isDoubleLinkedList());
		dl.deleteEntireDLL();
		System.out.println(dl.isDoubleLinkedList());
	}
}
