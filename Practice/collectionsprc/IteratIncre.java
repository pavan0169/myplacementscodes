package collectionsprc;
import java.util.*;
public class IteratIncre {
	public static void main(String[] args)
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		l.add(17);
		l.add(18);
		ListIterator<Integer> ltr=l.listIterator();
		while(ltr.hasNext())
		{
			int i=ltr.next();
			i=i+2;
			ltr.set(i);
		}
		System.out.println(l);
	}
}
