package trees;

public class BinaryHeapMain 
{
	public static void main(String[] args)
	{
		BinaryHeap b=new BinaryHeap(13);
		
		int[] a= {12,86,3,41,15,73,8,54,6,26,43};
		for(int i=0; i<a.length; i++)
		{
			b.insertIntoHeap(a[i]);
		}
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			System.out.print(" ");
			b.extractTop();
		}
	}
}
