package arrays;

public class SingleDimensionArrayMain {
	public static void main(String[] args)
	{
		SingleDimensionArray arr=new SingleDimensionArray(7);
		System.out.println("Array created");
		
		arr.traverse();
		System.out.println("\nArray Printed");
		System.out.println();
		
		arr.insert(0,10);
		arr.insert(1,15);
		arr.insert(2,17);
		arr.insert(3,19);
		arr.insert(4,32);
		arr.insert(5,44);
		arr.insert(6,17);
		arr.insert(3,44); //already inserted
		arr.insert(7,22); //index out of bound
		System.out.println();
		
		arr.traverse();
		System.out.println("\nArray Printed");
		System.out.println();
		
		arr.getElementAt(0);
		arr.getElementAt(3);
		arr.getElementAt(6);
		arr.getElementAt(8);//out of range
		System.out.println();
		
		arr.search(10);
		arr.search(32);
		arr.search(44);
		arr.search(19);
		arr.search(11);//Element is not in range
		System.out.println();
		
		arr.deleteAt(2);
		arr.deleteAt(4);
		arr.deleteAt(6);
		arr.deleteAt(10);//out of range
		System.out.println();
		
		arr.traverse();
		System.out.println("\nArray Printed");
		System.out.println();
		
		arr.deleteArray();
		System.out.println();
		
		arr.traverse();
	}
}
