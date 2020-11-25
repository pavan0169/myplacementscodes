package linkedList;

public class SingleLinkedListMain {
	public static void main(String[] args)
	{
		SingleLinkedList l=new SingleLinkedList();
		l.createSLL(5);
		l.insert(10, 1);
		l.insert(20, 2);
		l.insert(30, 3);
		l.insert(40, 4);
		l.insert(50, 5);
		l.insert(5, 1);
		l.insert(0, 0);
		l.traversal();
		l.insert(15, 2);
		l.traversal();
		l.delete(3);
		l.traversal();
		l.deleteLinkedList();
		System.out.println(l.existsLinkedList());
	}

}
