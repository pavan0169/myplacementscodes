package DisjointSet;

public class Main
{
	public static void main(String[] args)
	{
		DisjointSet set=new DisjointSet(8);
		set.union(1, 8);
		set.union(2,7);
		set.union(1, 7);
		set.union(3, 6);
		set.union(3, 4);
		set.union(3, 5);

		System.out.println(set.find(7)+" - "+set.size(7));
		System.out.println(set.find(1)+" - "+set.size(1));
		System.out.println(set.find(8)+" - "+set.size(8));
		System.out.println(set.find(3)+" - "+set.size(3));
		for(int i=0; i<set.parent.length; i++)
		{
			System.out.print(set.parent[i]+" ");
		}
	}
}

