package sortings;

public class HeapSortMain 
{
	public static void main(String[] args)
	{
		HeapSort h=new HeapSort(10);
		int[] a= {23,1,45,63,43,3,22,34};
		for(int i=0; i<a.length; i++)
		{
			h.insertIntoHeap(a[i]);
		}
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			System.out.print(" ");
			h.extractTop();
		}
	}
}
