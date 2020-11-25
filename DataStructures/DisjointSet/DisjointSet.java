package DisjointSet;

public class DisjointSet
{
	int[] parent;
	int[] size;
	public DisjointSet(int n)
	{
		parent=new int[n+1];
		size=new int[n+1];
		for(int i=0; i<=n; i++)
		{
			parent[i]=i;
			size[i]=1;
		}
	}
	
	public int find(int p)
	{
		int root=p;
		while(root!=parent[root])
		{
			parent[root]=parent[parent[root]];
			root=parent[root];
		}
		return root;
	}
	
	public void union(int p, int q)
	{
		int rootp=find(p);
		int rootq=find(q);
		if(rootp==rootq)
		{
			return;
		}
		if(size[rootp]<size[rootq])
		{
			parent[rootp]=rootq;
			size[rootq]+=size[rootp];
		}
		else
		{
			parent[rootq]=rootp;
			size[rootp]+=size[rootq];
		}
	}
	
	public int size(int p)
	{
		int root=find(p);
		return size[root];
	}
}

