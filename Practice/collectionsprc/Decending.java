package collectionsprc;

import java.util.*;
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
			return 0;
	}
}

class Decending {
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add(12);
		t.add(13);
		t.add(1);
		t.add(99);
		t.add(12);
		t.add(2);
		t.add(12);
		t.add(7);
		t.add(73);
		System.out.println(t);
	}
}
