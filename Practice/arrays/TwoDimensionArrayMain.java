package arrays;

public class TwoDimensionArrayMain 
{
	public static void main(String[] args)
	{
		TwoDimensionArray tds=new TwoDimensionArray(3,4);
		tds.traverse();
		System.out.println();
		tds.insert(0, 0, 10);
		tds.insert(0, 1, 20);
		tds.insert(0, 2, 30);
		tds.insert(0, 3, 40);
		tds.insert(1, 0, 60);
		tds.insert(1, 1, 70);
		tds.insert(1, 2, 80);
		tds.insert(1, 3, 90);
		tds.insert(2, 0, 10);
		tds.insert(2, 1, 20);
		tds.insert(2, 2, 30);
		tds.insert(2, 3, 40);
		tds.traverse();
		
		System.out.println();
		tds.search(10);
		tds.search(30);
		tds.search(60);
		tds.search(90);
		System.out.println();
		
		tds.delete(0, 3);
		tds.delete(1, 3);
		tds.delete(2, 3);
		tds.traverse();
		System.out.println();
	}
}
